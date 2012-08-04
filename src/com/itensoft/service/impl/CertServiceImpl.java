package com.itensoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.CertMapper;
import com.itensoft.mapper.GroupIdentityMapper;
import com.itensoft.mapper.GroupRecverMapper;
import com.itensoft.model.Cert;
import com.itensoft.model.GroupIdentity;
import com.itensoft.model.Grouprecver;
import com.itensoft.service.CertService;

@Service("certService")
public class CertServiceImpl implements CertService{

	GroupRecverMapper groupRecverMapper;
	@Resource(name="groupRecverMapper")
	public void setGroupRecverMapper(GroupRecverMapper groupRecverMapper) {
		this.groupRecverMapper = groupRecverMapper;
	}

	CertMapper certMapper;
	@Resource(name="certMapper")
	public void setCertMapper(CertMapper certMapper) {
		this.certMapper = certMapper;
	}
	
	GroupIdentityMapper groupIdentityMapper;
	@Resource(name="groupIdentityMapper")
	public void setGroupIdentityMapper(GroupIdentityMapper groupIdentityMapper) {
		this.groupIdentityMapper = groupIdentityMapper;
	}

	@Override
	public List<Cert> getCertsByCode(int id) {
		return this.certMapper.getCertsByCode(id);
	}

	@Override
	public List<Cert> getReceive(int id) {
		return this.certMapper.getReceive(id);
	}
	
	public List<Cert> loadAll(int code){
		return this.certMapper.loadAll(code);
	}

	@Override
	public List<Cert> getAvailableIdentityList(int code) {
		List<GroupIdentity> list = this.groupIdentityMapper.loadAll(code);
		if(list.size()>0){
			return this.certMapper.getAvailableIdentityList(list);
		}else{
			return this.certMapper.loadCerts();
		}
	}

	@Override
	public List<Cert> getSelectedIdentityList(int code) {
		List<GroupIdentity> list = this.groupIdentityMapper.loadAll(code);
		if(list.size()>0){
			return this.certMapper.getSelectedIdentityList(list);
		}
		return new ArrayList<Cert>();
	}

	@Override
	public List<Cert> getAvailableRecverList(int code) {
		List<Grouprecver> list = this.groupRecverMapper.loadAll(code);
		if(list.size()>0){
			return this.certMapper.getAvailableRecverList(list);
		}else{
			return this.certMapper.loadCerts();
		}
	}

	@Override
	public List<Cert> getSelectedRecverList(int code) {
		List<Grouprecver> list = this.groupRecverMapper.loadAll(code);
		if(list.size()>0){
			return this.certMapper.getSelectedRecverList(list);
		}
		return new ArrayList<Cert>();
	}

}
