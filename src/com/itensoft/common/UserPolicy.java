package com.itensoft.common;

import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.hibernate.Query;
import org.hibernate.Session;

import com.itensoft.Cert;
import com.itensoft.ClientMessage;
import com.itensoft.Group;
import com.itensoft.GroupFinalControlProgram;
import com.itensoft.GroupFinalIdentity;
import com.itensoft.GroupFinalRecver;
import com.itensoft.GroupFinalManager;
import com.itensoft.GroupManager;
import com.itensoft.ItensoftSession;
import com.itensoft.Policy;
import com.itensoft.GroupFinalPolicy;
import com.itensoft.ScanPlan;
import com.itensoft.VirtualManager;
import com.itensoft.signature.Signature;
import com.itensoft.signature.License;

public class UserPolicy
{
	private Group group;
	private Document doc;
	private Element root;
	private Element strategy;
	private Session session;
	// private Session signature = SignatureSession.getSession();
	private Signature signature = ItensoftEnv.getSignature();
	private License license=ItensoftEnv.getLicense();

	public UserPolicy(Group group, Session session)
	{
		this.group = group;
		this.session = session;
		doc = DocumentHelper.createDocument();
	}

	private String getValue(String value)
	{
		return value == null ? "" : value;
	}
	
	private void appendGeneral()
	{
		GroupFinalPolicy fp = new GroupFinalPolicy(group, session);
		
		Element general = strategy.addElement("General");
		general.addElement("Expiration");
		general.addElement("Key").setText(license.getKey());
		general.addElement("LogPrint").setText(getValue(fp.getLogPrint()));
		general.addElement("LogUDiskOp").setText(getValue(fp.getLogUdiskOp()));
		general.addElement("LogNetOp").setText(getValue(fp.getLogNetOp()));
		general.addElement("UseBlackList").setText(
				getValue(fp.getUseBlackList()));
		general.addElement("OfflineTime")
				.setText(fp.getOfflineTime() == null ? "" : fp.getOfflineTime().toString());
		general.addElement("PrintControled").setText(
				getValue(fp.getPrintControled()));
		general.addElement("UDiskMode").setText(
				String.valueOf(fp.getUdiskMode()));
		general.addElement("OverlayIcon").setText(getValue(fp.getOverlayIcon()));
		general.addElement("NeedUSBKey").setText(getValue(fp.getNeedKey()));
		general.addElement("VirtualPrintControled").setText(
				getValue(fp.getPrintControledEx()));
		general.addElement("ClipboardControled").setText(
				getValue(fp.getClipboardControled()));
		general.addElement("OLEControled").setText(
				getValue(fp.getOlecontroled()));
		general.addElement("DragdropControled").setText(
				getValue(fp.getDragdropControled()));
		general.addElement("SnapshotControled").setText(
				getValue(fp.getSnapShotControled()));
		general.addElement("ExplorerPrivew").setText(
				getValue(fp.getPreviewSpec()));
		general.addElement("GlobalExclude");
		general.addElement("EncryptionSlot").setText(
				getValue(fp.getEncryptionSlot()));
		general.addElement("DecryptionSlot").setText(
				getValue(fp.getDecryptionSlot()));
				
		general.addElement("FtpHost").setText(getValue(fp.getFtp()));
		general.addElement("FtpPassword").setText(getValue(fp.getFtpPassword()));
		general.addElement("FtpUserName").setText(getValue(fp.getFtpUserName()));			


		//general.addElement("ShowManagerIcon");
	}

