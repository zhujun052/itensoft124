package com.itensoft.action.admin;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itensoft.Group;
import com.itensoft.GroupControlProgram;
import com.itensoft.GroupControlProgramId;
import com.itensoft.GroupIdentity;
import com.itensoft.GroupIdentityId;
import com.itensoft.GroupManager;
import com.itensoft.GroupManagerId;
import com.itensoft.GroupRecver;
import com.itensoft.GroupRecverId;
import com.itensoft.ItensoftSession;
import com.itensoft.bean.common.Message;
import com.itensoft.bean.easyui.ListBean;
import com.itensoft.model.Cert;
import com.itensoft.service.CertService;

@Controller
@RequestMapping(value = "admin/controlprogram")
public class CertController extends BaseController{

	CertService certService;
	@Resource(name="certService")
	public void setCertService(CertService certService) {
		this.certService = certService;
	}
	
	@RequestMapping(value = "/getAvailableIdentityList", method = RequestMethod.GET)
	@ResponseBody
	public String getAvailableIdentityList(int code){
		List<Cert> list = this.certService.getAvailableIdentityList(code);
		ListBean bean = new ListBean();
		bean.setTotal(list.size());
		bean.setRows(list);
		return objToJson(bean);
	}
	
	@RequestMapping(value = "/getSelectedIdentityList", method = RequestMethod.GET)
	@ResponseBody
	public String getSelectedIdentityList(int code){
		List<Cert> list = this.certService.getSelectedIdentityList(code);
		ListBean bean = new ListBean();
		bean.setTotal(list.size());
		bean.setRows(list);
		return objToJson(bean);
	}
	
	@RequestMapping(value = "/getAvailableRecverList", method = RequestMethod.GET)
	@ResponseBody
	public String getAvailableRecverList(int code){
		List<Cert> list = this.certService.getAvailableRecverList(code);
		ListBean bean = new ListBean();
		bean.setTotal(list.size());
		bean.setRows(list);
		return objToJson(bean);
	}
	
