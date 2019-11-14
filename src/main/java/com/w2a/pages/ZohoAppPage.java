package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.pages.com.CRMHomePage;

public class ZohoAppPage extends Page {
	
	
/*WebDriver driver;
	
	public ZohoAppPage(WebDriver driver)
	{
		this .driver = driver;
	}
	
	*/
	
	public void gotoChat(){
		
		driver.findElement(By.cssSelector("")).click();
		
	}
	
	public CRMHomePage gotoCRM() throws InterruptedException{
		//driver.findElement(By.cssSelector(".zicon-apps-crm.zicon-apps-96")).click();
		click("crmlink_CSS");
		/*driver.findElement(By.cssSelector(".promo-appicon.promo-crm")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".act-btn.cta-btn")).click();
		Thread.sleep(1000);*/
		
		return new CRMHomePage();
	}
	
/*	public void gotoAccessZohoCRM()
	{
		
	}*/
	
	public void gotoSalesIQ(){
		driver.findElement(By.cssSelector(".zp-apps.zp-salesiq>a>span")).click();
	}

}
