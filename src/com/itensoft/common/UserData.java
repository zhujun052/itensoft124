package com.itensoft.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;

import com.itensoft.Group;
import com.itensoft.GroupFinalControlProgram;
import com.itensoft.ItensoftSession;
import com.itensoft.Policy;
import com.itensoft.GroupFinalPolicy;

@SuppressWarnings("unchecked")
public class UserData {

	private Session s = ItensoftSession.getSession();

	public UserData() {

	}

	private String SplitDuplicationStr(String spec) {
		if (spec == null)
			return "";
		String result = "";
		String[] rs = spec.split(";");

		for (int i = 0; i < rs.length; i++) {
			if (result == "")
				result = rs[i].trim();
			else
				result += "," + rs[i].trim();
		}
		return result;
	}

	private String UDiskMode2Text(byte UDiskMode) {
		byte UDiskInMode = (byte) (UDiskMode >> 4);
		byte UDiskOutMode = (byte) ((byte) (UDiskMode << 4) >> 4);

		String result = "";
		switch (UDiskInMode) {
		case 0:
			result = "拷入允许  ";
			break;
		case 1:
			result = "拷入加密  ";
			break;
		case 2:
			result = "拷入禁止  ";
			break;
		}

		switch (UDiskOutMode) {
		case 0:
			result += "拷出允许";
			break;
		case 1:
			result += "拷出加密";
			break;
		case 2:
			result += "拷出禁止";
			break;
		}

		return result;
	}

