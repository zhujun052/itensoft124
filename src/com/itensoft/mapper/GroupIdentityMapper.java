package com.itensoft.mapper;

import java.util.List;

import com.itensoft.model.GroupIdentity;

public interface GroupIdentityMapper {

	List<GroupIdentity> loadAll(int code);

}
