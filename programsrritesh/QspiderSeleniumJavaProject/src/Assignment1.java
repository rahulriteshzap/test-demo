import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // open the browser
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("lst-ib")).sendKeys("java",Keys.ENTER);
		List<WebElement> Links = driver.findElements(By.xpath("//div[@class='rc']/h3/a"));
		System.out.println(Links);
		
		for (int i=0;i<Links.size();i++)
		{
			WebElement IndividualLink =Links.get(i);
		    //String ElementTagName =IndividualLink.getTagName();
		    
		    
		    
		    	IndividualLink.click();
		    	Thread.sleep(5000);
				   String pageTitle =driver.getTitle();
				   Thread.sleep(5000);
				   System.out.println("The Page Titles are"+pageTitle);
				   driver.navigate().back();
				   Thread.sleep(5000);
				  Links = driver.findElements(By.xpath("//div[@class='rc']/h3/a"));
				   			
			
		}

	}

}
