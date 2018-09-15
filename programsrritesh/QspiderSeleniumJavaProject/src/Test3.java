import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.id("gs-htif0"));
		
		boolean status = element.isEnabled();
		if (status==true)
		{
			System.out.println("Element is Enabled");
		}
		else
		{
			System.out.println("Element is Disabled");
		}
		
	driver.close();

	}

}
