package Level1Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestcase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://rahulAutomate//programsrritesh//SeleniumTesting//Drivers//chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.quit();

	}

}