	/*
	 * 获取节点的最终策略显示*
	 */
	public String getUserInfo(Integer groupCode) {
		Group group = (Group) s.get(Group.class, groupCode);
		if (group == null) {
			ItensoftSession.closeSession();
			return "";
		}
		GroupFinalPolicy fp = new GroupFinalPolicy(group, s);

		String info="";
		String state="";
		
		if ((group.getId()!=null) && (!group.getId().equals(""))){
			info = "[{text:'信息',leaf:false,children:[";
			info += "{text:'IP地址: " + "',leaf:true},";
			info += "{text:'机器名: " + "',leaf:true},";
			info += "{text:'Mac: " + "',leaf:true}]},";
		}
		else {
			info ="[";
		}
		info += "{text:'策略',leaf:false,children:[";
		state = "T".equals(fp.getLogUdiskOp()) ? "开启" : "关闭";
		info += "{text:'U盘日志：" + state + "',leaf:true},";
		state = "T".equals(fp.getLogPrint()) ? "开启" : "关闭";
		info += "{text:'打印日志：" + state + "',leaf:true},";
		state = "T".equals(fp.getUseBlackList()) ? "开启" : "关闭";
		info += "{text:'使用黑名单：" + state + "', leaf:true},";
		state = "T".equals(fp.getNeedKey()) ? "开启" : "关闭";
		info += "{text:'需要离线加密狗：" + state + "',leaf:true},";
		if ((fp.getOfflineTime() == null) || (fp.getOfflineTime()==0)){
			state = "无限";
		}
		else if (fp.getOfflineTime()==-1){
			state="不可离线｜温和";
		}
		else if (fp.getOfflineTime()==-1){
			state="不可离线｜激进";
		}
		else{
			state=String.valueOf(fp.getOfflineTime());
		}
		info += "{text:'允许离线时间：" + state + "',leaf:true},";
		state = SplitDuplicationStr(fp.getPreviewSpec());
		info += "{text:'Explorer中需要预览的文件类型：" + state + "',leaf:true},";
		state = "T".equals(fp.getPrintControled()) ? "开启" : "关闭";
		info += "{text:'禁止打印：" + state + "',leaf:true},";
		short UDiskMode = fp.getUdiskMode();
		state = UDiskMode2Text((byte) UDiskMode);
		info += "{text:'U盘控制模型：" + state + "',leaf:true},";

/*		boolean autoBackup = "T".equals(policy.getAutoBackup());
		state = autoBackup ? "开启" : "关闭";
		if (autoBackup) {
			info += "{text:'自动备份：" + state + "',leaf:false,children:[";
			info += "{text:'备份类型："
					+ SplitDuplicationStr(policy.getBackupSpec())
					+ "',leaf:true},";
			info += "{text:'备份数量：" + policy.getBackupCount().toString()
					+ "',leaf:true}]},";
		} else {
			info += "{text:'自动备份：" + state + "',leaf:true},";
		}
*/
		state = "T".equals(fp.getSpoolsv()) ? "开启" : "关闭";
		info += "{text:'虚拟打印保护：" + state + "',leaf:true},";
		state = "T".equals(fp.getClipboardControled()) ? "开启" : "关闭";
		info += "{text:'复制粘贴保护：" + state + "', leaf:true},";
		state = "T".equals(fp.getDragdropControled()) ? "开启" : "关闭";
		info += "{text:'拖放保护：" + state + "', leaf:true},";
		state = "T".equals(fp.getSnapShotControled()) ? "开启" : "关闭";
		info += "{text:'抓屏保护：" + state + "', leaf: true},";
		state = "T".equals(fp.getOlecontroled()) ? "开启" : "关闭";
		info += "{text:'OLE插入保护：" + state + "', leaf: true},";
		state = "T".equals(fp.getOverlayIcon()) ? "开启" : "关闭";
		info += "{text:'加密文件加锁显示：" + state + "', leaf: true}]},";
		
		info += "{text:'身份',leaf:false,children:[";
		String hsql = "select Cert.Name from Cert left join GroupFinalIdentity as gfi on Cert.Id = gfi.CertId "
				+ " where gfi.GroupCode="
				+ groupCode.toString();
		List<Object> list = s.createSQLQuery(hsql).list();
		state ="";
		for (Iterator<Object> it = list.iterator(); it.hasNext();)
		{
			Object objs = it.next();
			state +="{text:'"+objs.toString()+"',leaf:true}";
			if (it.hasNext()){
				state +=",";
			}
		}
		info =info +state+ "]},";
		
		info += "{text:'接受者',leaf:false,children:[";
		hsql = "select Cert.Name, gfr.ReadOnly, gfr.PrintCount from Cert left join GroupFinalRecver as gfr on Cert.Id = gfr.CertId "
				+ " where gfr.GroupCode="
				+ groupCode.toString();
		List<Object[]> list2 = s.createSQLQuery(hsql).list();
		state ="";
		for (Iterator<Object[]> it = list2.iterator(); it.hasNext();)
		{
			Object[] objs = it.next();
			state +="{text:'"+objs[0].toString()+"',leaf:true}";
			if (it.hasNext()){
				state +=",";
			}
		}
		info =info +state+ "]},";
		
		info += "{text:'受控软件',leaf:false, children:[";
		info = info +"]},";

		info += "{text:'审批者',leaf:false,children:[";
		hsql = "select VirtualManagerName from GroupFinalManager where GroupCode="
				+ groupCode.toString();
		List<Object> list4 = s.createSQLQuery(hsql).list();
		state ="";
		for (Iterator<Object> it = list4.iterator(); it.hasNext();)
		{
			Object objs = it.next();
			state +="{text:'"+objs.toString()+"',leaf:true}";
			if (it.hasNext()){
				state +=",";
			}
		}
		info =info +state+ "]}]";

		ItensoftSession.closeSession();
		return info;

	}

