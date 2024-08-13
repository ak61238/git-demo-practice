package seleniumautomation.pageobjects;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage {
	WebDriver driver;
	String URL ="https://fleethub-sit.shell.com/mfe/interstitial/companyaccounts";
	
	public LoginPage(WebDriver driver) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="signInEmailAddress")
	WebElement useremail;
	
	@FindBy(id="currentPassword")
	WebElement password;
	
	@FindBy(id="authorize-submit")
	WebElement signinbtn;
	
	@FindBy(xpath="//p[contains(text(),'Incorrect')]")
	WebElement loginerrormessage;
	
	@FindBy(xpath="//p[contains(text(),'security')]")
	WebElement securityerrormsg;
	
	public void logintoApplication(String email, String pass)
	{
	
    	useremail.sendKeys(email);
		password.sendKeys(pass);
		signinbtn.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		signinbtn.click();
		
	}
	
	public void loadURL() throws IOException
	{
		driver.get(URL);
		

	}
}
	
		
	

