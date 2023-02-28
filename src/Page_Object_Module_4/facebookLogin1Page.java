package Page_Object_Module_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookLogin1Page 
{
	@FindBy(xpath="//input[@id='email']")private WebElement UN;
	@FindBy(xpath="//input[@id='pass']")private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']")private WebElement LoginBtn;
	
	public facebookLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUN()
	{
		UN.sendKeys("karalenitish979@gmail.com");
	}
	
	public void enterPassword()
	{
		PWD.sendKeys("nkhonor8pro");
	}
	
	public void ClickLoginBtn()
	{
		LoginBtn.click();
	}
	
}
