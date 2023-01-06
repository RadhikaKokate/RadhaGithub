package Com.BankingTestCases;

import org.testng.annotations.Test;

import Com.BankingPageObject.Banking_Loginpage;
import Com.Banking_BaseClass.Banking_BaseClass;

public class Banking_LoginTestCases extends  Banking_BaseClass {


	@Test
	public void LoginTest() {
		
		
		
		 Banking_Loginpage BL=new  Banking_Loginpage();
		 BL.SetUsername("mngr463946");
		 BL.SetPassword("pUdYgEd");
		 BL.SetLoginbutton();
		 
		 if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
				System.out.println("Passed");
			}
			else {
				System.out.println("failed");
			}
	}
}