	@SuppressWarnings("unchecked")
	private void appendControledPrograms()
	{
		Element programs = strategy.addElement("ControledPrograms");
		List<GroupFinalControlProgram> list = ItensoftSession.getSession()
				.createQuery("from GroupFinalControlProgram where GroupCode=?")
				.setParameter(0, group.getCode()).list();
		if (list.isEmpty())
			return;

		Iterator<GroupFinalControlProgram> it = list.iterator();
		Element controlProgram = signature.getControlProgram();
		
		while (it.hasNext())
		{
			GroupFinalControlProgram gcp = it.next();
			boolean bMatched=false;
			for (Iterator itSignature = controlProgram.elementIterator(); itSignature.hasNext();){
				Element element = (Element)itSignature.next();
				if (element.elementText("ParentCode").equals(gcp.getId().getProgramCode().toString())){
					bMatched=true;
					Element program = programs.addElement("ControledProgram");
					program.addElement("Code").setText(element.elementText("Code"));
					program.addElement("Name").setText(element.elementText("Name"));
					program.addElement("ExeName")
							.setText(element.elementText("ExeName"));
					program.addElement("OriginalFileName").setText(
							element.elementText("OriginalFileName"));
					program.addElement("Md5").setText(element.elementText("Md5"));
					program.addElement("Include")
							.setText(element.elementText("IncludeFile"));
					program.addElement("Exclude")
							.setText(element.elementText("ExcludeFile"));
					program.addElement("SignSubject").setText(
							element.elementText("SignSubject"));
					program.addElement("SignIssuer").setText(
							element.elementText("SignIssuer"));
					program.addElement("NativeFile").setText(
							element.elementText("NativeFormat")==null? "": element.elementText("NativeFormat"));
					
					program.addElement("SubProcessInherited").setText(
							element.elementText("SubProcessInherited"));
					program.addElement("CreateBySvchost").setText(
							element.elementText("CreateBySvchost")==null?"":element.elementText("CreateBySvchost"));
					program.addElement("RestrictedFormCount").setText(
							element.elementText("RestrictedFormCount"));
					program.addElement("Map").setText(element.elementText("Map"));
					program.addElement("NeedInject");
					program.addElement("CloseWrite").setText(
							element.elementText("CloseWrite"));
					program.addElement("AutoRunExe").setText(
							element.elementText("AutoRunExe")==null?"":element.elementText("AutoRunExe"));
					program.addElement("EncryptMode").setText(
							getValue(gcp.getEncryptMode().toString()));
					program.addElement("PrintControled").setText(
							getValue(gcp.getPrintControled()));

				}
				else{
					if (bMatched){
						break; //如果之前的是相对应的记录，而此时已经不是了，可以退出以优化速度
					}
				}
			}
/*			Element cp = controlProgram.element("record"
					+ gcp.getId().getProgramCode().toString());
			if (cp != null)
			{
			}
*/			
		}
	}

	@SuppressWarnings("unchecked")
	private void appendIdentitys()
	{
		Element indentitys = strategy.addElement("Identitys");
		List<GroupFinalIdentity> list = ItensoftSession.getSession()
				.createQuery("from GroupFinalIdentity where GroupCode=?")
				.setParameter(0, group.getCode()).list();
		if (list.isEmpty())
			return;

		Iterator<GroupFinalIdentity> it = list.iterator();
		while (it.hasNext())
		{
			GroupFinalIdentity gi = it.next();
			Cert cert = (Cert) ItensoftSession.getSession().get(Cert.class,
					gi.getId().getCertId());
			Element indentity = indentitys.addElement("Identity");
			indentity.addElement("Id").setText(getValue(cert.getId()));
			indentity.addElement("Name").setText(getValue(cert.getName()));
			indentity.addElement("PrivateKey").setText(
					getValue(cert.getPrivateKey()));
		}

	}

	@SuppressWarnings("unused")
	private void appendRecvers()
	{
		Element recvers = strategy.addElement("Recvers");
		List<GroupFinalRecver> list = ItensoftSession.getSession()
				.createQuery("from GroupFinalRecver where GroupCode=?")
				.setParameter(0, group.getCode()).list();
		if (list.isEmpty())
			return;

		Iterator<GroupFinalRecver> it = list.iterator();
		while (it.hasNext())
		{
			GroupFinalRecver gr = it.next();
			Cert cert = (Cert) ItensoftSession.getSession().get(Cert.class,
					gr.getId().getCertId());
			Element recver = recvers.addElement("Recver");
			recver.addElement("Id").setText(getValue(cert.getId()));
			recver.addElement("Name").setText(getValue(cert.getName()));
			recver.addElement("PublicKey").setText(getValue(cert.getPublicKey()));
			if ((gr.getPrintCount()!=null) && (gr.getPrintCount()==0)){
			recver.addElement("DisablePrint").setText("T");
			}
			else {				
				recver.addElement("DisablePrint").setText("F");
			}
			if ((gr.getReadOnly()!=null) && (gr.getReadOnly().equals("T"))){
				recver.addElement("ReadOnly").setText("T");				
			}
			else {
				recver.addElement("ReadOnly").setText("F");							
			}
		}
	}

