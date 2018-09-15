import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YatraTesting {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//DriverR//chromedriver.exe");
		
		WebDriver driver = new chromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com");
		WebElement Source = driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']"));
		
		Source.sendKeys("Bangalore");
		
		WebElement Destination = driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']"));
		
		Destination.sendKeys("Patna");
		
		WebElement departureDate = driver.findElement(By.xpath("//i[@class='font-icon icon-inside icon-calendar blur_class BE_flight_origin_date']"));
		
		departureDate.click();
		driver.findElement(By.xpath("//td[@title='Sunday, 27 May 2018']")).click();
		WebElement calenderElement = driver.findElement(By.xpath("//i[@class='font-icon icon-inside icon-calendar blur_class BE_flight_arrival_date']"));
		
		
		calenderElement.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript(Script,Arguments);
		
		
		//List<WebElement>  allDays = new List<WebElement>(driver);
		
				
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("document.getElementById('16/12/2018').scrollIntoView()");
		  Thread.sleep(5000);
		  WebElement date = driver.findElement(By.id("16/12/2018"));
		  Thread.sleep(5000);
		  date.click();
		*/
		
		

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
