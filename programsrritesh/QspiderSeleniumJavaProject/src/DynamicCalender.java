import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DynamicCalender {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//DriverR//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.firefox.marionette", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		  driver.get("https://www.yatra.com/");
		  driver.findElement(By.id("BE_flight_origin_date")).click();
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("document.getElementById('16/12/2018').scrollIntoView()");
		  Thread.sleep(2000);
		  driver.findElement(By.id("16/12/2018")).click();

	}

}
