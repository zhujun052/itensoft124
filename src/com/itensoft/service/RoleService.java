package com.itensoft.service;

import java.util.List;

import com.itensoft.model.Role;

public interface RoleService {

	List<Role> getRoleByName(String name);

	int getTotal();

	List<Role> loadList(int page, int rows);

	int addRole(Role role);

	int update(Role role);

	boolean delete(String name);

	boolean exist(String name);

}
