package POM_DDF_TestNG_BaseClass_UtilityClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement userid;
	@FindBy(xpath="//a[text()=' Logout']")private WebElement logout;
	
	 public KiteHomePage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);	
	}
	 public String getKiteHomePageUserID()
	{ String actualUserID = userid.getText();
	   return actualUserID;
	}
//	 public void LogOut(WebDriver driver)
//	{
//		Actions act=new Actions(driver);
//		act.moveToElement(userid).click().perform();
//		logout.click();
//	}
	public void LogOut(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(userid).click().perform();
		logout.click();
		
	}
	 public void clickKiteHomePagelogOut(WebDriver driver) 
   {
	  Actions act=new Actions(driver);
	  act.moveToElement(userid).click().perform();
	  logout.click();
   }
	
	
	
	
//   @FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
//   @FindBy(xpath = "//a[@target='_self']") private WebElement logOut;
//  
//   public KiteHomePage(WebDriver driver)
//   {
//	   PageFactory.initElements(driver, this);
//   }
//   
//   public String getKiteHomePageUserID()
//   {
//	   String actualUserID = UserID.getText();
//	   return actualUserID;
//   }
//   
//   public void clickKiteHomePagelogOut(WebDriver driver) 
//   {
//	  Actions act=new Actions(driver);
//	  act.moveToElement(UserID).click().perform();
//	  logOut.click();
//   }
   
}
