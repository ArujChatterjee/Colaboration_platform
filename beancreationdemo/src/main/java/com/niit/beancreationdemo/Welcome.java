package com.niit.beancreationdemo;

public class Welcome {
	private String name;
	public String welcomeMessage()
	{
		return "Welcome"+ name;
	}
	public Welcome()
	{
	    
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}

}
