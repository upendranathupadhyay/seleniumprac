package com.chrome;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;


public class WebDriverChrome {

	@Test
	public void openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upendrau\\Desktop\\Selenium\\Selenium-for-Training\\chromedriver.exe");  //setting property for chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ehow.com/");          //moving to address ehow.com
		driver.manage().window().maximize();         //maximizing the window
		String title=driver.getTitle();
		assertEquals("eHow | How to - Discover the expert in you! | eHow",title);
		driver.findElement(By.xpath(".//*[@id='Footer']/div[1]/div/div/div[2]/div/nav/ul/li[1]/ul/li[1]/a")).click();
		String title2=driver.getTitle();
		assertEquals("About eHow | eHow",title2);
		
	}
	
}