	@SuppressWarnings("unused")
	private void appendAllRecvers()
	{
		Element allRecvers = strategy.addElement("AllRecvers");
		List<Cert> certList = ItensoftSession.getSession().createQuery("from Cert").list(); 
		
		for (Iterator<Cert> it = certList.iterator(); it.hasNext();) {
			Cert cert = it.next();
			Element allRecver = allRecvers.addElement("AllRecver");
			allRecver.addElement("Id").setText(getValue(cert.getId()));
			allRecver.addElement("Name").setText(getValue(cert.getName()));
			allRecver.addElement("PrivateKey").setText(getValue(cert.getPrivateKey()));
			allRecver.addElement("PublicKey").setText(getValue(cert.getPublicKey()));
		}	
	}
	
	@SuppressWarnings("unchecked")
	private void appendRestrictedForms()
	{
		Element restrictedForms = strategy.addElement("RestrictedForms");
		Element forms = signature.getRestrictedForm();

		Iterator<Element> it = forms.elementIterator();
		while (it.hasNext())
		{
			Element form = restrictedForms.addElement("RestrictedForm");
			Element f = it.next();
			form.addElement("ExeCode").setText(f.elementText("ExeCode"));
			form.addElement("Class").setText(f.elementText("Class"));
			form.addElement("Text").setText(f.elementText("Text"));

		}
	}

	@SuppressWarnings("unchecked")
	private void appendMalModules()
	{
		Element malModules = strategy.addElement("MalModules");

		/*
		 * List<MalModule> list =
		 * signature.createQuery("from MalModule").list(); if(list.isEmpty())
		 * return;
		 */
		Element modules = signature.getMalModule();
		Iterator<Element> it = modules.elementIterator();
		while (it.hasNext())
		{
			Element module = malModules.addElement("MalModule");
			Element m = it.next();
			module.addElement("FileName").setText(m.elementText("FileName"));
			module.addElement("OriginalFileName").setText(
					m.elementText("OriginalFileName"));
			module.addElement("Md5").setText(m.elementText("Md5"));
		}
	}

	@SuppressWarnings("unchecked")
	private void appendExcludeExes()
	{
		Element exes = strategy.addElement("ExcludeExes");

		Element excludeExes = signature.getExcludeExe();

		/*
		 * List<ExcludeExe> list =
		 * signature.createQuery("from ExcludeExe").list(); if(list.isEmpty())
		 * return;
		 * 
		 * Iterator<ExcludeExe> it = list.iterator();
		 */
		Iterator<Element> it = excludeExes.elementIterator();
		while (it.hasNext())
		{
			Element exe = exes.addElement("ExcludeExe");
			Element e = it.next();
			exe.addElement("Md5");// TODO .setText(e.elementText("Md5"));
			exe.addElement("SignSubject").setText(e.elementText("SignSubject"));
			exe.addElement("SignIssuer").setText(e.elementText("SignIssuer"));
			exe.addElement("ExeName").setText(e.elementText("ExeName"));
			exe.addElement("OriginalFileName").setText(
					e.elementText("OriginalFileName"));
			exe.addElement("CompanyName").setText(e.elementText("CompanyName"));
		}
	}

	private void appendStrategy()
	{
		strategy = root.addElement("Strategy");
		appendGeneral();
		appendIdentitys();
		appendRecvers();
		appendAllRecvers();
		appendControledPrograms();
		appendRestrictedForms();
		appendMalModules();
		appendExcludeExes();
	}

