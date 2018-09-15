import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.xpath("//span[text()='Create An Account']"));
		
		boolean status = element.isDisplayed();
		if (status==true)
		{
			System.out.println("Text is Displayed");
		}
		else
		{
			System.out.println("Text is not Displayed");
		}
		
	driver.close();

	

	}

}
