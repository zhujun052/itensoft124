package com.itensoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itensoft.model.Controlprogram;

public interface ControlProgramMapper {

	List<Controlprogram> getControlProgramByParent(@Param("pid") int pid);

}
