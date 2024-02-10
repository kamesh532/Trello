package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//*[text()='Log in'])[1]")
	public static WebElement Loginbtn;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public static void Click_On_Login()
	{
		Loginbtn.click();
	}
}