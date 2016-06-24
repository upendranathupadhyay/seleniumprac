package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locators {

	@org.junit.Test
	public void locatorsbyXpath() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upendrau\\Desktop\\Selenium\\Selenium-for-Training\\chromedriver.exe");  //setting property for chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");   //moving to address makemytrip
		driver.manage().window().maximize();         //maximizing the window
		driver.findElement(By.linkText("Hotels")).click();  //clicking the hotel link
		driver.findElement(By.xpath(".//*[@id='from_city_data_box']")).sendKeys("Pune");//putting the required text in text box
		driver.findElement(By.xpath(".//*[@id='nightAnchor']/div/p[2]"));      //selecting required value from dropdown box
		driver.findElement(By.xpath(".//*[@id='hotels_submit']")).click();      //clicking on submit button
		driver.findElement(By.xpath(".//*[@id='hotelsListing']/div[1]/div[3]/div[7]/div[3]/div[2]/div/div/div/div/div[2]/div[2]/p[1]/span[1]/a")).click(); //clicking on hotel link
		String title=driver.getTitle();  //getting title
		
		//checking if hotel exist or not
		if(title.equals("St Laurn Business Hotel (Pune) Details | Book St Laurn Business Hotel at MakeMyTrip | Find Last Minute deals for St Laurn Business Hotel (Pune) Online"))
		{
			System.out.println("Hotel Found");
		}
			
	}
	
}
