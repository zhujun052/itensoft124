package com.itensoft.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.itensoft.bean.VmGroup;
import com.itensoft.model.User;
import com.itensoft.model.Virtualmanager;

public interface VirtualManagerMapper {

	int getTotal();

	List<User> loadList(@Param("start") int start,@Param("rows") int rows);
	
	int delete(@Param("id") int id);

	int insertin(@Param("addsql") String addsql);

	int update(@Param("updatesql") String updatesql);

	void updatesql(@Param("updatesql") String updatesql);

	List<Virtualmanager> getVmsByGCode(@Param("code") int code);

	List<Virtualmanager> getVirtualManagerAll(@Param("code") int code);

	List<Virtualmanager> getVirtualManagerSel(@Param("code") int code);

}
