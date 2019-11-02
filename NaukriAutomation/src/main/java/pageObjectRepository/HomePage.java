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
	public
	
	WebElement loginbtn;
	@FindBy(how=How.XPATH,using="//input [@name='email']")
	public
	
	WebElement usernametxt;
	 
	@FindBy(how=How.XPATH,using="//input [@name='PASSWORD']")
	public
	
	WebElement passwodtxt;
	 
	
	@FindBy(how=How.XPATH,using="//button[@type='submit' and text()='Login']")
	public
	
	WebElement submitbtn;
	 
	@FindBy(how=How.XPATH,using="//a[contains(@href,'navin.rana.161')and @title= 'Profile']")
	
	WebElement HomePageIcon;	
	
	@FindBy(how=How.XPATH,using="//div[@class='mTxt' and text()='Jobs']")
	public
	
	WebElement jobsTab;
	
	@FindBy(how=How.XPATH,using="//li/a[@title='Search Jobs' and text()='Search Jobs']")
	public
	
	WebElement searchJobslnk;
	
	@FindBy(how=How.XPATH,using="//input[contains(@id,'qsb-keyskill-sugg')]")
	public
	
	WebElement searchinput;
	
	@FindBy(how=How.XPATH,using="//button[contains(@type,'submit')]")
	
	WebElement searchbtn;
	@FindBy(how=How.XPATH,using="//input[@class='sdTxt w85' and @placeholder='Last 30 Days']")
	
	WebElement freshnessFilter;
	
	@FindBy(how=How.XPATH,using="//li[@id='#1']")
	
	WebElement freshness1daydrp;
	
    @FindBy(how=How.XPATH,using="//div[@class='acord_cont open']/a[contains(text(),'Noida')]")
	
	WebElement noidaLocationCkhbox;
    
    
	@FindBy(how = How.XPATH,using="//div[@class='updateProfile']//div[@class='mb10']")
	public
	WebElement updatebttn;

	@FindBy(how = How.XPATH,using="//span[@class= 'text' and text()='Resume Headline']")
	public
	WebElement updateResumeHline;
	 
	@FindBy(how = How.XPATH,using="//span[@class='widgetTitle' and text()='Resume Headline']//..//span[@class= 'edit icon' and text()='Edit']")
	public
	WebElement EditupdateResumeHline;
	
	@FindBy(how = How.XPATH,using="//div[@class='input-field s12']//..//textarea[@id='resumeHeadlineTxt']")
	public
	WebElement saveResumeHline;
	
	@FindBy(how = How.XPATH,using="//button[@class='waves-effect waves-light btn-large blue-btn' and text()='Save']")
	public
	WebElement savebtn;
	@FindBy(how = How.XPATH,using="//button[@class='waves-effect waves-light btn-large blue-btn' and text()='Save']")
	public
	WebElement applyBtn;
	
	
		
	
	
}
