package com.niit.dependencydemo;

	import org.springframework.stereotype.Component;

	@Component
	public class Auto implements Vehicle {
		public String modeOfTransport()
		{
			return "Mode of transport is Auto";
		}

	}

