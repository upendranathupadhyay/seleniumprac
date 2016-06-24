package com.day1and2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class Test1 
{
	public static WebDriver driver;
	@Test
  public void test1()
  {
		//For chrome driver
	 System.setProperty("webdriver.chrome.driver", "D:/Selenium & Other Jars/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://www.ehow.com/");
	 //for IE driver
	/* System.setProperty("webdriver.ie.driver", "D:/Selenium & Other Jars/IEDriverServer.exe");
	 driver=new InternetExplorerDriver();
	 driver.get("http://www.ehow.com/");*/
		//For Fire fox driver
	/*	driver=new FirefoxDriver();
		 driver.get("http://www.ehow.com/");*/
	 //GET PAGE TITLE
		/* String title=driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals(title, "eHow | How to - Discover the expert in you! | eHow");*/
	   //Click using xpath
	 driver.findElement(By.xpath(".//*[@id='Footer']/div[1]/div/div/div[2]/div/nav/ul/li[1]/ul/li[1]/a")).click();
	 	//driver.findElement(By.cssSelector(".column col-xs-12 col-sm-6 col-md-4.title[1]")).click();
  }
	
}
