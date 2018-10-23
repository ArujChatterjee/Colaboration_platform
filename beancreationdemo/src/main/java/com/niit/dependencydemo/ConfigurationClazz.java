package com.niit.dependencydemo;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;

	@Configuration
	@ComponentScan(basePackages="com.niit.dependencydemo")
	public class ConfigurationClazz {
		
	}


