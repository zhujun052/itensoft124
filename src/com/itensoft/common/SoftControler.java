package com.itensoft.common;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Element;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import com.itensoft.GroupControlProgram;
import com.itensoft.GroupControlProgramId;
import com.itensoft.GroupFinalControlProgram;
import com.itensoft.ItensoftSession;
import com.itensoft.signature.Signature;

public class SoftControler
{

	public String getGroupControlSoftware(Integer groupCode, Integer programCode)
	{
		String result = "";
		Session s = ItensoftSession.getSession();

/*		Query qry = s.createQuery("from GroupControlProgram where GroupCode=? and ProgramCode like :programCode");
		qry.setParameter(0, groupCode);
		qry.setInteger("programCode", programCode);
		//qry.setParameter(1, programCode);
		List<GroupControlProgram> list = qry.list();
		for (Iterator<GroupControlProgram> it = list.iterator(); it.hasNext();)
		{
			GroupControlProgram gp = (GroupControlProgram) it.next();
			String temp = "";
			temp = "{softwarecode:" + gp.getId().getProgramCode().toString() + ",";
			temp += "softwarename:'" + "objs[1]" + "',";
			temp += "encryptomode:" + (gp.getEncryptMode() == null ? "0" : gp.getEncryptMode()) + ",";
			temp += "printable:"
					+ (gp.getPrintControled()==null ? "false" : ("T".equals(gp.getPrintControled()) ? "true" : "false")) + "}";
			if (result == "")
				result = temp;
			else
				result += "," + temp;
		}		
*/			
		String hsql = "select a.Code, a.Name ,b.EncryptMode,b.PrintControled from ControlProgram as a "
				+ "left join GroupControlProgram as b on a.Code = b.ProgramCode and b.GroupCode="
				+ groupCode.toString()
				+ " where a.ParentCode="
				+ programCode.toString();
		List list = s.createSQLQuery(hsql).list();

		for (Iterator it = list.iterator(); it.hasNext();)
		{
			Object[] objs = (Object[]) it.next();
			String temp = "";
			temp = "{softwarecode:" + objs[0] + ",";
			temp += "softwarename:'" + objs[1] + "',";
			temp += "encryptomode:" + (objs[2] == null ? "0" : objs[2]) + ",";
			temp += "printable:"
					+ (objs[3] == null ? "false"
							: ("T".equals(objs[3].toString()) ? "true" : "false")) + "}";
			if (result == "")
				result = temp;
			else
				result += "," + temp;
		}

		result = "{root:[" + result + "]}";
		
		//System.out.println(result);

		ItensoftSession.closeSession();

		return result;
	}
}
