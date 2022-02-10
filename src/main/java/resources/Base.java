package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver;
	
	public WebDriver invokeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\apps\\selenium-workspace\\SeleniumAutomation\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
		  System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		}else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\apps\\selenium\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

}
