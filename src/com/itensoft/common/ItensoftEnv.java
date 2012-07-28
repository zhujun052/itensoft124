package com.itensoft.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.itensoft.ItensoftSession;
import com.itensoft.Setup;
import com.itensoft.VirtualManager;
import com.itensoft.VirtualManagerDocer;
import com.itensoft.signature.Signature;
import com.itensoft.signature.License;

public class ItensoftEnv {
	private static Setup setup;
	private static Signature signature;
	private static License license;

	private static Map<String, OnlineVirtualManagers> onlineManagers;

	public static Map<String, OnlineVirtualManagers> getOnlineManagers() {
		if (onlineManagers == null) {
			onlineManagers = new HashMap<String, OnlineVirtualManagers>();
			loadOnlineVirtualManagers();
		}

		return onlineManagers;
	}

	public static void reloadOnlineVirtualManagers() {
		if (onlineManagers == null) {
			onlineManagers = new HashMap<String, OnlineVirtualManagers>();
			loadOnlineVirtualManagers();
		} else {
			onlineManagers.clear();
			loadOnlineVirtualManagers();
		}
	}

	private static void loadOnlineVirtualManagers() {
		Session s = ItensoftSession.getSession();

		List<VirtualManager> list = s.createQuery("from VirtualManager").list();
		for (Iterator<VirtualManager> it = list.iterator(); it.hasNext();) {
			VirtualManager vm = it.next();

			OnlineVirtualManagers mgrs = new OnlineVirtualManagers();
			mgrs.setManagerName(vm.getName());

			// 加人8个管理用户，当然可能不是8个
			if ((vm.getUser1() != null) && (!"".equals(vm.getUser1().trim()))) {
				OnlineVirtualManager omgr = new OnlineVirtualManager();
				omgr.setUser(vm.getUser1());
				if (vm.getPriority1() != null)
				{
					omgr.SetPriority(vm.getPriority1());
				}
				mgrs.getManagers().put(vm.getUser1(), omgr);
			}

			if ((vm.getUser2() != null) && (!"".equals(vm.getUser2()))) {
				OnlineVirtualManager omgr = new OnlineVirtualManager();
				omgr.setUser(vm.getUser2());
				if (vm.getPriority2() != null)
				{
					omgr.SetPriority(vm.getPriority2());
				}
				mgrs.getManagers().put(vm.getUser2(), omgr);

			}
			if ((vm.getUser3() != null) && (!"".equals(vm.getUser3())))  {
				OnlineVirtualManager omgr = new OnlineVirtualManager();
				omgr.setUser(vm.getUser3());
				if (vm.getPriority3() != null)
				{
					omgr.SetPriority(vm.getPriority3());
				}
				mgrs.getManagers().put(vm.getUser3(), omgr);

			}
			if ((vm.getUser4() != null) && (!"".equals(vm.getUser4())))  {
				OnlineVirtualManager omgr = new OnlineVirtualManager();
				omgr.setUser(vm.getUser4());
				if (vm.getPriority4() != null)
				{
					omgr.SetPriority(vm.getPriority4());
				}
				mgrs.getManagers().put(vm.getUser4(), omgr);

			}
			if ((vm.getUser5() != null) &&(!"".equals(vm.getUser5()))) {
				OnlineVirtualManager omgr = new OnlineVirtualManager();
				omgr.setUser(vm.getUser5());
				if (vm.getPriority5() != null)
				{
					omgr.SetPriority(vm.getPriority5());
				}
				mgrs.getManagers().put(vm.getUser5(), omgr);
			}
			if ((vm.getUser6() != null) && (!"".equals(vm.getUser6())))  {
				OnlineVirtualManager omgr = new OnlineVirtualManager();
				omgr.setUser(vm.getUser6());
				if (vm.getPriority6() != null)
				{
					omgr.SetPriority(vm.getPriority6());
				}
				mgrs.getManagers().put(vm.getUser6(), omgr);

			}
			if ((vm.getUser7() != null) && (!"".equals(vm.getUser7()))) {
				OnlineVirtualManager omgr = new OnlineVirtualManager();
				omgr.setUser(vm.getUser7());
				if (vm.getPriority7() != null)
				{
					omgr.SetPriority(vm.getPriority7());
				}
				mgrs.getManagers().put(vm.getUser7(), omgr);

			}
			if ((vm.getUser8() != null) && (!"".equals(vm.getUser8())))  {
				OnlineVirtualManager omgr = new OnlineVirtualManager();
				omgr.setUser(vm.getUser8());
				if (vm.getPriority8() != null)
				{
					omgr.SetPriority(vm.getPriority8());
				}
				mgrs.getManagers().put(vm.getUser8(), omgr);
			}

			// 读入docers
			OnlineDocers docers = new OnlineDocers();
			List<VirtualManagerDocer> docerList = s
					.createQuery(
							"from VirtualManagerDocer where VitrualManagerName=?")
					.setString(0, vm.getName()).list();
			for (Iterator<VirtualManagerDocer> docer_it = docerList.iterator(); docer_it
					.hasNext();) {
				VirtualManagerDocer docer = docer_it.next();
				OnlineDocer od = new OnlineDocer();
				od.SetDocerName(docer.getId().getDocer());
				od.PowerOff();
				docers.getDocers().put(docer.getId().getDocer(), od);
				docers.SetManager(mgrs);
			}

			// vm.getName()
			mgrs.setOnlineDocers(docers);

			onlineManagers.put(mgrs.getManagerName(), mgrs);
		}

		// ItensoftSession.closeSession();
	}

	public static Integer getAuthType() {
		if (setup == null) {
			setup = (Setup) ItensoftSession.getSession().get(Setup.class, 1);
		}

		return setup.getAuthType();
	}

	public static Signature getSignature() {
		if (signature == null) {
			signature = new Signature();
		}

		return signature;
	}
	
	public static License getLicense() {
		if (license == null) {
			license = new License();
		}
		return license;
	}

	public static String getVirtualManagerName(String userName) {
		String result = "";
		for (Iterator<OnlineVirtualManagers> it = getOnlineManagers().values()
				.iterator(); it.hasNext();){
			OnlineVirtualManagers mgrs = it.next();
			if (mgrs.getManagers().containsKey(userName)) {
				return mgrs.getManagerName();
			}

		}

		return result;
	}

}
