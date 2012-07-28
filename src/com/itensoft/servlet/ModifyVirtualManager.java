package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itensoft.ItensoftSession;
import com.itensoft.VirtualManager;
import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.UTF8String;

public class ModifyVirtualManager extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ModifyVirtualManager() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String managerName = request.getParameter("name");
		if(managerName != null)
			managerName = UTF8String.toString(managerName);

		if (!((managerName == null) |  "".equals(managerName))) {
			Session s = ItensoftSession.getSession();

			VirtualManager vm = (VirtualManager) s.get(VirtualManager.class,
					managerName);
			if (!(vm == null)) {
				String json = "{\"name\":'" + vm.getName() + "'}";
				json = "{success:true,data:" + json + "}";
				out.print(json);

				// System.out.println(json);
			}
		}

		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String managerName = request.getParameter("name");

		if (!((managerName == null) |  ("".equals(managerName)))) {
			Session s = ItensoftSession.getSession();

			VirtualManager vm = (VirtualManager) s.get(VirtualManager.class,
					managerName);
			boolean newvm = vm == null;
			if (vm == null)
				vm = new VirtualManager(managerName);

			String user = request.getParameter("user1");
			String priority = request.getParameter("priority1");
			if (user.trim().equals(""))
			{
				vm.setUser1(null);
				vm.setPriority1(null);
			}
			else
			{
				vm.setUser1(user.trim());
				if(priority == null)
					vm.setPriority1(null);
				else
					vm.setPriority1(Integer.parseInt(priority));
			}

			user = request.getParameter("user2");
			priority = request.getParameter("priority2");
			if (user.trim().equals("")){
				vm.setUser2(null);
				vm.setPriority2(null);
			}
			else{
				
				vm.setUser2(user.trim());
				
				if(priority == null)
					vm.setPriority2(null);
				else
					vm.setPriority2(Integer.parseInt(priority));
			}

			user = request.getParameter("user3");
			priority = request.getParameter("priority3");
			if (user.trim().equals("")){
				vm.setUser3(null);
				vm.setPriority3(null);
			}
			else{
				vm.setUser3(user.trim());
				if(priority == null)
					vm.setPriority3(null);
				else
					vm.setPriority3(Integer.parseInt(priority));
			}

			user = request.getParameter("user4");
			priority = request.getParameter("priority4");
			if (user.trim().equals("")){
				vm.setUser4(null);
				vm.setPriority4(null);
			}
			else{
				vm.setUser4(user.trim());
				if(priority == null)
					vm.setPriority4(null);
				else
					vm.setPriority4(Integer.parseInt(priority));
			}

			user = request.getParameter("user5");
			priority = request.getParameter("priority5");
			if (user.trim().equals("")){
				vm.setUser5(null);
				vm.setPriority5(null);
			}
			else{
				vm.setUser5(user.trim());
				if(priority == null)
					vm.setPriority5(null);
				else
					vm.setPriority5(Integer.parseInt(priority));
			}

			user = request.getParameter("user6");
			priority = request.getParameter("priority6");
			if (user.trim().equals("")){
				vm.setUser6(null);
				vm.setPriority6(null);
			}
			else{
				vm.setUser6(user.trim());
				if(priority == null)
					vm.setPriority6(null);
				else
					vm.setPriority6(Integer.parseInt(priority));
			}
			
			user = request.getParameter("user7");
			priority = request.getParameter("priority7");
			if (user.trim().equals("")){
				vm.setUser7(null);
				vm.setPriority7(null);
			}
			else{
				vm.setUser7(user.trim());
				if(priority == null)
					vm.setPriority7(null);
				else
					vm.setPriority7(Integer.parseInt(priority));
			}

			user = request.getParameter("user8");
			priority = request.getParameter("priority8");
			if (user.trim().equals("")){
				vm.setUser8(null);
				vm.setPriority8(null);
			}
			else{
				vm.setUser8(user.trim());
				if(priority == null)
					vm.setPriority8(null);
				else
					vm.setPriority8(Integer.parseInt(priority));
			}
			
			Transaction tx = s.beginTransaction();
			try {
				if (newvm)
					s.save(vm);
				else
					s.update(vm);
				s.flush();
				tx.commit();
				ItensoftEnv.reloadOnlineVirtualManagers();
				out.print("{success:true,info:'Virtual manager saved!'}");
			} catch (Exception e) {
				tx.rollback();
				out.print("{success:false,error:'" + e.getMessage());
				response.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);
			}
		}
		out.flush();
		out.close();
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
