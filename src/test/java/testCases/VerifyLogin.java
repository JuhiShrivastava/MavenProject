package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectModel.LoginPageObject;
import resourses.BaseClass;

public class VerifyLogin extends BaseClass {
	@Test
	
	public void login() throws IOException, InterruptedException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\Satna\\Desktop\\juhi.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		String c1=cell.toString();
		
		XSSFCell cell1=row.getCell(1);
		String c2=cell1.toString();
		
	   //System.out.println(sheet.getRow(0).getCell(0));

		driverInitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		LoginPageObject lpo=new LoginPageObject(driver);
		
		lpo.enterUsername().sendKeys(c1);
		Thread.sleep(1000);
		
		lpo.enterPassword().sendKeys(c2);
		Thread.sleep(1000);
		
		lpo.clickOnLogin().click();
		
		String actual= lpo.getErrorMessage().getText();
		
		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		Assert.assertEquals(actual, expected);
		
	}

}
