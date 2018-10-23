package com.niit.dependencydemo;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Qualifier;
	import org.springframework.stereotype.Component;

	@Component
	public class Traveller {
	@Autowired
	@Qualifier("auto")
	private Vehicle vehicle;

	public String getTravelDetails()
	{
		return vehicle.modeOfTransport();
	}
	public Vehicle getVehicle()
	{
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle=vehicle;
	}
	}




