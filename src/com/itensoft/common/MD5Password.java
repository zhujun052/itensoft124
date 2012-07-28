package com.itensoft.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Password {
	public static String getMD5Password(String password) throws NoSuchAlgorithmException{
		String result = "";
		byte[] md5pass = MessageDigest.getInstance("MD5").digest(
				password.getBytes());
		for (int i = 0; i < md5pass.length; i++)
		{
			String tmp = Integer.toHexString(md5pass[i] & 0xff);
			if(tmp.length() == 1)
				tmp = "0" + tmp;
			if("".equals(result))
				result = tmp;
			else
				result += tmp;
		}

		return result;	
	}
}
