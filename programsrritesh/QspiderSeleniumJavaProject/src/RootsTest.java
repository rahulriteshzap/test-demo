import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RootsTest {

	public static void main(String[] args) throws InterruptedException {
		
		RootsLogin userLogin = new RootsLogin();
		userLogin.login();
		
	 
		
		 
		 
		
		
		
        
       
       
         
        
         
         
       
		
	}

}

 class RootsLogin // this class tests for login and logout functionality of ROOTS
 {
	 public void login() throws InterruptedException
	 {
		 String userName= "rriteshpfs@gmail.com";
		 String password= "123456";
		 
		 
		 System.setProperty("webdriver.chrome.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//DriverR//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			String baseUrl = "http://www.roots.com";
			driver.get(baseUrl);
			
			//Verifying the title of ULP
			String actualTitle= driver.getTitle();
			String expectedTitle = "Roots";
			if ( actualTitle.contentEquals(expectedTitle))
	        {
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
			 // from ULP navigating to  CA-en homepage
			 driver.findElement(By.xpath("//span[text()='CANADA ENGLISH']")).click();
		 //click on customer greet
		 driver.findElement(By.xpath("//span[@class='profile-name']/span[1]")).click();
		 // click on login link
		 driver.findElement(By.xpath("(//div[@class='user-links']/ul/li[3]/a)[1]")).click();
		 //enter the username
		 driver.findElement(By.xpath("//input[@id='dwfrm_login_username']")).sendKeys("ritesh@gmail.com");
		 //enter the password
		 driver.findElement(By.xpath("//input[@id='dwfrm_login_password']")).sendKeys("123456");
		 // check the checkbox
		 driver.findElement(By.xpath("//label[@id='lbl_dwfrm_login_rememberme']")).click();
		 // click on login button
		 driver.findElement(By.xpath("//button[@value='Sign in']")).click();
		 
		 WebElement welcomeMessage = driver.findElement(By.xpath("//span[contains(text(), 'Welcome Back')]"));
		 String expectedWelcomeMessage = "Welcome Back, ritesh";
		 
		 boolean status = expectedWelcomeMessage.contains("ritesh");
				 if (status=true)
				 {
					 System.out.println("ritesh loggedIn successfully");
				 }
				 else
				 {
					 System.out.println("login failed"); 
				 }
		     // logging out of the application
				 /*	 
			WebElement logoutLinkStep1 = driver.findElement(By.xpath("//span[@class='profile-name']"));
			logoutLinkStep1.click();
			WebElement logoutLinkStep2 = driver.findElement(By.xpath("(//div[@class='user-links']/ul/li[4]/a)[1]"));
			
			
			logoutLinkStep2.click();
			String expectedLogoutText = "Good";
			WebElement logoutstatus =  driver.findElement(By.xpath("(//div[@class='user-links']/ul/li[3]/a)[1]"));
			boolean validateLogout = logoutstatus.getText().contains(expectedLogoutText);
			
			if(validateLogout=true)
			{
				System.out.println("ritesh logged Out successfully");
			}
			else
			{
				System.out.println("ritesh is still logged in");
			}
			*/
			///////////////////////////////////////////////////////////////////////////////////////////////////////////////
			//Add delete the  address
			//click on shipping billing tab in my account
				 
			WebElement shippingBilling = driver.findElement(By.xpath("//a[text()='Shipping & Billing']"));
			shippingBilling.click();
			Thread.sleep(10);
			// click on add another button
			WebElement AddAnotherButton = driver.findElement(By.xpath("//div/a[@class='section-header-note address-create']"));
			AddAnotherButton.clear();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//driver.close();
	 }
	
	 class Add_addressFunctionality
	 {
		 
		 
	 }
	
 }