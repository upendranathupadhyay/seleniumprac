package com.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	@Test
	public void locatorsByCssSelectors()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upendrau\\Desktop\\Selenium\\Selenium-for-Training\\chromedriver.exe");  //setting property for chrome browser by providing path of chrome.exe
		WebDriver driver=new ChromeDriver();   
		driver.get("https://www.makemytrip.com/");  //moving to address makemytrip.com 
		driver.manage().window().maximize();       //maximizing window
		driver.findElement(By.linkText("Hotels")).click(); //clicking the hotel link
		driver.findElement(By.cssSelector("#from_city_data_box")).sendKeys("Pune");//putting the required text
		driver.findElement(By.cssSelector(".nights_dropdown>p"));        //selecting the required nights
		driver.findElement(By.cssSelector("#hotels_submit")).click();    //clicking on submit button
		driver.findElement(By.cssSelector(".pull-left.hotel_name.ng-binding")).click(); //clicking on hotel link
		String title=driver.getTitle();  //gettinh the page title

		//checking if hotel exist or not
		if(title.equals("St Laurn Business Hotel (Pune) Details | Book St Laurn Business Hotel at MakeMyTrip | Find Last Minute deals for St Laurn Business Hotel (Pune) Online"))
		{
			System.out.println("Hotel Found");
		}
		else
		{
			System.out.println("No Hotel Found");
		}
		
	}
	
}
