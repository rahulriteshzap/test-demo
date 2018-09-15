import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // open the browser
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@id='bluemenu']/ul/li[2]/a"))).perform();
		Thread.sleep(5000);
		List<WebElement> element =driver.findElements(By.xpath("//div[@id='bluemenu']/ul/li[2]/ul/li")); // xpath needs to be traversed from parent node to the fist value of menu.
		
		for (int i=0;i<element.size();i++)
		{
			WebElement menuValues =element.get(i);
			String ValueNames =menuValues.getText();
			System.out.println(ValueNames);
			//Thread.sleep(2000);
			
			if (ValueNames.contains("Cab"))
			{
				menuValues.click();
			}
		}
		
		

	}

}
