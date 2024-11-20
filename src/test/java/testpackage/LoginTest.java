package testpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.Login;
import pagepackage.RegistrationPage;
import utilpackage.Utilclass;

public class LoginTest extends Baseclass{
	
		// TODO Auto-generated constructor stub
	

	@Test
	public void verify_login() throws InterruptedException {
		Login p1=new Login(driver);
		p1.login();
	
		String xl="C:\\Users\\ASUS\\Downloads\\closet candy login.xlsx";
		String Sheet="Sheet1";
		int rowcount=Utilclass.getRowCount(xl, Sheet);
		System.out.println(rowcount);
		
		for(int i=1;i<=rowcount;i++) {
			int cellCount=Utilclass.getCellCount(xl,Sheet,i);
			System.out.println("Cell Count:"+cellCount);
			
			for(int j=0;j<cellCount;j+=2) { 
				String email_id=Utilclass.getcellValue(xl,Sheet,i, j);
				System.out.println("Email="+email_id);
				String pswd=Utilclass.getcellValue(xl,Sheet,i,j+1);
				System.out.println("Pssword="+pswd);
				
			
				
				p1.values(email_id, pswd);
				p1.login_click();
		String act_url=driver.getCurrentUrl();
		  String exp_url="https://www.closetcandy.com/account";
				if(act_url.equalsIgnoreCase(exp_url)) {
					System.out.println("login passed");
					break;
				}else {
					System.out.println("login failed");
				}
			
				Thread.sleep(1000);
				driver.get("https://www.closetcandy.com/");
				p1.login();
			}
		}
	}
	

}
