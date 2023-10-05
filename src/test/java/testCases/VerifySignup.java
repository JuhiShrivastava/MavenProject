package testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.SignupPageObject;
import resourses.BaseClass;

public class VerifySignup extends BaseClass {
	@Test

	public void signUp() throws IOException, InterruptedException 
	{
		driverInitialize();
	
	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	SignupPageObject spo= new SignupPageObject(driver);
	
	spo.enterFname().sendKeys("Juhi");
	
	spo.enterLname().sendKeys("Shrivastava");
	
	spo.enterEmail().sendKeys("juhi12@gmail.com");
	
	WebElement j=spo.selectJob();
	Select s=new Select(j);
	s.selectByIndex(2);
//	s.selectByVisibleText("IT Manager");
	
	
	spo.enterCompany().sendKeys("SSquareit");
	
	WebElement k=spo.selectEmployees();
	Select y=new Select(k);
	y.selectByIndex(2);
	
	spo.enterPhoneNumber().sendKeys("9898232341");
	
	WebElement l=spo.selectCountry();
	Select z=new Select(l);
	z.selectByIndex(20);
	
	Thread.sleep(2000);
	spo.clickOnServiceAgreement().click();
	
	}

}
