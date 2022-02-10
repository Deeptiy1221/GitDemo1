package resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {
	public static void captureScreenShot(WebDriver driver,String fileName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		File outputFile = new File("./ScreenShots/"+fileName);
		FileUtils.copyFile(file, outputFile);
		
	}

}
