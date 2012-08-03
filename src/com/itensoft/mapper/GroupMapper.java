package com.itensoft.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.itensoft.model.Group;

public interface GroupMapper {

	List<Group> loadByParentCode(@Param("parentCode") int parentCode);

	Group getInfoById(@Param("id") int id);

	int updateAuth(@Param("id")  int id);

	int delete(@Param("id")  int id);

	int getExistC(@Param("id")  int id);

}
