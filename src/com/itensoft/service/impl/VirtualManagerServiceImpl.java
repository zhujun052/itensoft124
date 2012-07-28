package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.VirtualManagerMapper;
import com.itensoft.model.User;
import com.itensoft.service.VirtualManagerService;

@Service("virtualManagerService")
public class VirtualManagerServiceImpl implements VirtualManagerService{
	
	VirtualManagerMapper virtualManagerMapper;
	@Resource(name="virtualManagerMapper")
	public void setVirtualManagerMapper(VirtualManagerMapper virtualManagerMapper) {
		this.virtualManagerMapper = virtualManagerMapper;
	}

	@Override
	public int getTotal() {
		return this.virtualManagerMapper.getTotal();
	}

	@Override
	public List<User> loadList(int page, int rows) {
		int start = page*rows;
		int total = this.virtualManagerMapper.getTotal();
		int res = total-start;
		if(res<0&&page>1){
			rows = rows+res;
		}
		return this.virtualManagerMapper.loadList(start,rows);
	}

}
