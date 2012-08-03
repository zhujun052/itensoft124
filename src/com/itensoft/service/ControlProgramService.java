package com.itensoft.service;

import java.util.List;

import com.itensoft.model.Controlprogram;

public interface ControlProgramService {

	List<Controlprogram> getControlProgramByParent(int pid);

}
