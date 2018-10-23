package com.niit.dependencydemo;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	public class Driver
	{
		public static void main (String args[])
		{
			ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClazz.class);
		Traveller traveller =(Traveller)context.getBean("traveller");
		System.out.println(traveller.getTravelDetails());
		}
		}


