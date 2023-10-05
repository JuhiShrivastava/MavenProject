package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModel.LoginOrangeHRM;
import resourses.BaseClass;

public class VerifyOrangeHRM extends BaseClass{

	@Test
	
	public void verifyLogin() throws IOException, InterruptedException
	{
		driverInitialize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		LoginOrangeHRM LOH=new LoginOrangeHRM(driver);
		
		LOH.enterUN().sendKeys("Admin");
		LOH.enterPwd().sendKeys("admin123");
		LOH.clickOnLogin().click();
		
	}
}
