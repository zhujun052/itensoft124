package com.itensoft.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.itensoft.model.Grouprecver;

public interface GroupRecverMapper {

	List<Grouprecver> loadAll(@Param("code") int code);

}
