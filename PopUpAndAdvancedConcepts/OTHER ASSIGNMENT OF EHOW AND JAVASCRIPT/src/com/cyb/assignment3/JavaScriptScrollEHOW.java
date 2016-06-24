package com.popup;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Scroller {

	
	private WebDriver driver;
	
	@Test
	public void TestCommerce() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium & Other Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.ehow.com");
		
		Actions builder = new Actions(driver);
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,4300)");
		Thread.sleep(3000);
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
package com.cyb.assignment3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptScroll {
	@Test
	public void scrollDown() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ehow.com");

		// maximize the window
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

		// get the current window handle
		String parentHandle = driver.getWindowHandle();

		// click some link that opens a new window
		driver.findElement(By.xpath(".//*[@class='icons unstyled inline']/li[3]/a")).click();

		for (String winHandle : driver.getWindowHandles()) {
			// switch focus of WebDriver to the next found window handle (that's
			// your newly opened window)
			driver.switchTo().window(winHandle);
		}

		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentHandle);
		System.out.println(driver.getTitle());
	}

}
