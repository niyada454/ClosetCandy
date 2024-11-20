package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/ul/li/a")
	WebElement account;

	@FindBy(id="customer_register_link")
	WebElement signup;

	@FindBy(name="customer[first_name]")
	WebElement first_name;
	
	@FindBy(name="customer[last_name]")
	WebElement lastname;
	
	@FindBy(name="customer[email]")
	WebElement email;
	
	@FindBy(name="customer[password]")
	WebElement pswd;
	
	@FindBy(xpath="//*[@id=\"create_customer\"]/div[6]/input")
	WebElement click_signup;
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void setvalues(String fname,String lname,String emailid,String password) throws InterruptedException {
		
		first_name.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(emailid);
		pswd.sendKeys(password);
		
		
	}
	
	public void Account() {
		driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/ul/li/a")).click();
		//signup.click();
	}
	public void Signup() {
		driver.findElement(By.id("customer_register_link")).click();
		//signup.click();)
	}
	
	public void Registration_click() {
	click_signup.click();
		
	}

}
