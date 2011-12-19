package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.ConfigMapper;
import com.itensoft.model.Config;
import com.itensoft.service.ConfigService;
@Service("configService")
public class ConfigServiceImpl implements ConfigService{
	
	ConfigMapper configMapper;
	@Resource(name="configMapper")
	public void setConfigMapper(ConfigMapper configMapper) {
		this.configMapper = configMapper;
	}


	public List<Config> loadConfig(){
		return this.configMapper.loadConfig();
	}
}
