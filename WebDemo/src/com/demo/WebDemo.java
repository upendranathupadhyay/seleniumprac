package com.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDemo 


{
	@Test
	public  void testdemo() throws MalformedURLException {		
	

	@SuppressWarnings("unused")
	DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	URL url = new URL("http","localhost",4444,"/wd/hub");
	capabilities.setJavascriptEnabled(true);
	WebDriver driver=new RemoteWebDriver(url,capabilities);
	//PUT an time OUT
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.navigate().to("http://www.calculator.net/");
	  // Click on Math Calculators
	  driver.findElement(By.xpath(".//*[@id='hcalc']/table/tbody/tr/td[2]/div[3]/a")).click();
	  // Click on Percent Calculators
	  driver.findElement(By.xpath(".//*[@id='content']/ul[1]/li[3]/a")).click();
	//Add element to box;
	  driver.findElement(By.id("cpar1")).sendKeys("20");
	  //Add element to 2nd box
	  driver.findElement(By.id("cpar2")).sendKeys("400");
	  driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();
	  
	}
	
}
