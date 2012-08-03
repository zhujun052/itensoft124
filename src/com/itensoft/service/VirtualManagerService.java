package com.itensoft.service;

import java.util.List;

import com.itensoft.bean.VUser;
import com.itensoft.bean.VmGroup;
import com.itensoft.model.User;
import com.itensoft.model.Virtualmanager;

public interface VirtualManagerService {

	int getTotal();

	List<User> loadList(int page, int rows);

	int add(String name, List<VUser> list);

	int update(int id,String name, List<VUser> list);

	int delete(int id);

	List<Virtualmanager> getVmsByGCode(int id);

	List<Virtualmanager> getVirtualManagerAll(int code);

	List<Virtualmanager> getVirtualManagerSel(int code);

}
