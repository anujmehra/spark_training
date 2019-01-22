package com.poc.springxml.setterbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String args[]){
		final ApplicationContext context = new ClassPathXmlApplicationContext("setter-spring-config.xml");
		
		final ClassB classB = (ClassB)context.getBean("classB");
		
		classB.doWork();
	}
}
