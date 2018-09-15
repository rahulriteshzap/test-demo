import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// step 1 > For every webpage in an application we create a java class
public class LoginPage {
	// step 2 > In a class define a WebDriver refrence but don't initialize it.
	WebDriver driver;
	
	//Step 3 > Define a public constructor with WebDriver as a reference
	//Step 4 > Inside the constructor initialize the WebDriver reference
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// Step 5 > Define a method for page validation or webpage loading confirmation.
	// wait for page load use explicit wait
	public void waitForLoginPageToLoad()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("login_form")));		
	}

	// Step 6 > Define a method for every WebElement:-
	// A> method should be non static and public
	// B> method name starts with get followed by elementName followed by element type
	public WebElement getUsernameTextbox()
	{
		WebElement element = driver.findElement(By.xpath("//input[@type='email']"));
		return element;
	}
	public WebElement getPasswordTextbox()
	{
		return driver.findElement(By.xpath("//input[@id='pass']"));				
	}
	public WebElement getLoginButton()
	{
		return driver.findElement(By.xpath("//input[@value='Log In']"));				
	}
	
	public WebElement getLoginErrorMessage()
	{
		return driver.findElement(By.xpath("//div[@class='_4rbf _53ij']"));
	}
}
