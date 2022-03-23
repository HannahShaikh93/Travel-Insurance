package Components;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.Travel_WebElements;
import Utilities.BaseClass;

public class Travel extends BaseClass {

	public Travel() {
		this.driver = driver;
	}



	@Test
	public void GetQuoteTest() throws InterruptedException, IOException {
		 Travel_WebElements Travel_obj = new Travel_WebElements(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.acceptCookies)).click();
		System.out.println("cookies accepted");
		takeScreenshot("Scenario_cookies accepted");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.AnnualTrip)).click();
		logger.info("Annual Trip");
		takeScreenshot("Annual Trip");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.WWInc)).click();
		logger.info("WWInc");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.WintersportsYes)).click();
		logger.info("WintersportsYes");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Today)).click();
		logger.info("Today");
		takeScreenshot("Today");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.OnePerson)).click();
		logger.info("OnePerson");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.dd)).sendKeys("10");
		logger.info("Date");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.mm)).sendKeys("05");
		logger.info("month");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.yyyy)).sendKeys("1990");
		logger.info("year");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.getQuoteContinue)).click();
		logger.info("Continue");
		Thread.sleep(5000);
	}
		
		  @Test(priority = 2) 
		  public void PreExistingMedicalQuesTest() throws InterruptedException 
		  { 
		  WebDriverWait wait = new WebDriverWait(driver, 60);
		  Travel_WebElements Travel_obj = new Travel_WebElements(driver);
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.MedicalNoQ1)).click();
		  logger.info("MedicalNoQ1");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.MedicalNoQ2)).click();
		  logger.info("MedicalNoQ2");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.MedicalNoQ3)).click();
		  logger.info("MedicalNoQ3");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.continueToTravelOnlyQuote)).click();
		  logger.info("contiune");
		  
		 
			  
		  }
		
		  @Test(priority = 3) 
		  public void ChooseCover() throws InterruptedException 
		  { 
		  WebDriverWait wait = new WebDriverWait(driver, 60);
		  Travel_WebElements Travel_obj = new Travel_WebElements(driver);
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.ChooseCover)).click();
		  logger.info("ChooseCover");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.NextOptions)).click();
		  logger.info("NextOptions");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.NextTraveller)).click();
		  logger.info("NextTraveller");
		  
		  }
		  
		  @Test(priority = 4) 
		  public void Details() throws InterruptedException 
		  { 
		  WebDriverWait wait = new WebDriverWait(driver, 60);
		  Travel_WebElements Travel_obj = new Travel_WebElements(driver);
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Title)).click();
		  logger.info("Title");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.TitleOption)).click();
		  logger.info("TitleOption");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.FirstName)).sendKeys("Test");
		  logger.info("FirstName");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.LastName)).sendKeys("Tester");
		  logger.info("LastName"); 
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.PhoneNumber)).sendKeys("98736123897");
		  logger.info("PhoneNumber");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Email)).sendKeys("shaikhhannah996@gmail.com");
		  logger.info("Email");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Consent)).click();
		  logger.info("Consent");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.ByEmail)).click();
		  logger.info("ByEmail");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Postcode)).sendKeys("NP44 3QA");
		  logger.info("Postcode");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.FindAddress)).click();
		  logger.info("FindAddress");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.ChooseAddress)).click();
		  logger.info("ChooseAddress");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.SelectAddress)).click();
		  logger.info("SelectAddress");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.AutoRenewal)).click();
		  logger.info("AutoRenewal");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Proceed)).click();
		  logger.info("Proceed");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Continue)).click();
		  logger.info("Continue");
		  
		  }
		  
		  @Test(priority = 4) 
		  public void Summary() throws InterruptedException 
		  { 
			  WebDriverWait wait = new WebDriverWait(driver, 60);
			  Travel_WebElements Travel_obj = new Travel_WebElements(driver);
			  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Payment)).click();
			  logger.info("NextPayment");
		  }
		  @Test(priority = 4) 
		  public void Payment() throws InterruptedException 
		  { 
		  WebDriverWait wait = new WebDriverWait(driver, 60);
		  Travel_WebElements Travel_obj = new Travel_WebElements(driver);
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.iframe)).click();
		  driver.switchTo().frame(Travel_obj.iframe);
		  logger.info("iframe");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.CardNumber)).sendKeys("4000000000001026");
		  logger.info("CardNumber");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.SecurityNumber)).sendKeys("123");
		  logger.info("SecurityNumber");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.ExpiryMonth)).click();
		  logger.info("ExpiryMonth");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.ExpiryYear)).click();
		  logger.info("ExpiryYear");
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.PayNow)).click();
		  logger.info("PayNow");
		  driver.switchTo().defaultContent();
		  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.textMsg)).getText();
		  logger.info("textMsg");
		  System.out.println(Travel_obj.textMsg.getText());
	  
		  
		  
		  
		  
		 
	}
}

