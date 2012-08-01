package com.itensoft.service;

import java.util.List;
import com.itensoft.model.Roleuser;

public interface RoleUserService {

	List<Roleuser> loadList(String rolename);

	int insert(Roleuser roleuser);

	int delete(Roleuser roleuser);

	int exist(Roleuser roleuser);


}
