import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test5 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement element = driver.findElement(By.xpath("//span[label[text()='Male']]/input[@type='radio']"));
		boolean status = element.isSelected();
		if(status==true)
		{
			System.out.println("Radio button is checked");
		}
		else
		{
			System.out.println("Radio button is un-checked");
		}
		driver.close();
	}

}
