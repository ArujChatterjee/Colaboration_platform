package com.niit.temperatureconversion;

public class TempConversion {
	public static double farenheitToCelcius(double farenheit){
		return (farenheit - 32)*5/9;
	}
	public static double celciusToFarenheit(double celcius){
		return (celcius * 9/5)+32;
	}

}
