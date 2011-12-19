package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.itensoft.ItensoftSession;
import com.itensoft.Log;

public class DownloadProcessLog extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DownloadProcessLog() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	private StringBuffer getLogData(String userName, String startDate,
			String endDate, String manager, String docer) {
		Session s = ItensoftSession.getSession();
		StringBuffer r = new StringBuffer();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d HH:mm:ss");
		try {
			Date start = null;
			Date end = null;
			if (startDate != "")
				start = sdf.parse(startDate);

			if (endDate != "")
				end = sdf.parse(endDate);

			Criteria criteria = s.createCriteria(Log.class);

			if (!"".equals(userName))
				criteria.add(Restrictions.eq("UserName", userName));
			if (manager != "")
				criteria.add(Restrictions.eq("VirtualManager", manager));
			if (docer != "")
				criteria.add(Restrictions.eq("Docer", docer));
			if (startDate != "")
				criteria.add(Restrictions.gt("RQ1", start));
			if (endDate != "")
				criteria.add(Restrictions.lt("RQ1", end));

			String tmp;
			for (Iterator<Log> it = criteria.list().iterator(); it.hasNext();) {
				tmp = "";
				Log log = it.next();
				tmp +=  log.getXM() + ",";
				tmp += (log.getSessionId() == null ?"":log.getSessionId()) + ",";
				tmp += (log.getRQ1() == null?"": sdf.format(log.getRQ1())) + ",";
				tmp += (log.getAction() == null ?"":log.getAction()) + ",";
				tmp += (log.getReason1() == null ?"": log.getReason1()) + ",";
				tmp += (log.getVM() == null ?"":log.getVM() )+ ",";
				tmp += (log.getRQ2() == null ?"": sdf.format(log.getRQ2())) + ",";
				tmp += (log.getResult1() == null ?"":log.getResult1()) + ",";
				tmp += (log.getReason2() == null ? "":log.getReason2()) + ",";
				tmp += (log.getDC() == null ?"": log.getDC() )+ ",";
				tmp += (log.getRQ3() == null ?"":sdf.format(log.getRQ3())) + ",";
				tmp += (log.getResult2() == null ?"":log.getResult2()) + ",";
				tmp += (log.getReason3()== null ?"": log.getReason3());
				r.append(tmp);
				r.append("\r\n");
			}

			//ItensoftSession.closeSession();
			//return r;

		} catch (Exception e) {
			e.printStackTrace();
			r.append(e.getMessage());
		}
		ItensoftSession.closeSession();
		return r;
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		//PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("username");
		String manager = request.getParameter("manager");
		String docer = request.getParameter("docer");
		String startDate = request.getParameter("startdate");
		String endDate = request.getParameter("enddate");
		
		StringBuffer bf = getLogData(userName, startDate, endDate, manager, docer);
		
        response.setContentType("application/x-msdownload");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_M_d_HH_mm_ss");
        String fileName = sdf.format(new Date()) + ".cvs";
        response.addHeader("Content-Disposition","attachment;filename=" + fileName);        

        ServletOutputStream sos = response.getOutputStream();
        sos.write(bf.toString().getBytes());
        

        sos.close();
		
		
				
		
		//out.flush();
		//out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
