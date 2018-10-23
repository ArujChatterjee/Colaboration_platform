package com.niit.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // is to create a bean in SPRING CONTAINER
public class HomeController {
	
	public HomeController(){
		System.out.println("HomeController bean is Created");
	}
	
	
	
    @RequestMapping(value="/home")   //  /home - KEY in Handler Map
	public String getHomePage(){  //  getHomePage() is the Value in Handler map
    	System.out.println("Entering getHomePage() method in HomeController"); 
		return "homePage";   //logical view name
	}
    
    
    @RequestMapping(value="/aboutus")
    public String aboutUs(){
    	return "aboutusPage";
    }
    @RequestMapping(value="/nameform")
    public String getNameForm()
    {
    	return "nameform";
    }
    @RequestMapping(value="/welcome")
    public String welcomeMessage(HttpServletRequest request,Model model){
    	//Input
    	String username=request.getParameter("username");
    	System.out.println("Name of the user is " + username);
    	//NOT sending any data to the welcomePage.jsp
    	//Model to welcomePage.jsp
    	//Key - name
    	//value - value of username
    	model.addAttribute("name",username);
    	return "welcomePage";
    }
}