package com.demo;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Authen 
{
	@Test
   public void test() throws IOException
   {
		//Authentication USIING FIREFOXDRIVER
/*	   String[] test=new String[]{"C:\\Users\\upendrau\\Documents\\Auto\\auto.exe","Authentication Required","up","up"};
      Runtime.getRuntime().exec(test);
      WebDriver driver=new FirefoxDriver();
      driver.get("http://cybintranet.cybage.com/");*/
		
		//Authebtication via IE DRIVER
		String []param=new String[]{"D:\\AutoScriptFiles\\MISScript.exe","Authentication Required","up","up"};
		Runtime.getRuntime().exec(param);
		System.setProperty("webdriver.ie.driver","D:/Selenium & Other Jars/IEDriverServer.exe");
		WebDriver wd=new InternetExplorerDriver();
		wd.get("http://cybagemis.cybage.com/Framework/Iframe.aspx");
		
      
   }
}
