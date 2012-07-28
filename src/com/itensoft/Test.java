package com.itensoft;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.jdbc.Work;

import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.SoftControler;
import com.itensoft.common.UserPolicy;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		byte AByte = 33;

		byte i1 = (byte)( AByte>>4);
		System.out.println(i1);
		
		byte i2 = (byte)((byte)(AByte << 4) >>4);
		//i2 = (byte) (i2 >> 4);
		System.out.println(i2);
		
//		i1 = 2;
//		i2 = 2;
		byte bbyte = (byte)(i1<<4);
		System.out.println(bbyte);
		bbyte =(byte) (bbyte | i2);
		System.out.println(bbyte);
		AByte = (byte) (i1 << 4);
		System.out.println(AByte);
		//System.out.println(s);
		
		String sss = "aaaa\\bbbb";
		if (sss.contains("\\"))
			System.out.println(sss);
		
	/*	Group g =(Group) ItensoftSession.getSession().get(Group.class, 1);
		UserPolicy prop = new UserPolicy(g);
		
		System.out.println(prop.toString());
		
		Integer code = 0;
		Policy p = (Policy)ItensoftSession.getSession().get(Policy.class, code);
		System.out.println(p.getCode());
		System.out.println(p.getPrintControled());
		*/
		//Signature signature = new Signature();
		//System.out.print(signature.getBlackProgram().asXML());
		
		Session s = ItensoftSession.getSession();
		s.doWork(new Work() {
			
			public void execute(Connection arg0) throws SQLException {
				String sql = "{call dbo.sp_GenGroupFinalBlackProgram(?)}";
				CallableStatement p = arg0.prepareCall(sql);
				//p.setInt(parameterIndex, x)
			
				p.setInt(1, 2);
				//p.registerOutParameter(2, java.sql.Types.INTEGER);
				p.execute();
				//System.out.println(p.getParameterMetaData().getParameterCount());
				//p.setInt(1, 2);
				//p.execute();
				
			}
		});
		//ItensoftEnv.getSignature();
//		SoftControler sc = new SoftControler();
		
		List list =  s.createSQLQuery("select a.Code, a.Name ,b.EncryptMode from ControlProgram as a "
					+ "left join GroupFinalControlProgram as b on a.Code = b.ProgramCode where a.ParentCode=?").setInteger(0, 1).list();
		
		for(Iterator it = list.iterator();it.hasNext();)
		{
			Object[] objs = (Object[]) it.next();
			System.out.print(objs[0]);
			System.out.print("\t\t");
			System.out.print(objs[1]);
			System.out.print("\t\t");
			System.out.print(objs[2]);
			System.out.print("\n");
			
		}
		
		
		for(int i = 1; i < 10;i++)
		{
			System.out.println(i);
			if (i == 5)
				break;
		}
				
	}
	

}
