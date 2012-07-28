package com.itensoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itensoft.model.Logs;

public interface LogsMapper {

	int getTotalFilter(@Param("username") String username,
			@Param("startdate") String startdate,
			@Param("enddate") String enddate, @Param("manager") String manager,
			@Param("docer") String docer);

	List<Logs> loadFilter(@Param("start") int start, @Param("rows") int rows,
			@Param("username") String username,
			@Param("startdate") String startdate,
			@Param("enddate") String enddate, @Param("manager") String manager,
			@Param("docer") String docer);

}
