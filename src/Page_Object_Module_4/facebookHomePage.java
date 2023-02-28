package Page_Object_Module_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookHomePage 
{
	@FindBy(xpath="(//span[text()='Nitish Karale'])[1]")private WebElement Name;
	
	public facebookHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyName()
	{
		String ActualUN=Name.getText();
		String ExpUN="Nitish Karale";
		
		if(ActualUN.equals(ExpUN))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
