package Page_Object_Module_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookHomePage 
{
	@FindBy (xpath="//span[text()='Nitish Karale']") private WebElement uid;
	
	public facebookHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyUserId()
	{
		String actUserId = uid.getText();
		String expUserId = "Nitish Karale";
		
		if(actUserId.equals(expUserId))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
}
