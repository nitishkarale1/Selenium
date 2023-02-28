package Page_Object_Module_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class instaLoginpage 
{
	@FindBy(xpath="//input[@name='username']")private WebElement UN;
	@FindBy(xpath="//input[@name='password']")private WebElement PWD;
	@FindBy(xpath="//div[text()='Log in']")private WebElement LoginBtn;
	
	public instaLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpInstaLoginPageUserName()
	{
		UN.sendKeys("karalenitish979@gmail.com");
	}
	
	public void inpInstaLoginPagePassword()
	{
		PWD.sendKeys("nitish@9418");
	}
	
	public void clickLoginPageLoginBtn()
	{
		LoginBtn.click();
	}
}
