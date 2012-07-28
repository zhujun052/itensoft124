package com.itensoft.service;

import java.util.List;

import com.itensoft.model.Group;


public interface GroupService {

	List<Group> loadByParentCode(int ParentCode);

}