	@RequestMapping(value = "/getSelectedRecverList", method = RequestMethod.GET)
	@ResponseBody
	public String getSelectedRecverList(int code){
		List<Cert> list = this.certService.getSelectedRecverList(code);
		ListBean bean = new ListBean();
		bean.setTotal(list.size());
		bean.setRows(list);
		return objToJson(bean);
	}
	
	
	@RequestMapping(value = "/postControlSoftware", method = RequestMethod.POST)
	@ResponseBody
	public String postControlSoftware(@RequestParam("code") String code,@RequestParam("controlJsonString") String controlJsonString) throws JSONException {
		Message msg = new Message();
		String result = "";
		final String groupCode =code;
		if ((controlJsonString == null) | ("".equals(controlJsonString))){
			msg.setMessage("受控软件编辑成功！");
			msg.setType("true");
		}
		

		JSONObject jsObj = new JSONObject(controlJsonString);
		// System.out.println(controlJsonString);

		Map<Integer, GroupControlProgram> map = getGroupControlSoftware(groupCode);

		final Session s = ItensoftSession.getSession();
		Transaction tx = s.beginTransaction();
		try {
			for (Iterator<String> it = jsObj.keys(); it.hasNext();) {
				String key = it.next();

				JSONArray array = jsObj.getJSONArray(key);
				for (int i = 0; i < array.length(); i++) {
					JSONObject obj = array.getJSONObject(i);
					Integer programCode = obj.getInt("softwarecode");
					Integer encrypto = obj.getInt("encryptomode");
					String printable = obj.getBoolean("printable") ? "T" : "F";

					GroupControlProgram gc = map.get(programCode);
					if (gc == null) {
						if ((0 == encrypto) && ("F".equals(printable)))
							continue;
						// TODO new gc
						GroupControlProgramId id = new GroupControlProgramId(
								Integer.parseInt(groupCode), programCode);
						gc = new GroupControlProgram(id);
						gc.setEncryptMode(encrypto.toString());
						gc.setPrintControled(printable);
						s.save(gc);
					} else {
						if ((0 == encrypto) && ("F".equals(printable)))
							s.delete(gc);
						else {
							gc.setEncryptMode(encrypto.toString());
							gc.setPrintControled(printable);
							s.update(gc);
						}
					}

					s.flush();
				}
				// System.out.println(array.toString());
			}

			s.doWork(new Work() {

				@Override
				public void execute(Connection arg0) throws SQLException {
					int gCode = Integer.parseInt(groupCode);
					String sql = "{call dbo.sp_GenGroupFinalControlProgram(?)}";
					CallableStatement p = arg0.prepareCall(sql);
					p.setInt(1, gCode);
					p.execute();
				}
			});
			Group g = (Group) s.get(Group.class, Integer.parseInt(groupCode));
			if ((g != null) && (g.getId() != null)) {
				if (g.getRefreshId() == null) {
					g.setRefreshId(1);
				} else {
					g.setRefreshId(g.getRefreshId() + 1);
				}
				s.update(g);
			}

			genGroupFinalControlSoftware(s, Integer.parseInt(groupCode));
			s.flush();
			tx.commit();
			msg.setMessage("受控软件编辑成功！");
			msg.setType("true");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			msg.setMessage("受控软件编辑失败！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	private Map<Integer, GroupControlProgram> getGroupControlSoftware(
			String groupCode) {
		Session s = ItensoftSession.getSession();
		String hsql = "from GroupControlProgram where GroupCode=?";
		List<GroupControlProgram> list = s.createQuery(hsql)
				.setInteger(0, Integer.parseInt(groupCode)).list();
		Map<Integer, GroupControlProgram> map = new HashMap<Integer, GroupControlProgram>();

		for (Iterator<GroupControlProgram> it = list.iterator(); it.hasNext();) {
			GroupControlProgram gc = it.next();
			if (!map.containsKey(gc.getId().getProgramCode()))
				map.put(gc.getId().getProgramCode(), gc);
		}
		return map;
	}
	
	protected void genGroupFinalControlSoftware(Session s, Integer gc) {
		Query query = s.createQuery("from Group where parentCode = ?");
		query.setParameter(0, gc);
		List<Group> list = query.list();

		for (final Group group : list) {
			if (group.getInheritPlainProgram().equals("T")) {
				s.doWork(new Work() {

					@Override
					public void execute(Connection arg0) throws SQLException {
//						String sql = "{call dbo.sp_GenGroupFinalControlSoftware(?)}";
						String sql = "{call dbo.sp_GenGroupFinalControlProgram(?)}";
						PreparedStatement p = arg0.prepareCall(sql);
						p.setInt(1, group.getCode());
						p.execute();
					}
				});
				if (group.getId() != null) {
					if (group.getRefreshId() == null) {
						group.setRefreshId(1);
					} else {
						group.setRefreshId(group.getRefreshId() + 1);
					}
					s.update(group);
				}

				genGroupFinalControlSoftware(s, group.getCode());
			}
		}
	}

	
	  
	@RequestMapping(value = "/postGroupManager", method = RequestMethod.POST)
	@ResponseBody
	public String postGroupManager(@RequestParam("groupCode") int groupCode,@RequestParam("userlist") String userlist) throws JSONException{
		Message msg = new Message();
		
		String result = "";
		final Session s = ItensoftSession.getSession();

		if (("".equals(userlist.trim())) | (userlist == null)) {
			Transaction tx = s.beginTransaction();
			try {
				final Integer gc = groupCode;
				s.doWork(new Work() {
					@Override
					public void execute(Connection conn) throws SQLException {
						String sql = "delete from GroupManager where GroupCode=?";
						CallableStatement p = conn.prepareCall(sql);
						p.setInt(1, gc);
						p.execute();

						sql = "{call dbo.sp_GenGroupFinalVirtualManager(?)}";
						p = conn.prepareCall(sql);
						p.setInt(1, gc);
						p.execute();
					}
				});
				Group g = (Group) s.get(Group.class, gc);
				if ((g != null) && (g.getId() != null)) {
					if (g.getRefreshId() == null) {
						g.setRefreshId(1);
					} else {
						g.setRefreshId(g.getRefreshId() + 1);
					}
					s.update(g);
				}
				genGroupFinalvirtualManager(s, gc);
				s.flush();
				tx.commit();
				result = "{success:true,info:{}}";
			} catch (Exception e) {
				tx.rollback();
				e.printStackTrace();
				result = null;
				// result = "{success:false,info:{error:'" + e.getMessage() +
				// "'}}";
			}
		} else {
			// 当前选择的manager
			JSONArray array = new JSONArray(userlist);
			List<String> current_mgrs = new ArrayList<String>();
			for (int i = 0; i < array.length(); i++) {
				JSONObject obj = array.getJSONObject(i);
				current_mgrs.add(obj.getString("name"));
			}
			Transaction tx = s.beginTransaction();
			try {

				// 得到当前数据库中的manager,如果不存在于current_mgrs中，删除，反之，保存到map中
				Query query = s.createQuery(
						"from GroupManager where GroupCode=?").setParameter(0,
								groupCode);
				List<GroupManager> list = query.list();

				Map<String, GroupManager> map = new HashMap<String, GroupManager>();
				for (Iterator<GroupManager> it = list.iterator(); it.hasNext();) {
					GroupManager gm = it.next();
					if (!(current_mgrs.contains(gm.getId()
							.getVirtualManagerName())))
						s.delete(gm);
					else
						map.put(gm.getId().getVirtualManagerName(), gm);
				}

				// 检查current_mgrs的项目是否存在于map中，如果不存在，那么加入
				for (Iterator<String> it = current_mgrs.iterator(); it
						.hasNext();) {
					String mgrName = it.next();
					if (!(map.containsKey(mgrName))) {
						GroupManagerId id = new GroupManagerId(
								groupCode, mgrName);
						GroupManager mgr = new GroupManager(id);
						s.save(mgr);
					}
				}
				s.flush();

				final Integer gc = groupCode;
				s.doWork(new Work() {
					@Override
					public void execute(Connection arg0) throws SQLException {
						String sql = "{call dbo.sp_GenGroupFinalVirtualManager(?)}";
						PreparedStatement p = arg0.prepareCall(sql);
						p.setInt(1, gc);
						p.execute();
					}
				});

				Group g = (Group) s.get(Group.class, gc);
				if ((g != null) && (g.getId() != null)) {
					if (g.getRefreshId() == null) {
						g.setRefreshId(1);
					} else {
						g.setRefreshId(g.getRefreshId() + 1);
					}
					s.update(g);
				}

				// 为该group下所有的group重新gengroupfinalvirtualmanager
				genGroupFinalvirtualManager(s, gc);
				s.flush();
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
				e.printStackTrace();
				result = null;
				msg.setMessage("审批者编辑失败！");
				msg.setType("false");
				return objToJson(msg);
				// result = "{success:false,info:{error:'" + e.getMessage() +
				// "'}}";
			}
		}
		msg.setMessage("审批者编辑成功！");
		msg.setType("true");
		return objToJson(msg);
	}
	
	protected void genGroupFinalvirtualManager(Session s, Integer gc) {
		Query query = s.createQuery("from Group where parentCode = ?");
		query.setParameter(0, gc);
		List<Group> list = query.list();

		for (final Group group : list) {
			if ((group.getInheritVirtualManager() != null)
					&& (group.getInheritVirtualManager().equals("T"))) {
				s.doWork(new Work() {

					@Override
					public void execute(Connection arg0) throws SQLException {
						String sql = "{call dbo.sp_GenGroupFinalVirtualManager(?)}";
						PreparedStatement p = arg0.prepareCall(sql);
						p.setInt(1, group.getCode());
						p.execute();
					}
				});
				if (group.getId() != null) {
					if (group.getRefreshId() == null) {
						group.setRefreshId(1);
					} else {
						group.setRefreshId(group.getRefreshId() + 1);
					}
					s.update(group);
				}
				genGroupFinalvirtualManager(s, group.getCode());
			}
		}
	}
	
	
	@RequestMapping(value = "/PostRecver", method = RequestMethod.POST)
	@ResponseBody
	public String PostRecver(@RequestParam("groupcode") int groupcode,@RequestParam("selectedlist") String selectedlist){
		Message msg = new Message();
		Session s = ItensoftSession.getSession();
		try {
			Transaction tx = s.beginTransaction();
			try {
				Integer groupCode = groupcode;

				String selectedRecverString = selectedlist;

				if ("".equals(selectedRecverString)) {
					DeleteRecver(groupCode, s);
				} else {

					JSONArray jsArray = new JSONArray(selectedRecverString);

					// 先取原有的recver,与递交过来的selectedRecver做比较，如果不存在于selected中，那么删除，
					// 如果selected不在原有之中，那么新增
					List<String> selectedIds = new ArrayList<String>();

					for (int i = 0; i < jsArray.length(); i++) {
						JSONObject jo = jsArray.getJSONObject(i);
						selectedIds.add(jo.getString("code"));
					}
					
					PostRecver(groupCode, selectedIds, s);

				}
				tx.commit();
				msg.setMessage("接收者编辑成功！");
				msg.setType("true");
			} catch (Exception ex) {
				msg.setMessage("接收者编辑失败！");
				msg.setType("true");
				tx.rollback();
			}
		} finally {
			if (s != null)
				s.close();
		}
		return objToJson(msg);
	}
	
	private void PostRecver(final Integer groupCode, List<String> selectedId, Session s) throws Exception{
		Query query = s
				.createQuery("from GroupRecver where GroupCode=?");
		query.setParameter(0, groupCode);
		List<GroupRecver> groupRecverList = query.list();
		List<String> currentIds = new ArrayList<String>();
		for (GroupRecver gr : groupRecverList) {
			if (!selectedId.contains(gr.getId().getCertId()))
				s.delete(gr);
			else
				currentIds.add(gr.getId().getCertId());
		}

		for (String id : selectedId) {
			if (!currentIds.contains(id)) {
				GroupRecverId grid = new GroupRecverId(groupCode,
						id);
				GroupRecver gr = new GroupRecver(grid);
				s.save(gr);
			}
		}
		s.flush();
		
		s.doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				String sql = "{call dbo.sp_GenGroupFinalRecver(?)}";
				PreparedStatement ps = arg0.prepareStatement(sql);
				ps.setInt(1, groupCode);	
				ps.execute();
			}
		});
				
