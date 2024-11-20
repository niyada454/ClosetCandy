package testpackage;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.Login;
import pagepackage.Productclass;


public class ProductTest extends Baseclass {
	@Test
	public void product() throws InterruptedException {
		Productclass p2=new Productclass(driver);
		Login p1=new Login(driver);
		p1.login();
			
		p1.values("niyadamnzz@gmail.com", "Niyada@123");
		
		p1.login_click();
		
		p2.clothing();
		p2.sweaters();
		p2.productclick();
		p2.addto_cart();
		
		
	}
	

}
