package com.fullth.test.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.fullth.test.di.Customer;
import com.fullth.test.di.Local;
import com.fullth.test.di.Overseas;
import com.fullth.test.javatest.TestBean_Student;

@Repository
@Configuration //이 어노테이션은 스프링 IoC컨테이너에게 해당 클래스를 Bean구성 클래스임을 알려주는 것이다.
@ComponentScan(basePackages =  {"com.incom.report.beans"})
public class BeansConfig {
	
	//@Bean은 개발자가 직접 제어가 불가능한 외부 라이브러리등을 Bean으로 만들려는 경우 사용한다.
	@Bean(name = "arrayTest") //arrayTest라는 Bean이 생성됨.
	public ArrayList<String> array(){
		return new ArrayList<String>();
	}
	
	@Bean
	public TestBean_Student student() {
		return new TestBean_Student();
	}
	
	@Bean
	public Local local() {
		Local l1 = new Local();
		return l1;
	}
	
	@Bean
	public Overseas overseas() {
		Overseas o1 = new Overseas();
		return o1;
	}
	
	@Bean
	public Customer customer() {
		Customer c1 = new Customer(null);
		return c1;
	}
}
