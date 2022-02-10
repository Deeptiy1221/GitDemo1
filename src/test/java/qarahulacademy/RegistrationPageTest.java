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
import pageObjects.RegisterNewUser;
import resources.CaptureScreenShot;

public class RegistrationPageTest {
	LaunchWebsite launchWeb=new LaunchWebsite();
	LandingPage landingPage ;
	RegisterNewUser registerNewUserPage;
	LoginPage loginPage;
	
	@BeforeSuite
	void launchApplication() throws IOException {
		launchWeb.launchBrowser();
		WebDriver driver = launchWeb.getDriver();
		landingPage  = new LandingPage(driver);
	}
	@BeforeClass
	void clickRegistration() {
		landingPage.clickRegisterLink();
		registerNewUserPage=new RegisterNewUser(launchWeb.getDriver());	
	}
	@Test(dataProvider="getData")	
	public void validateNewMaleRegistration(String fName, String lName,int dayIndex,int monthIndex,String yearValue,String email,String password,String cPassword) throws Exception
	
	{			
		registerNewUserPage.registeringMaleUser(fName,lName,dayIndex,monthIndex,yearValue,email,password,cPassword);
		CaptureScreenShot.captureScreenShot(launchWeb.getDriver(),"img.png");
		boolean registrationSuccessfulFlag = registerNewUserPage.continueHome();
		System.out.println(registrationSuccessfulFlag);
		if(!registrationSuccessfulFlag) {
			landingPage.clickLoginLink();
			loginPage=new LoginPage(launchWeb.getDriver());	
			String[][] data = getUserData();
			loginPage.login(data[0][0],data[0][1]);
			Thread.sleep(10000);
		
		}
	
	}
	 @DataProvider
	   public String[][] getUserData()
	   {
		 String[][] data = new String[1][2];
		   
		   //data[0][0]="abc@gmail.com";
		 //  data[0][1]="xyz";
		   
		   data[0][0]="John.Abharam6@gmail.com";
		   data[0][1]="asdfgh";
		   
		   return data;
		   
	   }
   @DataProvider
   public Object[][] getData()
   {
	   Object[][] data = new Object[1][8];
	   
	   data[0][0]="John";
	   data[0][1]="Abraham";
	   data[0][2]=28;
	   data[0][3]=4;
	   data[0][4]="2005";
	   data[0][5]="John.Abharam6@gmail.com";
	   data[0][6]="asdfgh";
	   data[0][7]="asdfgh";
	  /* 
	   data[1][0]="David";
	   data[1][1]="Lincon";
	   data[1][2]=28;
	   data[1][3]=4;
	   data[1][4]="2005";
	   data[1][5]="David.Lincon@gmail.com";
	   data[1][6]="DavidPassword";
	   data[1][7]="DavidPassword";  */
	   
	   return data;
	   
   }
   
 /*  @AfterClass
   public void closeBrowser() throws InterruptedException
   {   Thread.sleep(1000);
	   registerNewUserPage.close();
   }*/
	
	

}
