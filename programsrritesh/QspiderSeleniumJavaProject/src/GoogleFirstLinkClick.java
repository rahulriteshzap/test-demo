import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleFirstLinkClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.marionette", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//Drivers//geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("JAVA",Keys.ENTER);
		driver.findElement(By.linkText("Download Free Java Software")).click();
		Thread.sleep(500);
		
		driver.close();
		

	}

}
