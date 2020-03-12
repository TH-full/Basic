package com.incom.reprot.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;

import com.incom.report.mapper.reportMapperImpl;;

public class jdbcConfig {
	@Bean 
	public BasicDataSource source() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@[ipaddress]:[port]:[sid]");
		source.setUsername("[userid]");
		source.setPassword("[userpw]");
		
		return source;
	}
	
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
			factoryBean.setDataSource(source);
			SqlSessionFactory factory = factoryBean.getObject();
			
			return factory;
	}
	
	//Mapper 매핑관리 부분
	@Bean
	public MapperFactoryBean<reportMapperImpl> test_mapper(SqlSessionFactory factory) throws Exception {
		
		MapperFactoryBean<reportMapperImpl> factoryBean = new MapperFactoryBean<reportMapperImpl>(reportMapperImpl.class);
			factoryBean.setSqlSessionFactory(factory);
			
			return factoryBean;		
	}	
}
