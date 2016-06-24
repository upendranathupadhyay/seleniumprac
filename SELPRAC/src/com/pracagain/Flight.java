package com.pracagain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight 
{
	private WebDriver driver;
	@FindBy(xpath="html/body/div[5]/div[1]/div/div/div[1]/div/div[3]/div/div[5]/div/div[1]/div/div[1]/span/input")
	WebElement searchSource;
	@FindBy(xpath="html/body/div[5]/div[1]/div/div/div[1]/div/div[3]/div/div[5]/div/div[3]/div/div[1]/span/input")
	WebElement searchDestination;
	public Flight(WebDriver driver) 
	{
		
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	public void searchSource()
	{
	    searchSource.sendKeys("Pune");	
	    searchSource.click();
	}
	public void searchDestination()
	{
		searchDestination.sendKeys("New Delhi, India (DEL)");
		searchDestination.click();
	}
	public void searchFlight()
	{
		searchSource();
		searchDestination();
	}
}
