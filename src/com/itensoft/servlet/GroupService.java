package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.itensoft.Group;
import com.itensoft.GroupControlProgram;
import com.itensoft.GroupControlProgramId;
import com.itensoft.GroupIdentity;
import com.itensoft.GroupManager;
import com.itensoft.GroupManagerId;
import com.itensoft.GroupRecver;
import com.itensoft.GroupRecverId;
import com.itensoft.ItensoftSession;
import com.itensoft.Policy;
import com.itensoft.common.UTF8String;

public class GroupService extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public GroupService() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String gc = request.getParameter("gc");
		// if(gc != null)
		// gc = UTF8String.toString(gc);
		/**
		 * 用于group选择manager,因为与virtualmanager.js中共用了createGrid函数，其中传递了
		 * vm参数名,而此处是使用groupCode,因此把vm赋值给gc
		 */
		String vm = request.getParameter("vm");
		if (vm != null)
			vm = UTF8String.toString(vm);
		if ((!"".equals(vm)) & (!(vm == null)))
			gc = vm;

		String method = request.getParameter("Method");

		if ((gc == null) | ("".equals(gc)) | (method == null)
				| ("".equals(method))) {
			out.print("{success:false,info:{error:'Group code or method name error'}}");
			out.flush();
			out.close();
			return;
		}
		String r = "";
		try {
			if ("postControlSoftware".equals(method))
				r = postControlSoftware(request);
			else if ("GetSelectManager".equals(method))
				r = getSelectManager(gc);
			else if ("GetAvailableManager".equals(method))
				r = getAvailableManager(gc);
			else if ("postGroupManager".equals(method)) {
				String userList = request.getParameter("selectuserlist");
				r = postGroupManager(gc, userList);
			} else if ("AuditedGroup".equals(method)) {
				r = auditedGroup(gc);
			} else if ("deleteGroup".equals(method))
				r = deleteGroup(gc);
			else if ("ChangeGroup".equals(method))
				r = ChangeGroup(request);

		} catch (Exception e) {
			r = "{success:false, info:{error:'" + e.getMessage() + "'}}";
		}
		out.print(r);
		out.flush();
		out.close();
	}

	private String ChangeGroup(HttpServletRequest request) {
		final Integer groupCode = Integer.parseInt(request.getParameter("gc"));
		Integer targetCode = Integer.parseInt(request
				.getParameter("targetNode"));
		String dropType = request.getParameter("dropType");
		Session s = ItensoftSession.getSession();
		try {
			if ("append".equals(dropType)) {
				Group group = (Group) s.get(Group.class, groupCode);
				if (group == null) {
					return "";
				}
				Transaction tx = s.beginTransaction();
				try {
					group.setParentCode(targetCode);
					s.save(group);

					List<GroupRecver> groupRecverList = s
							.createQuery("from GroupRecver where groupCode=?")
							.setParameter(0, groupCode).list();
					for (GroupRecver gr : groupRecverList) {
						s.delete(gr);
					}

					List<GroupIdentity> groupIdentityList = s
							.createQuery("from GroupIdentity where groupCode=?")
							.setParameter(0, groupCode).list();
					for (GroupIdentity gi : groupIdentityList) {
						s.delete(gi);
					}

					s.flush();

					s.doWork(new Work() {

						public void execute(Connection arg0)
								throws SQLException {
							String sql = "{call dbo.sp_GenGroupFinalRecver(?)}";
							PreparedStatement ps = arg0.prepareStatement(sql);
							ps.setInt(1, groupCode);
							ps.execute();

							sql = "{call dbo.sp_GenGroupFinalIdentity(?)}";
							ps = arg0.prepareStatement(sql);
							ps.setInt(1, groupCode);
							ps.execute();
						}
					});
					
					tx.commit();
					return "{success:true}";
				} catch (Exception ex) {
					tx.rollback();
					ex.printStackTrace();
					return "{success:false, msg:'" + ex.getMessage() + "'}";
				}

			} else
				return "{success:true}";
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	private String deleteGroup(String groupCode) {
		String r = "";
		Session s = ItensoftSession.getSession();
		final Group g = (Group) s.get(Group.class, Integer.parseInt(groupCode));
		if (g == null)
			return "{success:false,info:{error:'Group not exists!'}}";
		final Integer gc = Integer.parseInt(groupCode);
		Transaction tx = s.beginTransaction();
		try {
			// Policy p = g.getPolicy();
			// s.delete(p);
			// s.delete(g);
			s.doWork(new Work() {
				@Override
				public void execute(Connection arg0) throws SQLException {
					String sql = "delete from [Group] where Code=?";
					CallableStatement call = arg0.prepareCall(sql);
					call.setInt(1, gc);
					call.execute();

					sql = "delete from Policy where Code=?";
					call = arg0.prepareCall(sql);
					call.setInt(1, g.getPolicy().getCode());
					call.execute();

					sql = "delete from GroupManager where GroupCode=?";
					call = arg0.prepareCall(sql);
					call.setInt(1, gc);
					call.execute();

					sql = "delete from GroupRecver where GroupCode=?";
					call = arg0.prepareCall(sql);
					call.setInt(1, gc);
					call.execute();

					sql = "delete from GroupIdentity where GroupCode=?";
					call = arg0.prepareCall(sql);
					call.setInt(1, gc);
					call.execute();

					sql = "delete from GroupFinalRecver where GroupCode=?";
					call = arg0.prepareCall(sql);
					call.setInt(1, gc);
					call.execute();

					sql = "delete from GroupFinalManager where GroupCode=?";
					call = arg0.prepareCall(sql);
					call.setInt(1, gc);
					call.execute();

					sql = "delete from GroupFinalIdentity where GroupCode=?";
					call = arg0.prepareCall(sql);
					call.setInt(1, gc);
					call.execute();

					sql = "delete from GroupFinalControlProgram where GroupCode=?";
					call = arg0.prepareCall(sql);
					call.setInt(1, gc);
					call.execute();

					sql = "delete from GroupFinalBlackProgram where GroupCode=?";
					call = arg0.prepareCall(sql);
					call.setInt(1, gc);
					call.execute();

					sql = "delete from GroupControlProgram where GroupCode=?";
					call = arg0.prepareCall(sql);
					call.setInt(1, gc);
					call.execute();

					sql = "delete from GroupBlackProgram where GroupCode=?";
					call = arg0.prepareCall(sql);
					call.setInt(1, gc);
					call.execute();
				}
			});

			s.flush();

			tx.commit();
			r = "{success:true,info:''}";

		} catch (Exception e) {
			tx.rollback();
			r = "{success:false,error:'" + e.getMessage() + "'";
			e.printStackTrace();
		}

		return r;
	}

	private void auditedGroup(Integer groupCode, Session s) {
		Query query = s.createQuery("from Group where ParentCode=?")
				.setParameter(0, groupCode);
		List<Group> list = query.list();
		for (Iterator<Group> it = list.iterator(); it.hasNext();) {
			Group g = it.next();
			g.setAudited("T");
			s.save(g);
			// s.flush();
			auditedGroup(g.getCode(), s);
		}
	}

	private String auditedGroup(String groupCode) {
		String r = "";
		Session s = ItensoftSession.getSession();
		Group g = (Group) s.get(Group.class, Integer.parseInt(groupCode));
		if (g == null)
			return "{success:false,info:{error:'Group not exists!'}}";

		Transaction tx = s.beginTransaction();
		try {
			if (("".equals(g.getId())) || (g.getId() == null)) {
				auditedGroup(g.getCode(), s);
			}

			g.setAudited("T");
			s.save(g);
			s.flush();

			tx.commit();
			r = "{success:true,info:''}";

		} catch (Exception e) {
			tx.rollback();
			r = "{success:false,error:'" + e.getMessage() + "'";
			e.printStackTrace();
		}

		// s.close();

		return r;
	}

	private String postGroupManager(String groupCode, String userlist)
			throws JSONException {
		String result = "";
		final Session s = ItensoftSession.getSession();

		if (("".equals(userlist.trim())) | (userlist == null)) {
			Transaction tx = s.beginTransaction();
			try {
				final Integer gc = Integer.parseInt(groupCode);
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
						Integer.parseInt(groupCode));
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
								Integer.parseInt(groupCode), mgrName);
						GroupManager mgr = new GroupManager(id);
						s.save(mgr);
					}
				}
				s.flush();

				final Integer gc = Integer.parseInt(groupCode);
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
				result = "{success:true,info:{}}";
			} catch (Exception e) {
				tx.rollback();
				e.printStackTrace();
				result = null;
				// result = "{success:false,info:{error:'" + e.getMessage() +
				// "'}}";
			}
		}
		return result;
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

	protected void genGroupFinalControlSoftware(Session s, Integer gc) {
		Query query = s.createQuery("from Group where parentCode = ?");
		query.setParameter(0, gc);
		List<Group> list = query.list();

		for (final Group group : list) {
			if (group.getInheritPlainProgram().equals("T")) {
				s.doWork(new Work() {

					@Override
					public void execute(Connection arg0) throws SQLException {
						String sql = "{call dbo.sp_GenGroupFinalControlSoftware(?)}";
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

	private String getAvailableManager(String groupCode) {
		String result = "";
		Session s = ItensoftSession.getSession();
		String sql = "select a.Name,a.Name Name1 from VirtualManager a where not (a.Name in(select VirtualManagerName from GroupManager where GroupCode=?))";
		SQLQuery query = s.createSQLQuery(sql);
		query.setParameter(0, Integer.parseInt(groupCode));
		List<Object[]> list = query.list();

		for (Iterator<Object[]> it = list.iterator(); it.hasNext();) {
			Object[] obj = it.next();
			String temp = "{name:'" + obj[0].toString().trim() + "'}";
			if ("".equals(result))
				result = temp;
			else
				result += "," + temp;
		}

		result = "{root:[" + result + "]}";
		// System.out.print(result);
		return result;
	}

	private String getSelectManager(String groupCode) {
		Session s = ItensoftSession.getSession();
		String hsql = "from GroupManager where GroupCode=?";
		Integer gc = Integer.parseInt(groupCode);
		Query query = s.createQuery(hsql);
		query.setParameter(0, gc);

		String result = "";

		List<GroupManager> list = query.list();
		for (Iterator<GroupManager> it = list.iterator(); it.hasNext();) {
			GroupManager m = it.next();
			String temp = "{name:'" + m.getId().getVirtualManagerName() + "'}";
			if ("".equals(result))
				result = temp;
			else
				result += "," + temp;
		}

		result = "{root:[" + result + "]}";

		// System.out.print(result);

		return result;
	}

	private String postControlSoftware(HttpServletRequest request)
			throws JSONException {
		String result = "";
		final String groupCode = request.getParameter("gc");
		String controlJsonString = request.getParameter("cs");
		if ((controlJsonString == null) | ("".equals(controlJsonString)))
			return "{success:true,info:{}}";

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
			result = "{success:true, info:{}}";
			System.out.print(result);
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			result = "{success:false, info:{error:'" + e.getMessage() + "'}}";
		}
		return result;
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

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
