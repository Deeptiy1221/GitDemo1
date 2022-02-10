package qarahulacademy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pageObjects.BillingAddressPage;
import pageObjects.CartPage;
import pageObjects.JewelryPage;
import pageObjects.LandingPage;
import pageObjects.LaunchWebsite;


public class JewelrySearchTest {
	
	LaunchWebsite launchWeb=new LaunchWebsite();
	LandingPage landingPage ;
	JewelryPage jewelryPage;
	CartPage cartPage;
	BillingAddressPage bAddress;
/*	@BeforeSuite
	void launchApplication() throws IOException {
		launchWeb.launchBrowser();
		WebDriver driver = launchWeb.getDriver();
		landingPage  = new LandingPage(driver);
	}*/
	@BeforeClass
	void clickLogin() {
		WebDriver driver = launchWeb.getDriver();
		landingPage  = new LandingPage(driver);
		landingPage.clickJewelryLink();
		jewelryPage=new JewelryPage(launchWeb.getDriver());	
		cartPage=new CartPage(launchWeb.getDriver());
		bAddress=new BillingAddressPage(launchWeb.getDriver());
	}
	@Test
	public void jewelryCheckOut() {
		jewelryPage.addJewelryCart();
		landingPage.clickShoppingCart();
		//cartPage.addCoupon("Enjoy Coupon");
		//cartPage.applyCoupon();
		cartPage.selectIAgree();
		cartPage.clickCheckOut();
		bAddress.selectCountry("United States");
		bAddress.selectState("North Carolina");
		bAddress.setAddress("123 jason street");
		bAddress.setCity("Charlotte");
		bAddress.setZipCode("12345");
		bAddress.setPhno("123456789");
		bAddress.clickContinue();
		
	}
	
}
