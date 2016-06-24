package com.day1and2;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test6 {

	private WebDriver driver;
	@Test
	public void start()
	{
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.get("https://www.google.co.in");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input")).sendKeys("pune");
	   System.out.println( driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul")).getText());
	}
}
