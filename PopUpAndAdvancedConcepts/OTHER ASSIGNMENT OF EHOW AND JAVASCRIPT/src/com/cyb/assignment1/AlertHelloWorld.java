package com.cyb.assignment1;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHelloWorld {
	@Test
	public void alertHello() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("alert('Hello World');");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
 
		
	}

}