		query = s.createQuery("from Group where parentCode=?").setParameter(0, groupCode);
		List<Group> groupList = query.list();
		for(Group group:groupList){
			PostRecver(group.getCode(), selectedId, s);
		}
		
	}
	
	private void DeleteRecver(final Integer groupCode, Session s) throws Exception{
		Query query = s.createQuery("delete from GroupRecver where GroupCode=?");
		query.setParameter(0, groupCode);
		query.executeUpdate();
		s.flush();
		s.doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				String sql = "{call dbo.sp_GenGroupFinalRecver(?)}";
				PreparedStatement ps = arg0.prepareStatement(sql);
				ps.setInt(1, groupCode);	
				ps.execute();
			}
		});
				
		query = s.createQuery("from Group where parentCode=?").setParameter(0, groupCode);
		List<Group> groupList = query.list();
		for(Group group:groupList){
			DeleteRecver(group.getCode(), s);
		}
		
	}
	
	@RequestMapping(value = "/postIdentity", method = RequestMethod.POST)
	@ResponseBody
	public String postIdentity(int groupcode,String selectedlist){
		Message msg = new Message();
		Session s = ItensoftSession.getSession();
		try {
			Transaction tx = s.beginTransaction();
			try {
				Integer groupCode = groupcode;

				String selectedIdentityString = selectedlist;

				if ("".equals(selectedIdentityString.trim())) {
					DeleteIdentity(groupCode, s);
				} else {
					JSONArray jsArray = new JSONArray(selectedIdentityString);

					// 先取原有的identity,与递交过来的selectedIdentity做比较，如果不存在于selected中，那么删除，
					// 如果selected不在原有之中，那么新增
					List<String> selectedIds = new ArrayList<String>();

					for (int i = 0; i < jsArray.length(); i++) {
						JSONObject jo = jsArray.getJSONObject(i);
						selectedIds.add(jo.getString("code"));
					}
					
					PostIdentity(groupCode, selectedIds, s);

				}
				s.flush();				
				tx.commit();
				msg.setMessage("身份编辑成功！");
				msg.setType("true");
			} catch (Exception ex) {
				tx.rollback();
				msg.setMessage("身份编辑失败！");
				msg.setType("false");
			}

		} finally {
			if (s != null)
				s.close();
		}
		return objToJson(msg);
	}
	
	
	private void PostIdentity(final Integer groupCode, List<String> selectedId, Session s) throws Exception{
		Query query = s
				.createQuery("from GroupIdentity where GroupCode=?");
		query.setParameter(0, groupCode);
		List<GroupIdentity> groupIdentityList = query.list();
		List<String> currentIds = new ArrayList<String>();
		for (GroupIdentity gi : groupIdentityList) {
			if (!selectedId.contains(gi.getId().getCertId()))
				s.delete(gi);
			else
				currentIds.add(gi.getId().getCertId());
		}

		for (String id : selectedId) {
			if (!currentIds.contains(id)) {
				GroupIdentityId gid = new GroupIdentityId(
						groupCode, id);
				GroupIdentity gi = new GroupIdentity(gid);
				s.save(gi);
			}
		}
		
		s.flush();
		s.doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				String sql = "{call dbo.sp_GenGroupFinalIdentity(?)}";
				PreparedStatement ps = arg0.prepareStatement(sql);
				ps.setInt(1, groupCode);	
				ps.execute();
			}
		});
		
		query = s.createQuery("from Group where parentCode=?").setParameter(0, groupCode);
		List<Group> groupList = query.list();
		for(Group group:groupList){
			PostIdentity(group.getCode(),selectedId, s);
		}		
		
	}
	
	private void DeleteIdentity(final Integer groupCode, Session  s) throws Exception{
		Query query = s.createQuery(
				"delete from GroupIdentity where GroupCode=?")
				.setParameter(0, groupCode);
		query.executeUpdate();	
		s.flush();
		s.doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				String sql = "{call dbo.sp_GenGroupFinalIdentity(?)}";
				PreparedStatement ps = arg0.prepareStatement(sql);
				ps.setInt(1, groupCode);	
				ps.execute();
			}
		});
		
		query = s.createQuery("from Group where parentCode=?").setParameter(0, groupCode);
		List<Group> groupList = query.list();
		for(Group group:groupList){
			DeleteIdentity(group.getCode(), s);
		}			
	}
	
}
