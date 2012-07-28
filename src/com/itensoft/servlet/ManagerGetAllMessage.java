package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.itensoft.Group;
import com.itensoft.ItensoftSession;
import com.itensoft.ManagerMessage;
import com.itensoft.common.UTF8String;

public class ManagerGetAllMessage extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public ManagerGetAllMessage()
	{
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy()
	{
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
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("UserName");
		if (userName!=null){
			userName=UTF8String.toString(userName);
		}
		String startDateTime = request.getParameter("StartDateTime");
		String stopDateTime = request.getParameter("StopDateTime");
		String orderby = request.getParameter("OrderbyDateTime");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try
		{
			 Date dateStart = sdf.parse(startDateTime);
			 Date dateEnd = sdf.parse(stopDateTime);

			String sql = "select a.SessionId, a.ClientId, a.Reason,a.Action,b.Name,a.Code,a.Status "
					+ "from ManagerMessage a left join [Group] b on a.ClientId=b.Hardid "
					+ "where a.ManagerName=? and ([DateTime] between ? and ?) ";
			if ("DESC".equals(orderby))
				sql += "order by [DateTime] DESC";
			else
				sql += "order by [DateTime] ASC";

			Session s = ItensoftSession.getSession();
			SQLQuery query = s.createSQLQuery(sql);
			query.setParameter(0, userName);
			query.setParameter(1, dateStart);
			query.setParameter(2, dateEnd);
			List<Object[]> list = query.list();

			Document doc = DocumentHelper.createDocument();
			doc.setXMLEncoding("utf-8");
			Element msgs = doc.addElement("ManagerMessage");
			for (Iterator<Object[]> it = list.iterator(); it.hasNext();)
			{
				Object[] mmsg = it.next();
				Element msg = msgs.addElement("Message");
				Integer code = Integer.parseInt(mmsg[5].toString());
				msg.addElement("Code").setText(code.toString());
				msg.addElement("ClientId").setText(mmsg[1].toString());
				msg.addElement("ClientName").setText( mmsg[4] == null?"":mmsg[4].toString());
				msg.addElement("SessionId").setText( mmsg[0].toString());
				msg.addElement("Type").setText( mmsg[3].toString());
				msg.addElement("Note").setText( mmsg[2].toString());
				msg.addElement("Status").setText(mmsg[6].toString());
			}
			out.print(doc.asXML());

		} catch (Exception e)
		{
			e.printStackTrace();
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
	public void init() throws ServletException
	{
		// Put your code here
	}

}
