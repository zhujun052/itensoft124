package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.LogsMapper;
import com.itensoft.model.Logs;
import com.itensoft.service.LogsService;

@Service("logsService")
public class LogsServiceImpl implements LogsService {

	LogsMapper logsMapper;
	@Resource(name="logsMapper")
	public void setLogsMapper(LogsMapper logsMapper) {
		this.logsMapper = logsMapper;
	}

	public int getTotalFilter(String username, String startdate,
			String enddate, String manager, String docer) {
		return this.logsMapper.getTotalFilter(username,startdate,enddate,manager,docer);
	}

	public List<Logs> loadFilter(int page, int rows, String username,
			String startdate, String enddate, String manager, String docer) {
		int start = page*rows;
		int total = this.logsMapper.getTotalFilter(username,startdate,enddate,manager,docer);
		int res = total-start;
		if(res<0&&page>1){
			rows = rows+res;
		}
		return this.logsMapper.loadFilter(start,rows,username,startdate,enddate,manager,docer);
	}

}
