import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//Drivers//geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("rriteshpfs@gmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("India@123",Keys.ENTER);

	}

}
