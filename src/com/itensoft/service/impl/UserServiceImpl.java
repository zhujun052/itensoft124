package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.UserMapper;
import com.itensoft.model.User;
import com.itensoft.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	UserMapper userMapper;
	@Resource(name="userMapper")
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	public User findByName(String name) {
		return this.userMapper.findByName(name);
	}


	@Override
	public List<User> loadList(int page, int rows) {
		int start = page*rows;
		int total = this.userMapper.getTotal();
		int res = total-start;
		if(res<0&&page>1){
			rows = rows+res;
		}
		return this.userMapper.loadList(start,rows);
	}


	@Override
	public int getTotal() {
		return this.userMapper.getTotal();
	}


	@Override
	public Boolean addUser(User user) {
		if(this.userMapper.addUser(user)>=1){
			return true;
		}
		return false;
	}


	@Override
	public Boolean update(User user) {
		if(this.userMapper.update(user)>=1){
			return true;
		}
		return false;
	}


	@Override
	public Boolean delete(String name) {
		if(this.userMapper.delete(name)>=1){
			return true;
		}
		return false;
	}


	@Override
	public boolean existUser(String name) {
		int count = this.userMapper.existUser(name);
		if(count == 1){
			return true;
		}
		return false;
	}

}
