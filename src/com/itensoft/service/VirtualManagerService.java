package com.itensoft.service;

import java.util.List;

import com.itensoft.model.User;

public interface VirtualManagerService {

	int getTotal();

	List<User> loadList(int page, int rows);

}
