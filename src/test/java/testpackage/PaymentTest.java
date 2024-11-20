package testpackage;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.Checkout;
import pagepackage.Login;
import pagepackage.Paymentpage;
import pagepackage.Productclass;

public class PaymentTest extends Baseclass{
	
		@Test
		public void product() throws InterruptedException {
			Productclass p2=new Productclass(driver);
			Checkout p3=new Checkout(driver);
			Login p1=new Login(driver);
			Paymentpage p4=new Paymentpage(driver);
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
		    p4.details("Apartment 65,California", "California","71601", "874563956", "8914756930587496", "12/27", "589");
		/*	p4.address("Apartment 65,California");
			p4.city("California");
            p4.state();
            p4.pin("896257");
            p4.phone("87456395");
            p4.cardno("8914756930587496");
            p4.expdate("1227");
            p4.securitycd("589");*/
            p4.billingadrs();
           
            p4.payclick();
            p4.homepage();
            p4.account();
         
           
           

}
}