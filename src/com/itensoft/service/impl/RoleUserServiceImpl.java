package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.RoleUserMapper;
import com.itensoft.model.Roleuser;
import com.itensoft.service.RoleUserService;
@Service("roleUserService")
public class RoleUserServiceImpl implements RoleUserService {
	
	RoleUserMapper roleUserMapper;
	@Resource(name="roleUserMapper")
	public void setRoleUserMapper(RoleUserMapper roleUserMapper) {
		this.roleUserMapper = roleUserMapper;
	}


	@Override
	public List<Roleuser> loadList(String rolename) {
		return this.roleUserMapper.loadList(rolename);
	}


	@Override
	public int insert(Roleuser roleuser) {
		return this.roleUserMapper.insert(roleuser);
	}


	@Override
	public int delete(Roleuser roleuser) {
		return this.roleUserMapper.delete(roleuser);
	}


	@Override
	public int exist(Roleuser roleuser) {
		return this.roleUserMapper.existUser(roleuser);
	}

}
