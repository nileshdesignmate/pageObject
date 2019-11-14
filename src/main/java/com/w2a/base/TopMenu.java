package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver){
		this.driver = driver;
	}
	
	public void gotoHome()
	{
		
	}
	
	public void gotoFeeds()
	{
		
	}
	
	public void gotoLeads()
	{
		
	}
	
	public AccountsPage gotoAccounts() throws InterruptedException
	{
		//driver.findElement(By.cssSelector(".lyteItem>a")).click();
		//driver.findElement(By.xpath(".//*[@id='mainMenuTabDiv']/crm-menu/div[1]/crm-tab/div[2]/div[4]/a")).click();
		Page.click("accountstab_XPATH");
		Thread.sleep(2000);
		return new AccountsPage();
	}
	public void gotoContacts()
	{
		
	}
	
	public void signOut()
	{
		
	}

}
