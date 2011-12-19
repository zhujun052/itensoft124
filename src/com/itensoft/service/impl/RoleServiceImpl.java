package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.RoleMapper;
import com.itensoft.model.Role;
import com.itensoft.service.RoleService;
@Service("roleService")
public class RoleServiceImpl implements RoleService {
	
	RoleMapper roleMapper;
	@Resource(name="roleMapper")
	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}


	@Override
	public List<Role> getRoleByName(String name) {
		return this.roleMapper.getRoleByName(name);
	}


	@Override
	public int getTotal() {
		return this.roleMapper.getTotal();
	}


	@Override
	public List<Role> loadList(int page, int rows) {
		int start = page*rows;
		int total = this.roleMapper.getTotal();
		int res = total-start;
		if(res<0&&page>1){
			rows = rows+res;
		}
		return this.roleMapper.loadList(start,rows);
	}


	@Override
	public int addRole(Role role) {
		return this.roleMapper.insert(role);
	}


	@Override
	public int update(Role role) {
		return this.roleMapper.update(role);
	}
	
	public boolean delete(String name){
		if(this.roleMapper.delete(name)==1){
			return true;
		}
		return false;
	}


	@Override
	public boolean exist(String name) {
		if(this.roleMapper.getExist(name) == 1){
			return true;
		}
		return false;
	}

}
