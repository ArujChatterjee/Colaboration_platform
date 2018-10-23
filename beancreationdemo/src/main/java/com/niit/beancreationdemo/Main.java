package com.niit.beancreationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main (String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		HelloWorld helloworld =(HelloWorld)context.getBean(HelloWorld.class);
		System.out.println(helloworld.sayHello());
		HelloWorld helloworld1 =(HelloWorld)context.getBean("helloworld");
		System.out.println(helloworld1.sayHello());
		System.out.println(helloworld1==helloworld);
		
		/*Welcome welcome =(Welcome)context.getBean("welcome");
		System.out.println("Name of the user "+ welcome.getName());
		System.out.println(welcome.welcomeMessage());*/
		
	}

}




