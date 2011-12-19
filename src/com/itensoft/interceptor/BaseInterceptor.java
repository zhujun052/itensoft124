package com.itensoft.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.itensoft.service.ConfigService;
import com.itensoft.util.CacheManager;
import com.itensoft.util.Constant;
import com.itensoft.util.cache.CacheStore;

public class BaseInterceptor implements HandlerInterceptor {
	
	public ConfigService configService;
	@Resource(name="configService")
	public void setConfigService(ConfigService configService) {
		this.configService = configService;
	}

	// preHandle()方法在业务处理器处理请求之前被调用  
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {

		Object systemconfig = CacheManager.getFromCache(Constant.SYSTEM_CONFIG);
		if(systemconfig == null){
			Object hashmap = new CacheStore().getSystemConfig(configService);
			CacheManager.putInCache(Constant.SYSTEM_CONFIG, hashmap);
			request.setAttribute(Constant.SYSTEM_CONFIG, hashmap);
		}else{
			request.setAttribute(Constant.SYSTEM_CONFIG, systemconfig);
		}
		
		return true;
	}
	// afterCompletion()方法在DispatcherServlet完全处理完请求后被调用  
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj1, Exception e)
			throws Exception {

		
	}
	// postHandle()方法在业务处理器处理请求之后被调用  
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj, ModelAndView mod) throws Exception {

	}



}

