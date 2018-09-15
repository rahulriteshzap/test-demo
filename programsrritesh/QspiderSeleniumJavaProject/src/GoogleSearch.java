import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		String GoogleTitle = "Google";
		
		System.out.println("google search");
		
		System.setProperty("webdriver.gecko.driver", "C://rahulAutomate//programsrritesh//QspiderSeleniumJavaProject//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // open the browser
		driver.get("https://www.google.com"); // Go to google
	    String	title = driver.getTitle(); // validating the page title
	    
	    if (title==GoogleTitle){
	    	System.out.println("Page title is expected");
	    	
	    }
	    else {
	    	System.out.println("Page title is not matching");
	    	System.out.println("The expected title is "+ title);
	    }
	    
	   // driver.findElement(By.id(""))
	
		
		
		
		
		

	}

}
