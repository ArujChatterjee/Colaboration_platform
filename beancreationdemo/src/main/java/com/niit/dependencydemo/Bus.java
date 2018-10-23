package com.niit.dependencydemo;

	import org.springframework.stereotype.Component;

	@Component
	public class Bus implements Vehicle {
		public String modeOfTransport()
		{
			return "Mode of transport is Bus";
		}

	}



