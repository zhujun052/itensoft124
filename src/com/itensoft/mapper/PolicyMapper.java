package com.itensoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itensoft.model.Policy;

public interface PolicyMapper {

	Policy getPolicy(@Param("code") int code);

}
