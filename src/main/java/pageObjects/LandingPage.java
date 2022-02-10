package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LandingPage {
	

	public WebDriver driver;

	public LandingPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	

	
	By logIn=By.cssSelector("a[href*='login']");
	
	By register=By.className("ico-register");
	By jewelry=By.xpath("//ul[@class='top-menu notmobile']/li[6]");
	By shoppingCart =By.id("topcartlink");
	
	public void clickShoppingCart() {
		driver.findElement(shoppingCart).click();
	}
	
	public void clickJewelryLink()
	{
		 driver.findElement(jewelry).click();
	}
			
	public void clickLoginLink()
	{
		 driver.findElement(logIn).click();
	}
	
	public void clickRegisterLink()
	{
		 driver.findElement(register).click();
	}
	
}

