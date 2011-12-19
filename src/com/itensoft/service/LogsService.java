package com.itensoft.service;

import java.util.List;

import com.itensoft.model.Logs;

public interface LogsService {

	int getTotalFilter(String username, String startdate, String enddate,
			String manager, String docer);

	List<Logs> loadFilter(int page, int rows, String username,
			String startdate, String enddate, String manager, String docer);

}