	public String getUserTree(String parent, Set<String> onlineUser) {
		String result = "";
		
		List<Group> list = s.createQuery("from Group where ParentCode=?")
				.setParameter(0, Integer.parseInt(parent)).list();
		
		for(Group g: list) {			

			String name = g.getName();
			if(name != null)
				if(name.contains("\\"))
				{
					name = name.replace("\\", "\\\\");
				}
			if (result == "")
				result = "{text:'" + name + "',id:'" + g.getCode() + "'";
			else
				result += ",{text:'" + name + "',id:'" + g.getCode()
						+ "'";
			if (("".equals(g.getId())) || (g.getId() == null)) {
				result += ",leaf:false,expanded:false,icon:'images/group_user16.png'";
			} else {
				result += ",leaf:true,";

				if (onlineUser.contains(g.getId())) {
					if ("T".equals(g.getAudited()))
						result += "icon:'images/user_properties16.png'";
					else
						result += "icon:'images/user_male16.png'";
				} else {
					if ("T".equals(g.getAudited()))
						result += "icon:'images/user_properties16_d.png'";
					else
						result += "icon:'images/user_male16_d.png'";
				}
			}

			result += "}";
		}

		result = "[" + result + "]";
		 System.out.println(result);
		// ItensoftSession.closeSession();

		return result;
	}

	/**
	*获取节点的当前设置
	**/
	public String getUserProperty(Integer groupCode) {
		String result = "";
		Group group = (Group) s.get(Group.class, groupCode);

		if (group == null) {
			ItensoftSession.closeSession();
			return "";
		}

		Policy policy = group.getPolicy();
		result += "\"code\":" + groupCode.toString();
		result += ",\"inherited-from-parent\":"
				+ ("T".equals(group.getInheritSet()) ? "true" : "false");
		result += ",\"udisklog\":"
				+ ("T".equals(policy.getLogUdiskOp()) ? "true" : "false");
		result += ",\"printlog\":"
				+ ("T".equals(policy.getLogPrint()) ? "true" : "false");
		result += ",\"useblacklist\":"
				+ ("T".equals(policy.getUseBlackList()) ? "true" : "false");
		result += ",\"printcontroled\":"
				+ ("T".equals(policy.getPrintControled()) ? "true" : "false");
		result += ",\"usbkey\":"
				+ ("T".equals(policy.getNeedKey()) ? "true" : "false");
		String onlineMode = "" ;//= policy.getOfflineTime().toString();
		if((policy.getOfflineTime() == null)){
			onlineMode = "0";
			result += ",\"onlinemodel\":" + onlineMode;
		}
		else 
		{
			switch(policy.getOfflineTime())
			{
			case 0:
				onlineMode = "0";
				break;
			case -1:;
			case -2:
				onlineMode = policy.getOfflineTime().toString();
				break;
			default:
				onlineMode = "0";
				break;
			}
			result += ",\"onlinemodel\":" + onlineMode;
			if(policy.getOfflineTime() >= 0)
				result += ",\"validatetime\":" + policy.getOfflineTime().toString();
		}
		
		
		/**
		 * 不能直接返回含有\n的字符串，将\n替换成<br/>
		 * ,到客户端再将<br/>
		 * 替换成\n
		 **/
		result += ",\"explorerpreview\":'"
				+ (policy.getPreviewSpec() == null ? "" : policy
						.getPreviewSpec()).replace("\n", "<br/>") + "'";
		// online mode
		byte UDiskMode = (byte) policy.getUdiskMode();
		byte UDiskInMode = (byte) (UDiskMode >> 4);
		byte UDiskOutMode = (byte) ((byte) (UDiskMode << 4) >> 4);

		result += ",\"usbin\":" + String.valueOf(UDiskInMode);
		result += ",\"usbout\":" + String.valueOf(UDiskOutMode);

		result += ",\"printcontroledex\":"
				+ ("T".equals(policy.getPrintControledEx()) ? "true" : "false");
		result += ",\"clipboardcontroled\":"
				+ ("T".equals(policy.getClipboardControled()) ? "true"
						: "false");
		result += ",\"dragdropcontroled\":"
				+ ("T".equals(policy.getDragdropControled()) ? "true" : "false");
		result += ",\"snapshotcontroled\":"
				+ ("T".equals(policy.getSnapShotControled()) ? "true" : "false");
		result += ",\"olecontroled\":"
				+ ("T".equals(policy.getOlecontroled()) ? "true" : "false");
		result += ",\"overlayicon\":"
				+ ("T".equals(policy.getOverlayIcon()) ? "true" : "false");
		result += ",\"ftpaddress\":'"
				+ (policy.getFtp() == null ? "" : policy.getFtp().trim());
		result += "',\"ftpuser\":'"
				+ (policy.getFtpUserName() == null ? "" : policy
						.getFtpUserName().trim());
		result += "',\"ftppass\":'"
				+ (policy.getFtpPassword() == null ? "" : policy
						.getFtpPassword().trim()) + "'";

		result = "{success:true,data:{" + result + "}}";
		System.out.print(result);
		// System.out.println(result);
		ItensoftSession.closeSession();
		return result;
	}

