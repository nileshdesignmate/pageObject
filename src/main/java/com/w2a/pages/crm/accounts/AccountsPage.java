package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page {
	
	

	public CreateAccountPage gotoCreateAccounts() throws InterruptedException
	{
		//driver.findElement(By.cssSelector(".lyte-button.lytePrimaryBtn")).click();
		click("createaccountbtn_CSS");
		Thread.sleep(2000);
		return new CreateAccountPage();
	}
	
	public void gotoImportAccounts()
	{
		
	}
}
