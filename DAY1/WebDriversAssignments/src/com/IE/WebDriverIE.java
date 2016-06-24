package com.IE;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverIE {
	
	@Test
	public void openIEBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\upendrau\\Desktop\\Selenium\\Selenium-for-Training\\IEDriverServer.exe");  //setting property for chrome browser
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.ehow.com/");          //moving to address ehow.com
		driver.manage().window().maximize();         //maximizing the window
		String title=driver.getTitle();
		assertEquals("eHow | How to - Discover the expert in you! | eHow",title);
		driver.findElement(By.xpath(".//*[@id='Footer']/div[1]/div/div/div[2]/div/nav/ul/li[1]/ul/li[1]/a")).click();
		String title2=driver.getTitle();
		assertEquals("About eHow | eHow",title2);
		
	}

}
