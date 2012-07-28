package com.itensoft.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itensoft.model.User;

public interface UserMapper extends BaseMapper<User>{

	User findByName(@Param(value="name") String name);

	int getTotal();
	
	List<User> loadList(@Param(value="start") int start,@Param(value="rows") int rows);
	
	List<User> loadList(@Param(value="start") String start,@Param(value="rows") String rows);

	List<User> loadList(@Param(value="listsql") String listsql);

	int addUser(@Param("record") User record);

	int delete(@Param(value="name") String name);

	int existUser(@Param(value="name") String name);

}
