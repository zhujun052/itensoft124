package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.CertMapper;
import com.itensoft.model.Cert;
import com.itensoft.service.CertService;

@Service("certService")
public class CertServiceImpl implements CertService{

	CertMapper certMapper;
	@Resource(name="certMapper")
	public void setCertMapper(CertMapper certMapper) {
		this.certMapper = certMapper;
	}

	@Override
	public List<Cert> getCertsByCode(int id) {
		return this.certMapper.getCertsByCode(id);
	}

	@Override
	public List<Cert> getReceive(int id) {
		return this.certMapper.getReceive(id);
	}

}
