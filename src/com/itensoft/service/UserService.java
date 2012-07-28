package com.itensoft.service;

import java.util.List;

import com.itensoft.model.User;

public interface UserService {

	User findByName(String name);

	List<User> loadList(int page, int rows);

	int getTotal();

	Boolean addUser(User user);

	Boolean update(User user);

	Boolean delete(String name);

	boolean existUser(String name);

}
