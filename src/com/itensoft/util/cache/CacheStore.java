package com.itensoft.util.cache;

import java.util.HashMap;
import java.util.List;

import com.itensoft.model.Config;
import com.itensoft.service.ConfigService;

public class CacheStore {

	public Object getSystemConfig(ConfigService configService) {
		List<Config> config = configService.loadConfig();
		HashMap<String, String> hashconfig = new HashMap<String, String>();
		if(config.size()>=1){
			for(int i=0;i<config.size();i++){
				hashconfig.put(config.get(i).getSyskey(), config.get(i).getSysvalue());
			}
		}
		return hashconfig;
	}

}
