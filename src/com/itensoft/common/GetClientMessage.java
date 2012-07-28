package com.itensoft.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.itensoft.ClientMessage;
import com.itensoft.ItensoftSession;

public class GetClientMessage {
	public String getNewMessage(String ClientId, String StartDate,
			String EndDate) throws ParseException {
		return getMessage(ClientId, "F", StartDate, EndDate);
	}

	public String getAllMessage(String ClientId, String StartDate,
			String EndDate) throws ParseException {
		return getMessage(ClientId, "", StartDate, EndDate);
	}

	private String getMessage(String ClientId, String Readed, String StartDate,
			String EndDate) throws ParseException {
		Session s = ItensoftSession.getSession();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Criteria criteria = s.createCriteria(ClientMessage.class);
		criteria.add(Restrictions.eq("CId", ClientId));
		if ("F".equals(Readed))
			criteria.add(Restrictions.eq("RD", "F"));
		if ("T".equals(Readed))
			criteria.add(Restrictions.eq("RD", "T"));

		if ((!(StartDate == null)) && (!"".equals(StartDate))) {

			Date startDate = sdf.parse(StartDate);
			criteria.add(Restrictions.gt("RQ", startDate));
		}

		if ((!(EndDate == null)) && (!"".equals(EndDate))) {
			Date endDate = sdf.parse(EndDate);
			criteria.add(Restrictions.lt("RQ", endDate));
		}

		Document doc = DocumentHelper.createDocument();
		doc.setXMLEncoding("utf-8");
		Element messages = doc.addElement("ClientMessage");

		Transaction tx = s.beginTransaction();
		try {

			for (Iterator<ClientMessage> it = criteria.list().iterator(); it
					.hasNext();) {
				ClientMessage msg = it.next();
				Element message = messages.addElement("Message");

				message.addElement("Code").setText(
						msg.getMessageId().toString());
				message.addElement("From").setText(
						msg.getFrom() == null ? "" : msg.getFrom());
				message.addElement("FromRole").setText(
						msg.getFromRole() == null ? ""
								: msg.getFromRole().toString()); //(msg.getFromRole() == 0 ? "审核" : "解密"));
				message.addElement("Next").setText(
						msg.getNext() == null ? "" : msg.getNext());
				// Action:0解密、1打包、2调整权限、3消息（未用）
				if (msg.getAction() == null)
					message.addElement("Action").setText("");
				else
					message.addElement("Action").setText(msg.getAction().toString());
					
					/*
					switch (msg.getAction()) {
					case 0:
						message.addElement("Action").setText("解密");
						break;
					case 1:
						message.addElement("Action").setText("打包");
						break;
					case 2:
						message.addElement("Action").setText("调整权限");
						break;
					case 3:
						message.addElement("Action").setText("消息");
						break;
					default:
						message.addElement("Action").setText("未定义");
						break;
					}*/

				message.addElement("SessionId").setText(
						msg.getSessionId() == null ? "" : msg.getSessionId());
				message.addElement("Result").setText(
						msg.getResult() == null ? ""
								:  msg.getResult().toString());//(msg.getResult() == 0 ? "拒绝" : "同意"));
				message.addElement("Note").setText(
						msg.getNote() == null ? "" : msg.getNote());
				message.addElement("DateTime").setText(sdf.format(msg.getRQ()));
				msg.setRD("T");
				s.update(msg);
				s.flush();
			}
			
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
			ex.printStackTrace();
			ItensoftSession.closeSession();
			return ex.getMessage();
		}

		ItensoftSession.closeSession();

		return doc.asXML();

	}
}
