package com.itensoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itensoft.model.Cert;
import com.itensoft.model.GroupIdentity;
import com.itensoft.model.Grouprecver;

public interface CertMapper {

	List<Cert> getCertsByCode(@Param("code") int code);

	List<Cert> getReceive(@Param("code") int code);

	List<Cert> loadAll(@Param("code") int code);

	List<Cert> getAvailableIdentityList(@Param("list") List<GroupIdentity> list);

	List<Cert> getSelectedIdentityList(@Param("list") List<GroupIdentity> list);

	List<Cert> getAvailableRecverList(@Param("list") List<Grouprecver> list);

	List<Cert> getSelectedRecverList(@Param("list") List<Grouprecver> list);

	List<Cert> loadCerts();

}
