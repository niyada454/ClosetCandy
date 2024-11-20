package testpackage;

import org.testng.annotations.Test;
import basepackage.Baseclass;
import pagepackage.Checkout;
import pagepackage.Login;
import pagepackage.Productclass;

public class CheckoutTest extends Baseclass{
	@Test
	public void checkout() throws InterruptedException {
		Checkout p3=new Checkout(driver);
		Productclass p2=new Productclass(driver);
		Login p1=new Login(driver); 
		p1.login();
		p1.values("niyadamnzz@gmail.com", "Niyada@123");
		p1.login_click();
		p2.clothing();
		p2.sweaters();
		p2.productclick();
		p2.addto_cart();
		
		p3.carticon();
		p3.checkbox();
		p3.checkout();
		
	}
	

}
