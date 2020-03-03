package com.incom.report.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.incom.report.beans.reportVO;

public interface reportMapperImpl {
	@Select("SELECT cust_id, cust_name, cust_gender FROM CUSTOMERS")
	List<reportVO> select_data();
	
}
