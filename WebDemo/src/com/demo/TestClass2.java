 package com.demo;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass2 {

	@Test
	public void testRunner() throws IOException
	{
		String []param=new String[]{"C:\\Users\\upendrau\\Documents\\AUTOSCRIPT.exe","Authentication Required","abc","abc"};
		Runtime.getRuntime().exec(param);
		WebDriver wed=new FirefoxDriver();
		wed.get("http://cybintranet.cybage.com/");
		
		
	}
	
	
}
