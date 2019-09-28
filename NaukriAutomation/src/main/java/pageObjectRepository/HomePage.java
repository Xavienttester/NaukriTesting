package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage 
{

	WebDriver driver;
	 
	 
	public HomePage(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	 
	 
	
	 
	@FindBy(how=How.XPATH,using="//input [@name='email']")
	
	WebElement usernametxt;
	 
	@FindBy(how=How.XPATH,using="//input [@name='pass']")
	
	WebElement passwodtxt;
	 
	
	@FindBy(how=How.XPATH,using="//input [@id='u_0_a']")
	
	WebElement submitbtn;
	 
	@FindBy(how=How.XPATH,using="//a[contains(@href,'navin.rana.161')and @title= 'Profile']")
	
	WebElement HomePageIcon;	
	

	 
	 
	
	
	
}
