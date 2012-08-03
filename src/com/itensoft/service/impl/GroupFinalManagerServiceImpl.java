package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.GroupFinalManagerMapper;
import com.itensoft.model.Virtualmanager;
import com.itensoft.service.GroupFinalManagerService;

@Service("groupFinalManagerService")
public class GroupFinalManagerServiceImpl implements GroupFinalManagerService{

	GroupFinalManagerMapper groupFinalManagerMapper;
	@Resource(name="groupFinalManagerMapper")
	public void setGroupFinalManagerMapper(
			GroupFinalManagerMapper groupFinalManagerMapper) {
		this.groupFinalManagerMapper = groupFinalManagerMapper;
	}


	@Override
	public List<Virtualmanager> getGroupFinalManager(int id) {
		return this.groupFinalManagerMapper.getGroupFinalManager(id);
	}

}
