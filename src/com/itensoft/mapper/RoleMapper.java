package com.itensoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itensoft.model.Role;

public interface RoleMapper {

	List<Role> getRoleByName(@Param("name") String name);

	int getTotal();

	List<Role> loadList(@Param("start") int start,@Param("rows") int rows);
	
	int delete(@Param("id") int id);

}
