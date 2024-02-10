package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//*[@id='username']")//password
	public static WebElement EnterMailId;
	
	@FindBy(xpath = "//*[@id='password']")//password
	public static WebElement EnterPassword;
	
	@FindBy(xpath = "//span[text()='Continue']")
	public static WebElement Continuebtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public static String  Enter_Mail_Id(String txt)
	{
		EnterMailId.sendKeys(txt);
		return txt;
		 	
	}
	
	public static String  Enter_Password(String txt)
	{
		EnterPassword.sendKeys(txt);
		return txt;
		 	
	}
	

}
