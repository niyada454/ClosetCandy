package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/div/a")
	WebElement carticon;
	@FindBy(id="cart_agree")
	WebElement checkbox;
	@FindBy(xpath="//button[contains(text(),'Checkout')]")
	WebElement checkout;
	
	
	public Checkout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void carticon() throws InterruptedException {
		Thread.sleep(2000);;
		carticon.click();
	}
	public void checkbox() {
		
		checkbox.click();
	}
	public void checkout() {
		checkout.click();
	}

}
