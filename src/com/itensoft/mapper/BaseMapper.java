package com.itensoft.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseMapper<T> { 
	List<T> loadAll();
	int insert(@Param("record") T record);
	int update(@Param("record") T record);
	int getTotal();
}
