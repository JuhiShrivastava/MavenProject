package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public static WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	
	private By password=By.xpath("//input[@id='password']");
	
	private By login=By.xpath("//input[@id='Login']");
	
	private By error=By.xpath("//div[@id='error']");
	
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterUsername()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement clickOnLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getErrorMessage()
	{
		return driver.findElement(error);
		
	}
}
