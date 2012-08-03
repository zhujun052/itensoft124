package com.itensoft.service;

import java.util.List;

import com.itensoft.model.Cert;

public interface CertService {

	List<Cert> getCertsByCode(int id);

	List<Cert> getReceive(int id);

}
