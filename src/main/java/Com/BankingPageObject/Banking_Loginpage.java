package Com.BankingPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Banking_BaseClass.Banking_BaseClass;

public class Banking_Loginpage extends Banking_BaseClass {

	//1
	public Banking_Loginpage() {
	
	PageFactory.initElements(driver, this);
}
	//2
	@FindBy(xpath="//input[@type=\"text\"]")
	public WebElement Username;
	
	
    @FindBy(xpath="//input[@type=\"password\"]")
    public WebElement Password;

     @FindBy(xpath="//input[@type=\"submit\"]")
         public WebElement Loginbutton;
     //3
     public void SetUsername(String Uname)
     {
    	 Username.sendKeys(	Uname);
     }
     
     public void SetPassword(String Pwd)
     {
    	 Password.sendKeys(Pwd);
     }
     
     public void SetLoginbutton()
     {
    	Loginbutton.click();
     }
     
     
     }
