package qarahulacademy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LaunchWebsite;
import pageObjects.LoginPage;
import resources.Base;

public class HomePageTest{
	//public WebDriver driver;
	
	LaunchWebsite launchWeb=new LaunchWebsite();
	LandingPage landingPage ;
	LoginPage loginPage;
/*	@BeforeSuite
	void launchApplication() throws IOException {
		launchWeb.launchBrowser();
		WebDriver driver = launchWeb.getDriver();
		landingPage  = new LandingPage(driver);
	}*/
	@BeforeClass
	void clickLogin() {
		landingPage.clickLoginLink();
		loginPage=new LoginPage(launchWeb.getDriver());	
	}
	
	@Test(dataProvider="getData")	
	public void validateLogin(String username, String password) throws IOException, InterruptedException
	
	{			
		loginPage.login(username,password);
		Thread.sleep(10000);
	
	}
   @DataProvider
   public Object[][] getData()
   {
	   Object[][] data = new Object[1][2];
	   
	   //data[0][0]="abc@gmail.com";
	 //  data[0][1]="xyz";
	   
	   data[0][0]="John.Abraham@gmail.com";
	   data[0][1]="JohnPassword";
	   
	   return data;
	   
   }
  /* @AfterClass
   public void closeBrowser() 
   {   
	   loginPage.close();
   }*/
}
