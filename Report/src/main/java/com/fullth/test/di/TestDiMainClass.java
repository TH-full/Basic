package com.fullth.test.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fullth.test.config.BeansConfig;

public class TestDiMainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeansConfig.class);
		
		Local local = (Local) context.getBean("local");
		local.setCompanyName("Incom");
		local.LogisticsType();
		
		Overseas overseas = (Overseas) context.getBean("overseas");
		overseas.setCompanyName("Incom");
		overseas.LogisticsType();
	}

}
