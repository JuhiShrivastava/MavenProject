package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CapturingSS {
	
	@Test
	public void sc() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingo.com/selenium-webdriver-interface-classes-hierarchy/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		TakesScreenshot src=(TakesScreenshot)driver;
		File source=src.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Satna\\Desktop\\Screenshot\\pic1.png");
		FileUtils.copyFile(source, dest);
		
		
	}

}
