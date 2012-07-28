package com.itensoft.common;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class DocerMessageHelper
{
	public static String message2XML(List<Object[]> list)
	{
		Document doc = DocumentHelper.createDocument();
		doc.setXMLEncoding("utf-8");
		Element msgs = doc.addElement("DocerMessage");
		//System.out.println(list.size());
		//for (Iterator<Object[]> it = list.iterator(); it.hasNext();)
		for(Object[] obj : list)
		{
			//Object[] obj = it.next();
			Element msg = msgs.addElement("Message");
			msg.addElement("Code").setText(obj[0] == null ? "": obj[0].toString());
			msg.addElement("ClientId").setText(obj[1]== null ? "":obj[1].toString());
			msg.addElement("ClientName").setText(obj[2] == null ? "":obj[2].toString());
			msg.addElement("VirtualManager").setText(obj[3] == null ?"":obj[3].toString());
			msg.addElement("SessionId").setText(obj[4] == null ?"":obj[4].toString());
			msg.addElement("Type").setText(obj[5] == null ? "":obj[5].toString());
			msg.addElement("Note").setText(obj[6] == null ? "":obj[6].toString());
			msg.addElement("Status").setText(obj[7] == null ? "0":obj[7].toString());
		}

		return doc.asXML();
	}	
}
