package Page_Object_Module_5;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class One8HomePage 
{
	@FindBy(xpath="(//img[@class='img-responsive'])[2]") private WebElement closeBtn;
	@FindBy(xpath="//a[text()='SHOP NOW']") private WebElement shopNoWBtn;
	
	public void switchFocusToChildWindow(WebDriver driver) 
	{
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allids);
		String childwindowId = al.get(1);
		driver.switchTo().window(childwindowId);
	}
	
	
	public One8HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void closeOne8HomePagePopUp()
	{
		closeBtn.click();
	}
	
	public void verifyOne8HomePageShopNowBtn()
	{
		String act_text=shopNoWBtn.getText();
	//	System.out.println(act_text);
		String exp_text="SHOP NOW";
		
		if(act_text.equals(exp_text))
		{
			System.out.println("Test Case3: "+"Pass");
		}
		else
		{
			System.out.println("Test Case3: "+"Fail");
		}
		
	}
	
}
