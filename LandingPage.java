package seleniumautomation.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(css =".c-icon.c-page-header__section-back-arrow")
	WebElement LandingpageBack_btn;
	
	@FindBy(xpath = "(//button[@data-company-id='RO12345678'])[4]")
	WebElement selectsinglecompanyaccount_btn;
	
	@FindBy(id ="accountsSearchForm")
	WebElement comapnyaccountsearchbox_btn;
	
	@FindBy(id ="dataButtonContinue")
	WebElement landingpageallaccount_btn;

	
	public String verifyLandingPagetitle() {
		return driver.getTitle();
	}
	
	public void enableallaccounttoggle()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement webElement = driver.findElement(By.xpath("(//span[contains(@class,'c-control__fake-input')])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
        try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
	
	  public void clickonallaccountbtn()
      {
      JavascriptExecutor jse =(JavascriptExecutor)driver;
		WebElement allaccount = landingpageallaccount_btn;
		jse.executeScript("arguments[0].scrollIntoView();", allaccount);
		allaccount.click();
      }
	  
	  public void click_back_button()
	  {
		  LandingpageBack_btn.click();
	  }
	  
	  public void searchCompanyaccount(String company_name)
	  {
		  comapnyaccountsearchbox_btn.sendKeys(company_name);
		  comapnyaccountsearchbox_btn.click();
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

	


	
	
	
	
	
	
	

}
