package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage_2 
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
	
	public KiteHomePage_2 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyUserID()
	{
		String actUserID = UserID.getText();
		String expUserID =  "FE5680";
		
		if (actUserID.equals(expUserID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	
}
