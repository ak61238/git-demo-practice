package seleniumautomation.pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@data-tabs-toggle='notifications']")
	WebElement Notification_btn;
	
	@FindBy(css="button[data-tabs-toggle='account']")
	WebElement account_btn;
	
	@FindBy(xpath="//button[@class ='c-hygiene-secondary-nav__link']")
	List<WebElement> Notification_option_link;
	
	@FindBy(className ="c-hygiene-content__detail_name")
	WebElement loggedinUsername;
	
	// methord
	
	public void clickonNotificationicon()
	{
		Notification_btn.sendKeys(Keys.ENTER);
	}
	
	public void clickonNotificationoptions()
	{
		for(int i=0;i<Notification_option_link.size();i++)
		{
			if(Notification_option_link.get(i).getText().equalsIgnoreCase("Card Status Update"))
			{
				Notification_option_link.get(i).click();
			}

		}
	}
	
	public void validateloggedinUserName()
	{
		String actualvalue = "AkashKumar FM";
		account_btn.click();
		String expectedvalue = loggedinUsername.getText();
		Assert.assertEquals(expectedvalue, actualvalue);
		
	}
	
	
	

}
