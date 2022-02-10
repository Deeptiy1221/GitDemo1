package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import resources.Base;

public class LaunchWebsite extends Base {
	
     public static WebDriver driver;

	public void launchBrowser() throws IOException
	{
		driver=invokeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();	
	}

	public WebDriver getDriver() {
		return driver;
	}

	
}
