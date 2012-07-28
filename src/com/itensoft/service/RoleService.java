package com.itensoft.service;

import java.util.List;

import com.itensoft.model.Role;

public interface RoleService {

	List<Role> getRoleByName(String name);

	int getTotal();

	List<Role> loadList(int page, int rows);

}
