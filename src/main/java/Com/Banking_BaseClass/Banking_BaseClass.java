package Com.Banking_BaseClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;import Com.BankingUtilities.Banking_TestUtils;
public class Banking_BaseClass {
public static WebDriver driver;
	@BeforeMethod
	public void initialization() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\javaselenium\\chromedriver.exe");
 driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Banking_TestUtils.IMPLICIT_WAIT,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Banking_TestUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	 driver.get("https://demo.guru99.com/V1/index.php");
	 Thread.sleep(3000);
}
	
	@AfterMethod
	
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}