import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement element = driver.findElement(By.xpath("//span[text()='Create an account']"));
		String font = element.getCssValue("font-size");
		System.out.println(font);
		driver.close();

	}

}
