package com.itensoft.signature;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
//import org.dom4j.DocumentHelper;
import org.dom4j.io.SAXReader;

public class Signature {

	private Document doc;

	private Element root;

	public Signature() {
		SAXReader reader = new SAXReader();
		try {
			String path = this.getClass().getResource("").getPath().replaceAll("%20", " ");
			doc = reader.read(new File(path + "signature.xml"));
			root = doc.getRootElement();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	public Element getBlackProgram() {
		return root.element("BlackProgram");
	}

	public Element getControlProgram() {
		return root.element("ControledProgram");
	}

	public Element getMalModule() {
		return root.element("MalModule");
	}

	public Element getExcludeExe() {
		return root.element("ExcludeExe");
	}

	public Element getRestrictedForm() {
		return root.element("RestrictedForm");
	}

}
