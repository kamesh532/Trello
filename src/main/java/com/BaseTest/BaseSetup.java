package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSetup {
	
	static WebDriver driver;

	@BeforeClass
	public void setUp()
	{
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guru\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://trello.com/home");
		driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
		
	}
	@BeforeClass
	public void tearDown()
	{
		driver.close();
	}
	

}
