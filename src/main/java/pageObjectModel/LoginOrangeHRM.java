package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginOrangeHRM {
	
	public static WebDriver driver;

	private By username=By.xpath("//input[@name='username']");
	private By password=By.xpath("//input[@name='password']");
	private By Login=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	
	
	public LoginOrangeHRM(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterUN()
	{
		return driver.findElement(username) ;
	
	}
	
	public WebElement enterPwd()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement clickOnLogin()
	{
		return driver.findElement(Login);
		
	}
}
