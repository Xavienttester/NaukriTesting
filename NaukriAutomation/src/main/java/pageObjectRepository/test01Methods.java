package pageObjectRepository;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import genericLibary.WebDriverCommonLibary;

public class test01Methods
{
	WebDriver driver;
	WebDriverCommonLibary wb=new WebDriverCommonLibary();
	public void loginWebApp(WebDriver driver) throws Exception
	
	{
		FileReader reader=new FileReader("testdata.properties");
		Properties p=new Properties();
		p.load(reader);
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		
		
		wb.sendInputTextMethod(home.usernametxt, p.getProperty("user"));
		wb.sendInputTextMethod(home.passwodtxt, p.getProperty("password"));
		
		
	}
}