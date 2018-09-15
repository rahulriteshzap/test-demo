import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFacebook {
  @Test
  public void testElement()
  {
	  System.setProperty("webdriver.chrome.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//DriverR//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com");
		System.out.println(driver.getTitle());
		
  }
}
