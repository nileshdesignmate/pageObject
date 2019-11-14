package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;



public class HomePage extends Page
{
	/*WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	*/
	public void goToSupport()
	{
		driver.findElement(By.cssSelector(".signing>a:nth-child(2)")).click();
	}
	
	public void goToSignup()
	{

		driver.findElement(By.cssSelector(".signup")).click();
	}

	public LoginPage goToLogin() throws InterruptedException
	{
		click("loginlink_CSS");
		Thread.sleep(3000);
		return new LoginPage();
	}
	
	public void goToZOhoEdu()
	{
		
	}
	
	public void goToLearnMore()
	{
		
	}
	
	public void ValidateFooterLinks()
	{
		
	}
}
