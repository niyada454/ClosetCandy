package testpackage;

import org.testng.annotations.Test;


import basepackage.Baseclass;
import pagepackage.RegistrationPage;
import utilpackage.Utilclass;

public class RegistrationTest extends Baseclass{
	
	@Test
	public void verify_login() throws InterruptedException {
		RegistrationPage p1=new RegistrationPage(driver);
		p1.Account();
		p1.Signup();
		String xl="C:\\Users\\ASUS\\Desktop\\Automation\\closetcandy (1).xlsx";
		String Sheet="Sheet1";
		int rowcount=Utilclass.getRowCount(xl, Sheet);
		System.out.println(rowcount);
		
		for(int i=1;i<=rowcount;i++) {
			int cellCount=Utilclass.getCellCount(xl,Sheet,i);
			System.out.println("Cell Count:"+cellCount);
			
			for(int j=0;j<cellCount;j+=4) { 
				String fname=Utilclass.getcellValue(xl,Sheet,i, j);
				System.out.println("Firstname="+fname);
				String lname=Utilclass.getcellValue(xl,Sheet,i,j+1);
				System.out.println("Lastname="+lname);
				String email=Utilclass.getcellValue(xl,Sheet,i,j+2);
				System.out.println("Email="+email);
				String pwd=Utilclass.getcellValue(xl,Sheet,i,j+3);
				System.out.println("Password="+pwd);
				
			
				//p1.setvalues("anu", "m", "anu@gmail.com", "anu@123");
				p1.setvalues(fname,lname,email,pwd);
	/*		String act_url=driver.getCurrentUrl();
		  String exp_url="https://www.closetcandy.com/";
				if(act_url.equalsIgnoreCase(exp_url)) {
					System.out.println("login passed");
					break;
				}else {
					System.out.println("login failed");
				}*/
				Thread.sleep(1000);
				driver.get("https://www.closetcandy.com/");
			}
		}
	}
	

}
