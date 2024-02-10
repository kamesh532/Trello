package com.Tests;

import org.testng.annotations.Test;

import com.BaseTest.BaseSetup;
import com.Pages.DashboardPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;

public class TestClass extends BaseSetup {
	

	HomePage hm;
	LoginPage login;
	DashboardPage Db;
	
	@Test(priority = 0)
	public void ClickOnLogin()
	{
		hm=new HomePage(getDriver());
		hm.Click_On_Login();
		
	}
	
	@Test(priority = 1)
public void EnterLoginCred()
{
		hm=new HomePage(getDriver());
		login=new LoginPage(getDriver());
		
		//Time saving iam hard-codding the values
		login.Enter_Mail_Id("532Kamesh@gmail.com");
		login.Enter_Password("Kamesh532@");
		hm.Click_On_Login();
		
}
	@Test(priority = 2, dependsOnMethods = "EnterLoginCred")
	public void ClickOnPlus()
	{
		Db=new DashboardPage(getDriver());
		Db.Click_On_Plus_Symbol();
		Db.Create_Board("Task1");
		Db.Click_On_Create_Btn();
		Db.Enter_Title_card_for_ToDo_AddCart("t0");
		Db.Enter_Title_card_for_ToDo_AddCart("t2");
		Db.Enter_Title_card_for_ToDoing_AddCart("s0");
		Db.Enter_Title_card_for_ToDoing_AddCart("s1");
		Db.Enter_Title_card_for_ToDone_AddCart("r0");
		Db.Enter_Title_card_for_ToDone_AddCart("r1");
	}
}
