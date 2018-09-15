import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test7 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String Js_command= "document.getElementByID('lst-ib').Value='Selenium'";
		JavascriptExecutor Js_driver = (JavascriptExecutor) driver;
		Js_driver.executeScript(Js_command);
		

	}

}
