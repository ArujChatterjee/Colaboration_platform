package com.niit.beancreationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	@Bean
	public HelloWorld helloworld()
		{
			return new HelloWorld();
		}
	@Bean
	public Welcome welcome()
	{
		Welcome welcome =new Welcome();
		welcome.setName("John");
		return welcome;
	}
		
	}
