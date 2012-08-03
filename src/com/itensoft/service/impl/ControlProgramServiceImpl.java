package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.mapper.ControlProgramMapper;
import com.itensoft.model.Controlprogram;
import com.itensoft.service.ControlProgramService;

@Service("controlProgramService")
public class ControlProgramServiceImpl implements ControlProgramService {
	
	ControlProgramMapper controlProgramMapper;
	@Resource(name="controlProgramMapper")
	public void setControlProgramMapper(ControlProgramMapper controlProgramMapper) {
		this.controlProgramMapper = controlProgramMapper;
	}


	@Override
	public List<Controlprogram> getControlProgramByParent(int pid) {
		return this.controlProgramMapper.getControlProgramByParent(pid);
	}

}
