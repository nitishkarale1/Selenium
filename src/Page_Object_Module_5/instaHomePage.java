package Page_Object_Module_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;




public class instaHomePage
{
	@FindBy(xpath="//div[text()='Profile']") private WebElement Profile;
	@FindBy(xpath="//h2[text()='nitish_karale']") private WebElement UserName;
	@FindBy(xpath="(//div[text()='Search'])[1]") private WebElement SearchIcon;
	@FindBy(xpath="//input[@placeholder='Search']") private WebElement SearchBar;
	
	//@FindBy(xpath="//div[contains(@class,'x20f619 x78zum5 xdt5ytf x6ikm8r')]//div") private WebElement AllSuggestions;
	@FindBy(xpath="//div[text()='virat.kohli']") private WebElement PlayerName;
	@FindBy(xpath="//h1[text()='Carpediem!']") private WebElement Caption;
	@FindBy(xpath="//div[text()='one8.com']") private WebElement One8;
	
//	@FindBys(@FindBy(xpath="//div[contains(@class,'x20f619 x78zum5 xdt5ytf x6ikm8r')]//div")) private List<WebElement> AllSuggestions;
	
	
	public instaHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickInstaHomePageProfile()
	{
		Profile.click();
	}
	
	public void verifyInstaHomePageUserName()
	{
		String ActualUserName=UserName.getText();
		String ExpUserName="nitish_karale";
		
		if(ActualUserName.equals(ExpUserName))
		{
			System.out.println("Test Case2: "+"Pass");
		}
		else
		{
			System.out.println("Test Case2: "+"Fail");
		}
		
	}
	
	public void clickInstaHomePageSearch()
	{
		SearchIcon.click();
	}
	
	public void inpInstaHomePageSearchBar()
	{
		SearchBar.sendKeys("Virat Kohli");	
	}
	
	public void verifyInstaHomePageCaption(WebDriver driver) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(PlayerName).perform();
		act.click(PlayerName).perform();
		 
		String act_caption=Caption.getText();
		String exp_caption="Carpediem!";
		
		if(act_caption.equals(exp_caption))
		{
			System.out.println("Test Case2: "+"Pass");
		}
		else
		{
			System.out.println("Test Case2: "+"Fail");
		}
		
		Thread.sleep(2000);
		
//		for(WebElement A1:AllSuggestions)
//		{
//			String act_inp=A1.getText();
//			System.out.println(act_inp);
//			String exp_inp="virat.kohli";
//			if(act_inp.equals(exp_inp))
//			{
//				A1.click();
//				System.out.println("Pass");
//			}
//			else
//			{
//				System.out.println("Fail");
//			}
		}
	
	
	public void clickInstaHomePageOne8Link()
	{
		One8.click();
	}
	
	
}	
	
	
	
	
