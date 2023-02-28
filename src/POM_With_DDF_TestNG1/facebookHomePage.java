package POM_With_DDF_TestNG1;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class facebookHomePage 
{
	@FindBy(xpath="//span[text()='Nitish Karale']") private WebElement UID;
	@FindBy(xpath="(//div[contains(@class,'x1ey2m1c xds687c xg01cxk')])[8]")private WebElement ProfileLogo;
	@FindBy(xpath="//span[text()='Log Out']") private WebElement Logout;
	
	public facebookHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getFacebookHomePageUserID()
	{
		String act_UserID=UID.getText();
		return act_UserID;
	}
	
	public void clickFacebookHomePageProfileLogo()
	{
		ProfileLogo.click();
	}
	
	public void clickFacebookHomePageLogout()
	{
		Logout.click();
	}
}
