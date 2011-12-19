package com.itensoft.common;

import java.io.UnsupportedEncodingException;

public class UTF8String {
	public static String toString(String input) throws UnsupportedEncodingException{
		return new String(input.getBytes("ISO-8859-1"),"UTF-8");
	}

}
