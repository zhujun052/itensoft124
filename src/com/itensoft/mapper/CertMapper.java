package com.itensoft.mapper;

import java.util.List;

import com.itensoft.model.Cert;

public interface CertMapper {

	List<Cert> getCertsByCode(int code);

	List<Cert> getReceive(int code);

}
