package com.itensoft.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.itensoft.ClientLog;
import com.itensoft.ItensoftSession;
import com.itensoft.ManagerLog;
import com.itensoft.ServerLog;

public class LogFactory {
	private String logType;
	private Criteria criteria;
	private Session session;
	private String startDate;
	private String endDate;
	private String user;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d HH:mm:ss");
	
	public LogFactory(String logType, String user, String startDate,
			String endDate) {
		this.logType = logType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.user = user;

	}

	private void createCriteria() throws ParseException {
		session = ItensoftSession.getSession();
		if ("client".equals(logType))
			criteria = session.createCriteria(ClientLog.class);
		else if ("manager".equals(logType))
			criteria = session.createCriteria(ManagerLog.class);
		else
			criteria = session.createCriteria(ServerLog.class);
		
		if (user != "")
			criteria.add(Restrictions.eq("HardId", user));

		if (startDate != "")
			criteria.add(Restrictions.gt("RQ", sdf.parse(startDate)));

		if (endDate != "")
			criteria.add(Restrictions.lt("RQ", sdf.parse(endDate)));

	}
	@SuppressWarnings("unchecked")
	private String getClientLog()
	{
		String r = "";//"{root:[";
		
		Iterator<ClientLog> it = criteria.list().iterator();
		String tmp;
		
		while(it.hasNext()){
			ClientLog log = it.next();
			tmp = "{DateTime:'" + sdf.format(log.getRQ()) + "',";
			if (r == "")
				r += tmp;
			else
				r += "," + tmp;
			
			tmp = "UserName:'" + log.getHardId() + "',";
			r += tmp;
			
			tmp = "Action:'" + log.getAction() + "',";
			r += tmp;
			
			tmp = "FileName:'" + log.getFileName() + "'}";
			r += tmp;
		}
		r = "{root:[" + r + "]}";		
		return r;
	}
	
	@SuppressWarnings("unchecked")
	private String getManagerLog()
	{
		String r="";
		Iterator <ManagerLog> it = criteria.list().iterator();
		String tmp;		
				
		while (it.hasNext()){
			ManagerLog log = it.next();
			tmp = "{DateTime:'" + sdf.format(log.getRQ()) + "',";
			if(r == "")
				r = tmp;
			else
				r += "," + tmp;
			
			tmp = "Manager:'" + log.getHardId() + "',";
			r += tmp;
			
			tmp = "UserName:'" + log.getUserName() + "',";
			r += tmp;
			
			tmp = "Action:'" + log.getAction() + "',";
			r += tmp;
			
			tmp = "FileName:'" + log.getFileName() + "',";
			r += tmp;
			
			tmp = "Reason:'" + log.getReason() + "'}";
			r += tmp;
			
		}
		r = "{root:[" + r + "]}";
		
		return r;
	}
	
	@SuppressWarnings("unchecked")
	private String getServerLog()
	{
		String r="";
		Iterator<ServerLog> it =criteria.list().iterator();
		
		String tmp;		
		while(it.hasNext())
		{
			ServerLog log = it.next();
			tmp = "{DateTime:'" + sdf.format(log.getRQ()) + "',";
			if(r == "")
				r = tmp;
			else
				r += "," + tmp;
			
			tmp = "UserName:'" + log.getUserName() + "',";
			r += tmp;
			
			tmp = "Event:'" + log.getEvent() + "',";
			r += tmp;
			
			tmp = "Note:'" + log.getNote() + "'}";
			r += tmp;
		}
		r = "{root:[" + r + "]}";
	
		return r;
	}
	
	private String getLog()
	{
		if("client".equals(logType))
			return getClientLog();
		else if ("manager".equals(logType))
			return getManagerLog();
		else
			return getServerLog();
	}

	public String toString() {
		try
		{
			createCriteria();
			String log = getLog();
			//ItensoftSession.closeSession();
			return log;
		}catch(Exception e)
		{
			e.printStackTrace();
			return "";
		}

	}

}
