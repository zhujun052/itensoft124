package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.PolicyMapper;
import com.itensoft.model.Policy;
import com.itensoft.service.PolicyService;

@Service("policyService")
public class PolicyServiceImpl implements PolicyService{

	PolicyMapper policyMapper;
	@Resource(name="policyMapper")
	public void setPolicyMapper(PolicyMapper policyMapper) {
		this.policyMapper = policyMapper;
	}


	@Override
	public Policy getPolicy(int id) {
		return this.policyMapper.getPolicy(id);
	}
	
}
