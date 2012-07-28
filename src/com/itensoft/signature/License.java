package com.itensoft.signature;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
//import org.dom4j.DocumentHelper;
import org.dom4j.io.SAXReader;

public class License {

	private Document doc;

	private Element root;

	public License() {
		SAXReader reader = new SAXReader();
		try {
			String path = this.getClass().getResource("").getPath().replaceAll("%20", " ");
			doc = reader.read(new File(path + "license.xml"));
			root = doc.getRootElement();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	public String getKey(){
		return root.element("Key").getText();
	}
}