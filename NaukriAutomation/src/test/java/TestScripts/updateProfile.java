package TestScripts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectRepository.HomePage;
import genericLibary.WebDriverCommonLibary;

public class updateProfile
{
	WebDriver driver;
	WebDriverCommonLibary wb=new WebDriverCommonLibary();
	Properties p;
	@BeforeTest
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String parentWindow=driver.getWindowHandle();
		Set<String> child=driver.getWindowHandles();
		for(String abc:child)
		{
			if(!parentWindow.equalsIgnoreCase(abc))
			{
				driver.switchTo().window(abc);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
	}
	@Test
	public void loginWebApp() throws Exception 
	
	{
		FileReader reader=new FileReader("testdata.properties");
		Properties p=new Properties();
		p.load(reader);
    	HomePage home=PageFactory.initElements(driver, HomePage.class);
		
		wb.clickWebElementMethod(driver,home.loginbtn,"click");
		wb.sendInputTextMethod(home.usernametxt, p.getProperty("user"));
		wb.sendInputTextMethod(home.passwodtxt, p.getProperty("password"));
		wb.clickWebElementMethod(driver,home.submitbtn,"click");
		
	}
	@Test
	
	public void updateProfile() throws Exception{
		FileReader reader=new FileReader("testdata.properties");
		Properties p=new Properties();
		p.load(reader);
    	HomePage home=PageFactory.initElements(driver, HomePage.class);
	
		wb.clickWebElementMethod(driver, home.updatebttn, "click");
		wb.clickWebElementMethod(driver, home.updateResumeHline,"click");
		wb.clickWebElementMethod(driver, home.EditupdateResumeHline,"click");
	//	wb.clickWebElementMethod(driver, home.saveResumeHline,"click");
		wb.sendInputTextMethod(home.saveResumeHline,"Software Testing");
		wb.clickWebElementMethod(driver, home.savebtn,"click");
	}
	
	/*public void searchJobwithRequiredFilter() throws Exception
	{
		FileReader reader=new FileReader("testdata.properties");
		Properties p=new Properties();
		p.load(reader);
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		wb.moveToWebElementMethod(driver,home.jobsTab,home.searchJobslnk);
		wb.clickWebElementMethod(driver,home.searchJobslnk,"click");
		Thread.sleep(15000);
		String parentWindow=driver.getWindowHandle();
		Set<String> child=driver.getWindowHandles();
		for(String abc:child)
		{
			if(!parentWindow.equalsIgnoreCase(abc))
			{
				driver.switchTo().window(abc);
				Thread.sleep(5000);
				wb.sendInputTextMethod(home.searchinput,p.getProperty("searchedValue"));
				wb.clickWebElementMethod(driver,home.searchbtn,"click");
				wb.clickWebElementMethod(driver,home.freshnessFilter,"click");
				wb.clickWebElementMethod(driver,home.freshness1daydrp,"click");
				wb.clickWebElementMethod(driver,home.noidaLocationCkhbox,"click");
			
			}
		}
		

		
	}
*/	@AfterTest
	public void logout()
	{
		driver.quit();
	}
	
}