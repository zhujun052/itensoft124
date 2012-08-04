package com.itensoft.service;

import java.util.List;

import com.itensoft.model.Cert;

public interface CertService {

	List<Cert> getCertsByCode(int id);

	List<Cert> getReceive(int id);

	List<Cert> getAvailableIdentityList(int code);

	List<Cert> getSelectedIdentityList(int code);

	List<Cert> getAvailableRecverList(int code);

	List<Cert> getSelectedRecverList(int code);

}
