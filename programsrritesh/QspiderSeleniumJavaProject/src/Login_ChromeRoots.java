import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_ChromeRoots {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//DriverR//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.roots.com");
		//String page = driver.getPageSource();
		//System.out.println(page);
		driver.findElement(By.xpath("//span[text()='UNITED STATES']")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();			
		Actions action = new Actions(driver);				
		WebElement women = driver.findElement(By.xpath("//span[@id='nav_Womens'] [text()='Women']"));
		action.moveToElement(women).perform();
		//action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//a[@href='https://www.roots.com/us/en/women/categories/tops/']"))).click().build().perform();
         List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='decider']/li"));
         
         for(int i=0;i<ele.size();i++)
         {
        	 WebElement el=ele.get(i);
        	 String str=el.getText();
        	 System.out.println(str);
        	 
        	 
         }
	}

}
