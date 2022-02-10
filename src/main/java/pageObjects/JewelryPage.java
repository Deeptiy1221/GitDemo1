package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JewelryPage {
public WebDriver driver;

By selectJewelry=By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");


public JewelryPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public void addJewelryCart() {
	
	driver.findElement(selectJewelry).click();
}

}
