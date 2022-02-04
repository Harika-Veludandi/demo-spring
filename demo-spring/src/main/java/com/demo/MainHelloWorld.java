package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainHelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
		/*HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello");
		System.out.println(helloWorld.getMessage());*/
		Student stud = (Student) context.getBean("student");
		stud.setStudId(1);
		stud.setName("abc");
		stud.setAge(24);
		System.out.println(stud.getStudId());
	}
}
