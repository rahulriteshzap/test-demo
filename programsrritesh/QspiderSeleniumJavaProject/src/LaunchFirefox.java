import java.util.concurrent.TimeUnit;

import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		 String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";
	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	       
	        
	       driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	        //close Fire fox
	        driver.close();
		
	}

}
