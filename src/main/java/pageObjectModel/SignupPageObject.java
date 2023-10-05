package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	
	public static WebDriver driver;
	
	private By Fname=By.xpath("//input[@name='UserFirstName']");
	private By Lname=By.xpath("//input[@name='UserLastName']");
	private By Email=By.xpath("//input[@name='UserEmail']");
	private By JobTiltle=By.xpath("//select[@name='UserTitle']");
	private By Company=By.xpath("//input[@name='CompanyName']");
	private By Employes=By.xpath("//select[@name='CompanyEmployees']");
	private By Phone=By.xpath("//input[@name='UserPhone']");
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	private By ServiceAgreement=By.className("checkbox-ui");



	public SignupPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterFname()
	{
		return driver.findElement(Fname) ;
		
	}
    public WebElement enterLname()
	{
		return driver.findElement(Lname);
		
	}
	public WebElement enterEmail()
	{
		return driver.findElement(Email);
		
	}
	public WebElement selectJob()
	{
		return driver.findElement(JobTiltle);
		
	}
	public WebElement enterCompany()
	{
		return driver.findElement(Company);
		
	}
	public WebElement selectEmployees()
	{
		return driver.findElement(Employes);
		
	}
	public WebElement enterPhoneNumber()
	{
		return driver.findElement(Phone);
		
	}
	public WebElement selectCountry()
	{
		return driver.findElement(Country);
		
	}
	public WebElement clickOnServiceAgreement()
	{
		return driver.findElement(ServiceAgreement);
		
	}
	
} 
