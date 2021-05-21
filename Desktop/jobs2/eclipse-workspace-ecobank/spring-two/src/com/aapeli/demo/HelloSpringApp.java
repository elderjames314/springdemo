package com.aapeli.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load application context
		
		ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve  bean
		
		Excercise excercise = appcontext.getBean("afam", Excercise.class);
		
		//use methods
		
		System.out.println(excercise.getDailyExcercise());
		
		
		appcontext.close();
	}

}
