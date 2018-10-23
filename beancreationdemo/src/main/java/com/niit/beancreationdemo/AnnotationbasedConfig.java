package com.niit.beancreationdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationbasedConfig {
	public static void main (String args[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		HelloWorld helloworld =(HelloWorld)context.getBean(HelloWorld.class);
		System.out.println(helloworld.sayHello());
		HelloWorld helloworld1 =(HelloWorld)context.getBean("helloworld");
		System.out.println(helloworld1.sayHello());
		System.out.println(helloworld1==helloworld);
	
	Welcome welcome =(Welcome)context.getBean("welcome");
	System.out.println("Name of the user "+ welcome.getName());
	System.out.println(welcome.welcomeMessage());
	
	}
	

}
