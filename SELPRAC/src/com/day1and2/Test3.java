package com.day1and2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 
{
	public static WebDriver driver;
	@Test
	  public void test1() throws InterruptedException
	  {
			//For chrome driver
		/* System.setProperty("webdriver.chrome.driver", "D:/Selenium & Other Jars/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.ehow.com/");*/
		 //for IE driver
		/* System.setProperty("webdriver.ie.driver", "D:/Selenium & Other Jars/IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		 driver.get("http://www.ehow.com/");*/
			//For Fire fox driver
			driver=new FirefoxDriver();
			 driver.get("http://www.google.com/");
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 js.executeScript("alert('hello')");
			 Thread.sleep(4000);
			 driver.switchTo().alert().accept();
	  }
		

}
