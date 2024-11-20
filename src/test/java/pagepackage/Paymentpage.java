package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Paymentpage {
	WebDriver driver;
	@FindBy(id="shipping-address1")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(id="Select1")
	WebElement state_select;
	@FindBy(name="postalCode")
	WebElement pin;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(id="number")
	WebElement cardno;
	@FindBy(id="expiry")
	WebElement expirydate;
	@FindBy(id="verification_value")
	WebElement seccode;
	@FindBy(id="billingAddress")
	WebElement billingadrs;
	@FindBy(id="checkout-pay-button")
	WebElement payclick;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/header/div/div/div/div/div/div[2]/div/span/a")
	WebElement home;
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/ul")
	WebElement acc;
	@FindBy(xpath="//a[@href=\"/account/logout\"]/parent::span")
	WebElement logout;
	
	public Paymentpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void details(String adrs,String place,String pincode,String phno,String cardnum,String date,String code) {
		address.sendKeys(adrs);
		city.sendKeys(place);
		Select state1=new Select(driver.findElement(By.id("Select1")));
		   state1.selectByIndex(5);
		   pin.sendKeys(pincode);
		
		   phone.sendKeys(phno);
		//   Select country =new Select(driver.findElement(By.name("phone_country_select")));
		  // country.selectByValue("IN");
		   cardno.sendKeys(cardnum);
		   expirydate.sendKeys(date);
		   seccode.sendKeys(code);
	}
/*	public void city(String place) {
		city.sendKeys(place);
	}
	
	public void state() {
	Select state=new Select(driver.findElement(By.id("Select1")));
	   state.selectByIndex(5);
	}
	public void pin(String pincode) {
		pin.sendKeys(pincode);
	}
	public void phone(String phno) {
		phone.sendKeys(phno);
	}
	public void cardno(String cardnum) {
		cardno.sendKeys(cardnum);
	}
	public void expdate(String date) {
		expirydate.sendKeys(date);
	}
	public void securitycd(String code) {
		seccode.sendKeys(code);
	}*/
	public void billingadrs() {
		billingadrs.click();
	}

	public void payclick() throws InterruptedException {
		Thread.sleep(2000); 
		payclick.click();
	}
	public void homepage() {
		home.click();
	}
	public void account() throws InterruptedException {
		acc.click();
		
		logout.click();
	
	}
}


