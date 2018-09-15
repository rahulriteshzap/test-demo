import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLoginFunctionality {

	public static void main(String[] args) {
		System.out.println("Test ROOTS Login Functionality ");
		TestLoginFunctionality login = new TestLoginFunctionality();
		login.roots_Login();

	}

	
	
	public void roots_Login()
	
	{
		System.setProperty("webdriver.firefox.marionette", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//Drivers//chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.roots.com");
		driver.findElement(By.xpath("//span[text()='UNITED STATES']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		
		
		
	}
	
	
	
	
}
