package pageObjectRepository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import genericLibary.WebDriverCommonLibary;

public class test01Methods
{
	WebDriver driver;
	WebDriverCommonLibary wb=new WebDriverCommonLibary();
	@BeforeTest
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAVIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
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
		
		
		System.out.println("TEST1");
		
	}
	@AfterTest
	public void logout()
	{
		driver.quit();
	}
	
}