package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	public static WebDriver driver;
	
	@FindBy(xpath = "//*[@class='Xlf40PXlFdF8tN']")
	public static WebElement PlusSymbol;
	
	@FindBy(xpath = "(//*[@class='gJDsPins_eYkBM'])[1]")
	public static WebElement CreateBoard;
	
	@FindBy(xpath = "//*[@data-testid='create-board-submit-button']")
	public static WebElement CreateBtn;
	
	@FindBy(xpath = "//*[@class='qJv26NWQGVKzI9']")
	public static WebElement EnterTitleCard;//(//*[@data-testid='list-add-card-button'])[1]
	
	@FindBy(xpath = "(//*[@data-testid='list-add-card-button'])[1]")
	public static WebElement EnterTitleCardfordoing;
	
	@FindBy(xpath = "(//*[@data-testid='list-add-card-button'])[2]")
	public static WebElement EnterTitleCardfordone;
	
	@FindBy(xpath = "//*[text()='Add card']")
	public static WebElement addcart;
	
	public  DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static void Click_On_Plus_Symbol()
	{
		PlusSymbol.click();
		CreateBoard.click();
		
		////*[@data-testid='create-board-submit-button']
		
	}
	public static String Create_Board(String txt)
	{
		CreateBoard.sendKeys(txt);
		return txt;
	}
	public static void Click_On_Create_Btn()
	{
		CreateBtn.click();
	}
	public static String Enter_Title_card_for_ToDo_AddCart(String txt)
	{
		EnterTitleCard.sendKeys(txt);
		addcart.click();
		return txt;
	}
	
	public static String Enter_Title_card_for_ToDoing_AddCart(String txt)
	{
		EnterTitleCardfordoing.sendKeys(txt);
		addcart.click();
		return txt;
		
	}
	
	public static String Enter_Title_card_for_ToDone_AddCart(String txt)
	{
		EnterTitleCardfordone.sendKeys(txt);
		addcart.click();
		return txt;
		
	}
	
	
}
