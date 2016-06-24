package com.nopcommerce;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NopCommerce 
{
public  WebDriver driver;
	
	@Test
	public void testCase() throws MalformedURLException
	{
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		URL url = new URL("http","localhost",4444,"/wd/hub");
		capabilities.setJavascriptEnabled(true);
		WebDriver driver=new RemoteWebDriver(url,capabilities);
      //open website
		driver.get("http://demo.nopcommerce.com/");
		//Print tab of footer
		/*String value=driver.findElement(By.xpath("html/body/div[5]/div[4]/div[1]/div[2]/div/strong/div[2]/")).getText();
        System.out.println(value);*/
		driver.findElement(By.xpath("html/body/div[5]/div[4]/div[1]/div[2]/ul/li[5]/a[1]")).click();
		//3.	Click on �Compare products list� link.
		driver.findElement(By.xpath("html/body/div[5]/div[1]/div[2]/div[1]/a/img")).click();
		//4.	Go back to main page.
		driver.findElement(By.xpath(".//*[@id='small-searchterms']")).sendKeys("laptop");
			driver.findElement(By.xpath(".//*[@id='small-search-box-form']/input[2]")).click();
	}

}
