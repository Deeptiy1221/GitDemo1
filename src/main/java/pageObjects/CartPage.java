package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	public WebDriver driver;
	By addCoupon=By.name("discountcouponcode");
	By applyCoupon=By.id("applydiscountcouponcode");
	By giftCard=By.id("giftcardcouponcode");
	By applyGiftCard=By.id("applygiftcardcouponcode");
	By agreeTerms=By.id("termsofservice");
	By continueShopping=By.name("continueshopping");
	By estimateShipping=By.id("open-estimate-shipping-popup");
	By checkOut=By.id("checkout");
	public CartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void addCoupon(String coupon) {
		driver.findElement(addCoupon).sendKeys(coupon);
	}
	public void addGiftCard(String gCard) {
		driver.findElement(giftCard).sendKeys(gCard);
	}
	public void applyCoupon() {
		driver.findElement(applyCoupon).click();
	}
	public void applyGiftCard() {
		driver.findElement(applyGiftCard).click();
	}
	public void selectIAgree() {
		driver.findElement(agreeTerms).click();
	}
	public void clickCheckOut() {
		driver.findElement(checkOut).click();
	}
}
