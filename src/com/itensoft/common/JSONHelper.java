package com.itensoft.common;

import java.util.List;

import org.json.JSONArray;

public class JSONHelper {
	public static String toJSONString(List<?> list){
		JSONArray ja = new JSONArray(list);
		
		return ja.toString();
	}

}
