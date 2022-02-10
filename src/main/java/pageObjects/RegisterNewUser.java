package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterNewUser {

	
	
public WebDriver driver;
Select staticDropDown;
	
	By radioMale=By.id("gender-male");
	By radioFemale=By.id("gender-female");
	By fName=By.cssSelector("input[id='FirstName']");
	By lName=By.cssSelector("input[name='LastName']");
	By email=By.id("Email");
	By password=By.id("Password");
	By cpassword=By.id("ConfirmPassword");
	By register=By.name("register-button");
	By day=By.name("DateOfBirthDay");
	By month=By.name("DateOfBirthMonth");
	By year=By.name("DateOfBirthYear");
	By continueHome=By.xpath("//a[@class='button-1 register-continue-button']");
	
	By registrationComplete=By.xpath("//div[@class='result']");
	By registrationErrorMessage=By.xpath("//div[@class='message-error validation-summary-errors']");
	public RegisterNewUser(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getRadioMale()
	{
		return driver.findElement(radioMale);
	}
	public WebElement getRadioFemale()
	{
		return driver.findElement(radioFemale);
	}
	public WebElement getFirstName()
	{
		return driver.findElement(fName);
	}
	
	public void setFirstName(String firstName) {
		driver.findElement(fName).sendKeys(firstName);
	}
	public WebElement getLastName()
	{
		return driver.findElement(lName);
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getConfirmPassword()
	{
		return driver.findElement(cpassword);
	}
	public WebElement getDay()
	{
		return driver.findElement(day);
		
	}
	
	public void setDay(int index) {
		 Select dropDownDay= new Select(driver.findElement(day));
		 dropDownDay.selectByIndex(index);
		 
	}
	public WebElement getMonth()
	{  

		return driver.findElement(month);
	}
	public void setMonth(int index) {
		 Select dropDownMonth= new Select(driver.findElement(month));
		 dropDownMonth.selectByIndex(index);
		 
	}

	public WebElement getYear()
	{
		return driver.findElement(year);
	}
	public void setYear(String value) {
		 Select dropDownYear= new Select(driver.findElement(year));
		 dropDownYear.selectByValue(value);
		 
	}
	
	public WebElement getRegister()
	{
		return driver.findElement(register);
	}

	public void registeringMaleUser(String fName, String lName,int dayIndex,int monthIndex,String yearValue,String email,String password,String cPassword) throws Exception
	{  	System.out.println(email);
	System.out.println(password);
		getRadioMale().click();
	    getFirstName().sendKeys(fName);
	    getLastName().sendKeys(lName);
	    setDay(dayIndex);
	    setMonth(monthIndex);
	    setYear(yearValue);
	    getEmail().sendKeys(email);
		getPassword().sendKeys(password);
		getConfirmPassword().sendKeys(cPassword);
		Thread.sleep(1000);
		getRegister().click();
		Thread.sleep(1000);
		
		
	}
	
	public boolean continueHome()
	
	{  
		 List<WebElement> webElements = driver.findElements(registrationComplete);
		if (webElements.size()!=0 && webElements.get(0).getText().equalsIgnoreCase("Your registration completed")) {
		driver.findElement(continueHome).click();
		return true;
	}
	else {
		return false;
	}
	   // if(driver.findElement(registrationErrorMessage).getText().equalsIgnoreCase("The specified email already exists"));
	       
	
	}
	


	public void close() {
		// TODO Auto-generated method stub
		driver.close();
	}
}
