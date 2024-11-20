package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/ul/li/a")
	WebElement icon;
	
	@FindBy(name="customer[email]")
	WebElement email;
	
	@FindBy(name="customer[password]")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/input[5]")
	WebElement login_click;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
   public void values(String mail,String pswd) {
	   email.sendKeys(mail);
	   pass.sendKeys(pswd);
   }
   public void login() {
	   icon.click();
	   
   }
   public void login_click() {
	   login_click.click();
   }
   
}
