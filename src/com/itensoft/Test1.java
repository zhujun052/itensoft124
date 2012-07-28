package com.itensoft;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.json.JSONArray;
import org.json.JSONException;

public class Test1 {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException
	 * @throws JSONException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {

		byte[] r = MessageDigest.getInstance("MD5").digest("test".getBytes());
		for (int i = 0; i < r.length; i++) {
			String tmp = Integer.toHexString(r[i] & 0xff);
			if (tmp.length() == 1)
				tmp = "0" + tmp;
			System.out.print(tmp);
			// System.out.print(" ");
		}
		
		
	  Session s = ItensoftSession.getSession();
	  List<RoleUser> users = s.createCriteria(RoleUser.class).list();
	  
	  JSONArray ja = new JSONArray(users);
	  
	  System.out.println(ja.toString());
	  
	  System.out.println(UUID.randomUUID().toString().length());
	  

	}

}
