package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.GroupMapper;
import com.itensoft.model.Group;
import com.itensoft.service.GroupService;

@Service("groupService")
public class GroupServiceImpl implements GroupService{

	GroupMapper groupMapper;
	@Resource(name="groupMapper")
	public void setGroupMapper(GroupMapper groupMapper) {
		this.groupMapper = groupMapper;
	}


	public List<Group> loadByParentCode(int ParentCode) {
		return this.groupMapper.loadByParentCode(ParentCode);
	}


	@Override
	public Group getInfoById(int id) {
		return this.groupMapper.getInfoById(id);
	}

}
