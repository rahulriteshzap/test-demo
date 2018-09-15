import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//Drivers//geckodriver.exe");
		
		WebDriver driver  = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        driver.get(baseUrl);    // launch chrome browser and direct it to the Base URL
        

	}

}
