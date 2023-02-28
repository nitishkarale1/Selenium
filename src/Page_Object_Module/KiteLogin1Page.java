package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page
{
	//Step1: variable declaration
	@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement LoginBtn;
	
	//Step2: variable initialization
	public KiteLogin1Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Step3: variable usage
	public void enterUN()
	{
		UN.sendKeys("FE5680");
	}
	
	public void enterPWD()
	{
		PWD.sendKeys("nitishk@7620");
	}
	
	public void clickOnLoginBtn()
	{
		LoginBtn.click();
	}
	
	
}
