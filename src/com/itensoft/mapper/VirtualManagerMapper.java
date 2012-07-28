package com.itensoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itensoft.model.User;

public interface VirtualManagerMapper {

	int getTotal();

	List<User> loadList(@Param("start") int start,@Param("rows") int rows);
	
	int delete(@Param("id") int id);

}
