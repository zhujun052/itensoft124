package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.hibernate.Query;
import org.hibernate.Session;

import com.itensoft.Group;
import com.itensoft.GroupManager;
import com.itensoft.ItensoftSession;
import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.OnlineVirtualManager;
import com.itensoft.common.OnlineVirtualManagers;

public class GetOnlineManager extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public GetOnlineManager() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	private Map<String, GroupManager> groupManagers = new HashMap<String, GroupManager>();

	private void getGroupManager(Group group, Session s) {
		String sql = "from GroupManager where GroupCode=?";
		List<GroupManager> list = s.createQuery(sql)
				.setParameter(0, group.getCode()).list();
		for (Iterator<GroupManager> it = list.iterator(); it.hasNext();) {
			GroupManager gm = it.next();
			if (!groupManagers.containsKey(gm.getId().getGroupCode())) {
				groupManagers.put(gm.getId().getVirtualManagerName(), gm);
			}
		}

		if (group.getParentCode() == -1)
			return;

		Group parent = (Group) s.get(Group.class, group.getParentCode());
		if (parent != null)
			getGroupManager(parent, s);
	}

	private Group getGroupByClientId(String ClientId, Session s) {
		Group group = null;

		Query query = s.createQuery("from Group where HardId=?").setParameter(
				0, ClientId);
		List<Group> list = query.list();

		if (!list.isEmpty())
			group = list.get(0);

		return group;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String clientId = request.getParameter("ClientId");

		Collection<OnlineVirtualManagers> collection = ItensoftEnv
				.getOnlineManagers().values();
		Session s = ItensoftSession.getSession();

		Group group = getGroupByClientId(clientId, s);

		if (group == null) {
			out.print("Group [" + clientId + "] not find!");
			out.flush();
			out.close();
			return;
		}

		getGroupManager(group, s);

		Document doc = DocumentHelper.createDocument();
		doc.setXMLEncoding("utf-8");
		Element onlineManager = doc.addElement("OnlineManager");

		for (Iterator<OnlineVirtualManagers> it = collection.iterator(); it
				.hasNext();) {

			OnlineVirtualManagers vmgrs = it.next();

			if (vmgrs.onLine()) {
				Element virtualManager = onlineManager
						.addElement("VirtualManager");
				virtualManager.addAttribute("Name",vmgrs.getManagerName());

				for (Iterator<OnlineVirtualManager> itvmgrs = vmgrs
						.getManagers().values().iterator(); itvmgrs.hasNext();) {
					OnlineVirtualManager manager = itvmgrs.next();
					if (manager.onLine()) {
						Element detail = virtualManager.addElement("Detail");
						String ip = manager.getIp();
						if (!((null == ip) | ("".equals(ip))))
							detail.addElement("Ip").setText(ip);

						String port = manager.getPort();
						if (!((null == port) | ("".equals(port))))
							detail.addElement("Port").setText(port);
					}
				}

			}
		}

		out.print(doc.asXML());
		// System.out.println(doc.asXML());
		out.flush();
		out.close();
		ItensoftSession.closeSession();
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