	@SuppressWarnings("unchecked")
	private void appendScanPlan()
	{
		Element scanPlans = root.addElement("ScanPlans");

		List<ScanPlan> list = ItensoftSession.getSession()
				.createQuery("from ScanPlan").list();
		if (list.isEmpty())
			return;

		Iterator<ScanPlan> it = list.iterator();
		while (it.hasNext())
		{
			Element scanPlan = scanPlans.addElement("ScanPlan");
			ScanPlan plan = it.next();
			scanPlan.addElement("Name").setText(
					getValue(plan.getId().getName()));
			scanPlan.addElement("Include").setText(
					getValue(plan.getId().getInclude()));
			scanPlan.addElement("Exclude").setText(
					getValue(plan.getId().getExclude()));
			scanPlan.addElement("IgnoreSys").setText(
					getValue(plan.getId().getIgnoreSys()));
		}
	}

	@SuppressWarnings("unused")
	private void appendOnlineManager()
	{
		Element onlineManager = root.addElement("OnlineManager");

		for (Iterator<OnlineVirtualManagers> it = ItensoftEnv
				.getOnlineManagers().values().iterator(); it.hasNext();)
		{
			OnlineVirtualManagers mgrs = it.next();
			if (mgrs.onLine())
			{
				Element vmgr = onlineManager.addElement("VirtualManager");
				vmgr.addAttribute("Name", mgrs.getManagerName());
				for (Iterator<OnlineVirtualManager> mgrIt = mgrs.getManagers()
						.values().iterator(); mgrIt.hasNext();)
				{

					OnlineVirtualManager mgr = mgrIt.next();
					Element detail = vmgr.addElement("Detail");
					detail.addElement("IP").setText(mgr.getIp());
					detail.addElement("Port").setText(mgr.getPort());

				}// for mgrIt

			}// if

		}// for it

	}

	private void appendManagers()
	{
		Session s = ItensoftSession.getSession();
		Query query = s.createQuery("from GroupFinalManager where GroupCode=?");
		query.setParameter(0, group.getCode());

		List<GroupFinalManager> list = query.list();

		Element managers = root.addElement("Managers");
		for (Iterator<GroupFinalManager> it = list.iterator(); it.hasNext();)
		{
			GroupFinalManager gm = it.next();
			managers.addElement("VirtualManager").addElement("Name")
					.setText(gm.getId().getVirtualManagerName());
		}
	}

	@SuppressWarnings("unchecked")
	private void appendClientMessage()
	{
		Element clientMessage = root.addElement("ClientMessage");
		List<ClientMessage> list = ItensoftSession
				.getSession()
				.createQuery("from ClientMessage where ClientId=? and Readed=?")
				.setParameter(0, group.getId()).setParameter(1, "F").list();
		if (list.isEmpty())
			return;

		Iterator<ClientMessage> it = list.iterator();
		while (it.hasNext())
		{
			Element message = clientMessage.addElement("Message");
			ClientMessage msg = it.next();
			message.addElement("Id").setText(
					getValue(msg.getMessageId().toString()));
			message.addElement("Note").setText(getValue(msg.getNote()));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d HH:mm:ss");

			message.addElement("DateTime").setText(
					msg.getRQ() == null ? "" : sdf.format(msg.getRQ()));
		}
	}

	
	private void appendRefreshId()
	{
		root.addElement("Other").addElement("RefreshId")
				.setText(group.getRefreshId().toString());
	}

	public String toString()
	{
		doc.clearContent();

		root = doc.addElement("AllContent");
		appendStrategy();
		appendScanPlan();
		// TODO 这里把取得在线管理员跟未读消息都取消了
		// appendOnlineManager();
		// appendClientMessage();
		appendManagers();
		appendRefreshId();

		OutputFormat format = OutputFormat.createPrettyPrint();
		StringWriter write = new StringWriter();
		format.setEncoding("UTF-8");

		XMLWriter xmlwrite = new XMLWriter(write, format);
		try
		{
			xmlwrite.write(doc);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		return write.toString();
	}

}
