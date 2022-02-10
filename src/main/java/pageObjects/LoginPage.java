package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By email=By.id("Email");
	By password=By.id("Password");
	By login=By.cssSelector("button[class*='login-button']");
	
	
	public LoginPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}

	public void login(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
		getEmail().sendKeys(username);
		getPassword().sendKeys(password);
		getLogin().click();
		
	}


	public void close() {
		// TODO Auto-generated method stub
		driver.close();
	}
}
