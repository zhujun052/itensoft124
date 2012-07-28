package com.itensoft.util;

import com.opensymphony.oscache.base.NeedsRefreshException;
import com.opensymphony.oscache.general.GeneralCacheAdministrator;

public class CacheManager {
	public static String cachekey;
	public static GeneralCacheAdministrator cacheadmin = new GeneralCacheAdministrator();

	public static String getTransform(String key){
		return StringUtil.getBase64(key.getBytes());
	}
	
	public static String getKey(){
		if(cachekey==null){
			StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
			cachekey = stacks[3].getClassName() + "." + stacks[3].getMethodName();
		}
		return cachekey;
	}

	public static void putInCache(String key, Object content) {
		cacheadmin.putInCache(key, content);
	}

	public static Object getFromCache(String cachekey) {
		Object obj = null;
		try {
			obj = cacheadmin.getFromCache(cachekey);
		} catch (NeedsRefreshException e) {
			return null;
		}
		return obj;
	}
	
	public static Object getFromCache(String key, int refreshPeriod) {
		Object obj = null;
		try {
			obj = cacheadmin.getFromCache(key, refreshPeriod);
		} catch (NeedsRefreshException e) {
			return null;
		}
		return obj;
	}
	
	public static void removeCache(String key) {
		cacheadmin.removeEntry(key);
	}

	public static Object getKeyCache(String key, int refreshPeriod) {
		Object obj = null;
		try {
			key = getKey() + key;
			key = getTransform(key);
			obj = cacheadmin.getFromCache(key, refreshPeriod);
		} catch (NeedsRefreshException e) {
			return null;
		}
		return obj;
	}

	public static void putKeyCache(String key, Object content) {
		key = getKey() + key;
		key = getTransform(key);
		cacheadmin.putInCache(key, content);
	}
	
	public static void removeKeyCache(String key){
		key = getKey() + key;
		key = getTransform(key);
		cacheadmin.removeEntry(key);
	}

	public static void resetKey(String key, Object object) {
		key = getTransform(key);
		cacheadmin.removeEntry(key);
		cacheadmin.putInCache(key, object);
	}
}
