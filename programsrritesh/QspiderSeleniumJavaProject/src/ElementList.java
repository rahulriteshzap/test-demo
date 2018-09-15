import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementList {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//DriverR//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver,30);
			driver.get("http://www.google.com");
			//sleep for 5 secs
			Thread.sleep(5000);
			// Here, see how the XPath will select unique Element.
			WebElement link = driver.findElement(By.xpath("//input[@id='lst-ib']"));
			link.sendKeys("java", Keys.ENTER);
			List<WebElement> allLinks = driver.findElements(By.xpath("//h3[@class='r']/a"));
			int allLinksCount = allLinks.size();
			
			System.out.println("The count of links present on the webpage is :"+ allLinksCount);
			
			// Now using Iterator we will iterate all elements
			Iterator<WebElement> iter =  allLinks.iterator();
			
			// below this will check whether list has some element or not
			
			while (iter.hasNext())
			{
				// iterate one by one
				WebElement item = iter.next();
				// navigating to each link and coming back
				
				item.click();
				Thread.sleep(5000);
				driver.navigate().back();
				
				//List<WebElement> allLinks = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//h3[@class='r']/a")));
				// get the text
				String label = item.getText();
				
				System.out.println("The link label is :- " + label);
			}
		
			
			
			driver.close();

	}

}
