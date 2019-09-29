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
	 
	 
	
	@FindBy(how=How.XPATH,using="//div[@class='mTxt' and text()='Login']")
	
	WebElement loginbtn;
	@FindBy(how=How.XPATH,using="//input [@name='email']")
	
	WebElement usernametxt;
	 
	@FindBy(how=How.XPATH,using="//input [@name='PASSWORD']")
	
	WebElement passwodtxt;
	 
	
	@FindBy(how=How.XPATH,using="//button[@type='submit' and text()='Login']")
	
	WebElement submitbtn;
	 
	@FindBy(how=How.XPATH,using="//a[contains(@href,'navin.rana.161')and @title= 'Profile']")
	
	WebElement HomePageIcon;	
	
	@FindBy(how=How.XPATH,using="//div[@class='mTxt' and text()='Jobs']")
	
	WebElement jobsTab;
	
	@FindBy(how=How.XPATH,using="//li/a[@title='Search Jobs' and text()='Search Jobs']")
	
	WebElement searchJobslnk;
	
	@FindBy(how=How.XPATH,using="//input[contains(@id,'qsb-keyskill-sugg')]")
	
	WebElement searchinput;
	@FindBy(how=How.XPATH,using="//button[contains(@type,'submit')]")
	
	WebElement searchbtn;
	@FindBy(how=How.XPATH,using="//input[@class='sdTxt w85' and @placeholder='Last 30 Days']")
	
	WebElement freshnessFilter;
	
	@FindBy(how=How.XPATH,using="//li[@id='#1']")
	
	WebElement freshness1daydrp;
	
    @FindBy(how=How.XPATH,using="//div[@class='acord_cont open']/a[contains(text(),'Noida')]")
	
	WebElement noidaLocationCkhbox;
	

	 
	 
	
	
	
}
