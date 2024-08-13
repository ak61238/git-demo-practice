package seleniumautomation.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumautomation.baseTest.BaseTest;
import seleniumautomation.pageobjects.HomePage;
import seleniumautomation.pageobjects.LandingPage;
import seleniumautomation.pageobjects.LoginPage;





public class BaseClass extends BaseTest {
	LandingPage lp = new LandingPage(driver);
	HomePage homepg = new HomePage(driver);
	
	

	

	@Test(priority =1)
	public void login_into_the_application() throws IOException, InterruptedException
	{
		login.logintoApplication(prop.getProperty("email"), prop.getProperty("password"));
		//loginpg.securityerror();
	}
//	@Test(priority = 1)
//	public void error_while_login()
//	{
//		loginpg.errorwhilelogin(prop.getProperty("email"), prop.getProperty("invalidpassword"));
//	}
	
	@Test(priority = 2)
	public void title_of_landingPage() throws IOException, InterruptedException
	{
		
		lp = new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.verifyLandingPagetitle();
		lp.enableallaccounttoggle();
		lp.clickonallaccountbtn();
	}
	
	@Test(priority = 3)
	public void landingpage_clickBackbutton()
	{
		lp = new LandingPage(driver);
		lp.click_back_button();
	}
	
	@Test(priority = 4)
	public void Landingsearchcompanyname() {
		lp = new LandingPage(driver);
		lp.searchCompanyaccount("Domi");
	
		
	}
	
	@Test()
	public void Notificationicon()
	{
		homepg = new HomePage(driver);
		homepg.clickonNotificationicon();
		homepg.clickonNotificationoptions();
	}
	
	

}

		
	

//		
//		// LOGIN PAGE
//		//driver.findElement(By.id("signInEmailAddress")).sendKeys("akash.fm2@yopmail.com");
//		//driver.findElement(By.id("currentPassword")).sendKeys("Test@1234");
//		//Thread.sleep(5000);
//		//WebElement loginbtn = driver.findElement(By.id("authorize-submit"));
//		//loginbtn.click();
//		LoginPage lp = new LoginPage(driver);
//		lp.logintoApplication("akash.fm2@yopmail.com", "Test@1234");
//		driver.getCurrentUrl();
//		lp.errorwhilelogin("akash.fm2@yopmail.com", "Test@12345");
//		
// 
////    	WebElement security_error_msg = driver.findElement('security')]By.xpath("//p[contains(text(),"));
////    	int i=0;
////    	try
////    	{
////            security_error_msg.isDisplayed();
////		    loginbtn.click();
////		    i++;
////    	}
////		    catch (NoSuchElementException e){
////		        System.out.println("Element is not present");
////		       
////		    }
////		}
////		}
////		catch(NoSuchElementException e)
////		{
////			System.out.println("Login worked");
////		}
//		
//		//Company account page
//		
////		System.out.println(driver.getTitle());
////		Thread.sleep(5000);
////		WebElement webElement = driver.findElement(By.xpath("(//span[contains(@class,'c-control__fake-input')])[1]"));
////		((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
////		Thread.sleep(30000);
////		
////		JavascriptExecutor jse =(JavascriptExecutor)driver;
////		WebElement allaccount = driver.findElement(By.id("dataButtonContinue"));
////		jse.executeScript("arguments[0].scrollIntoView();", allaccount);
////		allaccount.click();
////		
////		
////		// Home page
////		Thread.sleep(5000);
////		
////		WebElement navigation_icon = driver.findElement(By.xpath("//button[contains(@class,'c-button')][@data-testid='left-menu']"));
////		navigation_icon.click();
////	    WebDriverWait dri = new WebDriverWait(driver, Duration.ofSeconds(5));
////	    WebElement element = dri.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/mfe/cards']")));
////	    element.click();
////	    Thread.sleep(5000);
////		
////	    
////		//Cards page
////	    List<WebElement> cards =driver.findElements(By.xpath("//tr[contains(@class,'c-cards-list')][3]"));
////	    for(WebElement ordercards :cards)
////	    {
////	    	ordercards.click();
////	    }
////	    
	    
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	//    driver.quit();
		
	
		
		
	


