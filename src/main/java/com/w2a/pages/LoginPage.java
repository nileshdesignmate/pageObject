package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LoginPage extends Page {
	
	
	/*WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}*/
	
	public ZohoAppPage doLogin(String username, String password) throws InterruptedException{
		
		type("email_CSS", username);
		type("password_CSS", password);
		click("keepme_CSS");
		Thread.sleep(1000);
		click("signbtn_CSS");
		
		return new ZohoAppPage();
	}
	
	public void gotoSalesandMarketing(){
		
	}
	public void gotoFinance(){
		
	}

}
