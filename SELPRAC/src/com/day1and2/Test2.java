package com.day1and2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static WebDriver driver;
	@Test
  public void test1() throws InterruptedException
  {
		//For chrome driver
	 System.setProperty("webdriver.chrome.driver", "D:/Selenium & Other Jars/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://www.makemytrip.com/");
	 //for IE driver
	/* System.setProperty("webdriver.ie.driver", "D:/Selenium & Other Jars/IEDriverServer.exe");
	 driver=new InternetExplorerDriver();
	 driver.get("http://www.ehow.com/");*/
		//For Fire fox driver
	/*	driver=new FirefoxDriver();
		 driver.get("http://www.ehow.com/");*/
	 
		Thread.sleep(5000);
	   //Click using xpath
	 driver.findElement(By.xpath("html/body/div[6]/div[1]/div/div/div[1]/div/div[2]/ul/li[2]/a/span[1]")).click();
	 	/*driver.findElement(By.id("widget_row")).click();
	 	driver.findElement(By.id("from_city_data_box")).sendKeys("Koregaon Park, Pune");
	 	driver.findElement(By.id("from_city_data_box")).click();
	 	driver.findElement(By.xpath(".//*[@id='hotels_submit']")).click();
	 	driver.findElement(By.cssSelector(".pull-right modify_search_toggle")).click();*/
  }
}
