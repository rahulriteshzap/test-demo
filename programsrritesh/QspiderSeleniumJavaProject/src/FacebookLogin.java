import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//Drivers//geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("abdc@gmail.com",Keys.TAB);
		driver.findElement(By.id("pass")).sendKeys("abcd",Keys.ENTER);
		
		
		

	}

}