	private byte getUsbMode(byte in, byte out) {
		byte result = (byte) (in << 4);
		result = (byte) (result | out);

		return result;
	}
	
	protected void changeSubRefreshId(Session s, Integer gc) {
		Query query = s.createQuery("from Group where parentCode = ?");
		query.setParameter(0, gc);
		List<Group> list = query.list();
		
		for(final Group group: list){
			if (group.getInheritSet().equals("T")){			
				if (group.getId() != null) {
					if (group.getRefreshId() == null) {
						group.setRefreshId(1);
					} else {
						group.setRefreshId(group.getRefreshId() + 1);
					}
					s.update(group);
				}
				changeSubRefreshId(s, group.getCode());
			}
		}		
	}
	
	public String setUserProperty(Map<String, String> paramValues) {
		// Set<String> keys = paramValues.keySet();

		String strCode = paramValues.get("code");
		if (("".equals(strCode)) | (strCode == null))
			return "{success:false,errors:{'用户识别号错误'}}";

		Session s = ItensoftSession.getSession();

		Group g = (Group) s.get(Group.class, Integer.parseInt(strCode));
		g.setInheritSet(paramValues.containsKey("inherited-from-parent") ? "T": "F");
		if (g.getId() != null) {
			if (g.getRefreshId() == null) {
				g.setRefreshId(1);
			} else {
				g.setRefreshId(g.getRefreshId() + 1);
			}
		}
		
		Policy p = g.getPolicy();
		p.setLogUdiskOp(paramValues.containsKey("udisklog") ? "T" : "F");
		p.setLogPrint(paramValues.containsKey("printlog") ? "T" : "F");
		p.setNeedKey(paramValues.containsKey("usbkey") ? "T" : "F");
		p.setPrintControled(paramValues.containsKey("printcontroled") ? "T": "F");
		p.setPrintControledEx(paramValues.containsKey("printcontroledex") ? "T": "F");
		p.setClipboardControled(paramValues.containsKey("clipboardcontroled") ? "T": "F");
		p.setDragdropControled(paramValues.containsKey("dragdropcontroled") ? "T": "F");
		p.setSnapShotControled(paramValues.containsKey("snapshotcontroled") ? "T": "F");
		p.setOlecontroled(paramValues.containsKey("olecontroled") ? "T" : "F");
		p.setOverlayIcon(paramValues.containsKey("overlayicon") ? "T" : "F");
		p.setPreviewSpec(paramValues.get("explorerpreview"));
		byte usbin = (byte) Integer.parseInt(paramValues.get("usbin"));
		byte usbout = (byte) Integer.parseInt(paramValues.get("usbout"));
		p.setUdiskMode(getUsbMode(usbin, usbout));
		String ftpUser = paramValues.get("ftpuser");
		String ftpAddress = paramValues.get("ftpaddress");
		String ftpPassword = paramValues.get("ftppass");
		p.setFtp(ftpAddress);
		p.setFtpUserName(ftpUser);
		p.setFtpPassword(ftpPassword);

		String result = "";
		Transaction tx = s.beginTransaction();
		try {
			s.update(g);
			s.update(p);
			changeSubRefreshId(s, g.getCode());
			s.flush();
			tx.commit();
			result = "{success:true,errors:{}}";
		} catch (Exception e) {
			tx.rollback();
			result = "{success:false,errors:{'" + e.getMessage() + "'}}";
		}

		ItensoftSession.closeSession();
		return result;
	}
}
