package com.demo;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Upload 
{
	@Test
	 public void upload() throws IOException
	 {
		//Run Script
		String []param1=new String[]{"C:\\Users\\upendrau\\Documents\\Auto\\UploadScript.exe","Choose File to Upload"};
		Runtime.getRuntime().exec(param1);
		//Open Cyb and IE
		System.setProperty("webdriver.ie.driver","D:/Selenium & Other Jars/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
	    driver.get("http://cybintranet:8085/HomePage_Applications/Submit%20a%20photo.aspx");
	     
	 }
}
