package com.niit.TempConversionUser;

import com.niit.temperatureconversion.TempConversion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        TempConversion tc= new TempConversion();
        System.out.println(tc.celciusToFarenheit(20) +"F");
        System.out.println(tc.farenheitToCelcius(98) +"C");
    }
}
