import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import okio.Options;

public class Assignment3 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//DriverR//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("makemytrip",Keys.ENTER);
		List<WebElement> GoogleLinks = driver.findElements(By.xpath("//div[@class='rc']/h3/a"));
		for (int i=0;i<GoogleLinks.size();i++)
		{
			WebElement link = GoogleLinks.get(i);
			String LinkName = link.getText();
			System.out.println(LinkName);
		}
		
		driver.findElement(By.xpath("//div[@class='rc']/h3/a[@href='https://www.makemytrip.com/']")).click();
		
		//Actions act = new Actions(driver);
		
		
		//driver.quit();
		
		
		
		

	}

}
