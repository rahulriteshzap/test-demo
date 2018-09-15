import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestLogins15869 
{
 WebDriver driver; // WebDriver reference
 LoginPage login; // page object reference
 
 @BeforeMethod
 public void preCondition()
 {
	 System.setProperty("webdriver.chrome.driver", "C://rahulAutomate//programsrritesh//DesignFrameWork-Test//browser-server//chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/");
	 login = new LoginPage(driver);
	 }
 
 @AfterMethod
 public void postCondition()
 {
	 driver.close();
 }
 
 @Test
 public void testLoginInvalidTC157167()
 {
	 //waiting for page to load
	 login.waitForLoginPageToLoad();
	 
	 //get title and verify
	 String actualTitle = driver.getTitle();
	 System.out.println(actualTitle);
	 String expectedTitle = "Facebook – log in or sign up";
	 Assert.assertEquals(actualTitle, expectedTitle);
	 
	 // Enter valid username
	 
	 login.getUsernameTextbox().sendKeys("riteshonzap@gmail.com");
	 
	 // enter invalid password
	 
	 login.getPasswordTextbox().sendKeys("12345678989");
	 
	 // click on login button
	 login.getLoginButton().click();
	 
	 // get error message and verify
	 
	 String actualErrorMessage = login.getLoginErrorMessage().getText();
	 System.out.println(actualErrorMessage);
	 
	 String expectedErrorMessage = "The password that you've entered is incorrect. Forgotten password?";


	 Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	 
	 
 }
 
}
