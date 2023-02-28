package POM_With_DDF1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
	
	 public KiteHomePage(WebDriver driver)
	 {
		PageFactory.initElements(driver, this); 
	 }
	 
	 public void VerifyUserID(String expUserID)
	 {
		  String actUserID = UserID.getText();
		  
		  if(actUserID.equals(expUserID))
		  {
			  System.out.println("Pass");
		  }
		  else
		  {
			  System.out.println("Fail");
		  }
	 }
	 
	
}
