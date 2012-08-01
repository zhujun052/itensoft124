package com.itensoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itensoft.model.Roleuser;

public interface RoleUserMapper extends BaseMapper<Roleuser>{

	List<Roleuser> loadList(@Param("rolename") String rolename);
	
	int existUser(@Param("roleuser") Roleuser roleuser);
	
	int delete(@Param("roleuser") Roleuser roleuser);
	
	int insert(@Param("roleuser") Roleuser roleuser);

}
