package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productclass {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/header[2]/div/div[3]/div/div[2]/nav[1]/ul/li[1]/details/summary")
	WebElement clothing;
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/header[2]/div/div[3]/div/div[2]/nav[1]/ul/li[1]/details/div/div/div[1]/div[3]/ul[2]/li[6]/a")
	WebElement sweaters;
	@FindBy(xpath="//*[@id=\"shopify-section-template--20611263266852__main\"]/section/div/div[5]/div[2]/div[1]/div/div[1]/div[2]/div/div/div[2]/a")
	WebElement product_click;
	@FindBy(xpath="//button[@type='button' and @name='add']")
	WebElement addtocart;
	
	
	public Productclass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clothing() {
		Actions act=new Actions(driver);
		WebElement clothing=driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/header[2]/div/div[3]/div/div[2]/nav[1]/ul/li[1]/details/summary"));
		act.moveToElement(clothing).perform();
	
		//clothing.click();
		
	}
	public void sweaters() {
		Actions act1=new Actions(driver);
		WebElement sweaters=driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/header[2]/div/div[3]/div/div[2]/nav[1]/ul/li[1]/details/div/div/div[1]/div[3]/ul[2]/li[6]/a"));
		act1.moveToElement(sweaters).click().perform();
	
		
		//sweaters.click();
	}
	public void productclick() {
		product_click.click();
	}
	public void addto_cart() throws InterruptedException {
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)","");
		driver.findElement(By.xpath("//*[@id=\"product_form_7720389935140\"]/div[3]/div[2]/button"));*/
		Thread.sleep(2000);
		addtocart.click();
		Thread.sleep(2000);
	}

}
