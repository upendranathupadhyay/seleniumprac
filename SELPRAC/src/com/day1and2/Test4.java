package com.day1and2;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4
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
			 driver.get("http://www.ehow.com/");
			 Actions builder=new Actions(driver);
			 JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0,4300)");
			 WebElement element = driver.findElement(By.xpath(".//*[@id='Footer']/div[1]/div/div/div[3]/div/div[2]/ul/li[3]/a"));
				
				builder.moveToElement(element).build().perform();
				
				element.click();
				HandleWindow("eHow (@eHow) | Twitter");
				
				HandleWindow("eHow | How to - Discover the expert in you! | eHow");
			 
	  }
	public void HandleWindow(String s)
	{
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		
		for(String window : windows)
		{
			driver.switchTo().window(window);
			if(driver.getTitle().contains(s))
			{
				System.out.println(driver.getTitle());
				break;
			}
		}
		return;
	}
	
}
