package com.fullth.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fullth.test.config.BeansConfig;
import com.fullth.test.javatest.TestBean_Student;

public class Main {

	public static void main(String[] args) {
		//어노테이션을 기반으로 Bean을 등록했으므로 AnnotationConfigApplicationContext객체를 생성.
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(BeansConfig.class);
		TestBean_Student student = context.getBean("student", TestBean_Student.class );
	}

}
