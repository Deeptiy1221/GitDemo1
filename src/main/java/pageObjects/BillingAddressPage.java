package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BillingAddressPage {
	public WebDriver driver;
	By selectCountry=By.id("BillingNewAddress_CountryId");
	By selectState=By.id("BillingNewAddress_StateProvinceId");
	By city=By.id("BillingNewAddress_City");
	By address=By.id("BillingNewAddress_Address1");
	By zipCode=By.id("BillingNewAddress_ZipPostalCode");
	By phno=By.id("BillingNewAddress_PhoneNumber");
	By save=By.xpath("//div[@id='billing-buttons-container']/button[4]");
	public BillingAddressPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void selectCountry(String country) {
		 WebElement countries = driver.findElement(selectCountry);
		Select countryDropDown = new Select(countries);
		countryDropDown.selectByVisibleText(country);
	
		
		}
	
	public void selectState(String state) {
		 WebElement states = driver.findElement(selectState);
		Select stateDropDown = new Select(states);
		stateDropDown.selectByVisibleText(state);
		
		}
	public void setCity(String cityName) {
		driver.findElement(city).sendKeys(cityName);
	}
	public void setAddress(String bAddress) {
		driver.findElement(address).sendKeys(bAddress);
	}
	public void setZipCode(String zip) {
		driver.findElement(zipCode).sendKeys(zip);;
	}
	public void setPhno(String bPhno) {
		driver.findElement(address).sendKeys(bPhno);
	}
	public void clickContinue() {
		driver.findElement(save).click();
	}
	
}
