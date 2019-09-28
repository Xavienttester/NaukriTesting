package genericLibary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebDriverCommonLibary
{






	/********************************************************************************************
	 * @Method:sendInputTextMethod
	 * @param inputs
	 * @throws Exception
	 *******************************************************************************************/
	public void sendInputTextMethod (WebElement element,String inputs) throws Exception
	{

		try {
			element.clear();

			Thread.sleep(2000);
			element.sendKeys(inputs);
		} catch (Exception e)
		{


			System.out.println(e.getMessage());
		}


	}
	/***************************************************************************************************
	 * Method:clickWebElementMethod
	 * @param element
	 * @param clickType
	 * @throws Exception
	 *****************************************************************************************************/
	public void clickWebElementMethod (WebDriver driver,WebElement element,String clickType) throws Exception

	{
		if(clickType=="click")
		{
			try
			{
				element.click();
				Thread.sleep(2000);
			} catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
		else if(clickType=="javascript")
		{

			try {
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", element);
			} catch (Exception e) 
			{

				System.out.println(e.getMessage());
			}
		}
		else if(clickType=="Key")
		{

			{
				try
				{
					element.sendKeys(Keys.ENTER);
					element.sendKeys(Keys.TAB);

					Thread.sleep(2000);
				} catch (Exception e) 
				{
					System.out.println(e.getMessage());
				}
			}

		}

	}
	public void verifyWebElement(WebElement element, String ExpectedText)
	{

		try {
			if(element.getText().contains(ExpectedText))
			{
				System.out.println(ExpectedText+" is present on Page");
			}
			else
			{

				System.out.println(ExpectedText+" is not present on Page");
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}


	}
}

