package Components;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Travel_Elements;
import PageObjects.Travel_WebElements;
import Utilities.BaseClass;

public class Travel2 extends BaseClass {

	public Travel2() {
		this.driver = driver;
	}


	@Test
	public void GetQuoteTest() throws InterruptedException, IOException {
		Travel_Elements Travel_obj = new Travel_Elements(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.acceptCookies)).click();
		System.out.println("cookies accepted");
		takeScreenshot("Scenario_cookies accepted");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.SingleTrip)).click();
		logger.info("SingleTrip");
		takeScreenshot("Annual Trip");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Europe)).click();
		logger.info("Europe");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.WinterSportYes)).click();
		logger.info("WinterSportYes");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Tomorrow)).click();
		logger.info("Tomorrow");
		takeScreenshot("Tomorrow");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.FiveNights)).click();
		logger.info("5Nights");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Individual)).click();
		logger.info("Individual");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.dd)).sendKeys("21");
		logger.info("Date");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.mm)).sendKeys("02");
		logger.info("month");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.yyyy)).sendKeys("1993");
		logger.info("year");
		wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.getQuoteContinue)).click();
		logger.info("Continue");
		Thread.sleep(5000);
	}



    @Test(priority = 2) 

    public void PreExistingMedicalQuesTest() throws InterruptedException 

    { 
      WebDriverWait wait = new WebDriverWait(driver, 60);
      Travel_Elements Travel_obj = new Travel_Elements(driver);
      wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.MedicalNoQ1)).click();
      logger.info("MedicalNoQ1");
      wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.MedicalNoQ2)).click();
      logger.info("MedicalNoQ2");
      wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.MedicalYesQ3)).click();
      logger.info("MedicalYesQ3");
      wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.MedicalYesQ4)).click();
      logger.info("MedicalYesQ4");
      wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.MedicalYesQ5)).click();
      logger.info("MedicalYesQ5");
      wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.MedicalNoQ6)).click();
      logger.info("MedicalNoQ6");
      wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Continue)).click();
      logger.info("Continue");
      
    }
    
    @Test(priority = 3) 
	  public void Details() throws InterruptedException 
	  { 
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  Travel_Elements Travel_obj = new Travel_Elements(driver);
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
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Proceed)).click();
	  logger.info("Proceed");
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Continuebutton)).click();
	  logger.info("Contiune");
	  }
	  
	  @Test(priority = 4) 
	  public void StartScreening() throws InterruptedException 
	  { 
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  Travel_Elements Travel_obj = new Travel_Elements(driver);
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.StartScreening)).click();
	  logger.info("StartScreening");
	  
	  }
	  
	  @Test(priority = 5) 
	  public void MedicalScreening() throws InterruptedException 
	  { 
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  Travel_Elements Travel_obj = new Travel_Elements(driver);
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.iframe)).click();
	  driver.switchTo().frame(Travel_obj.iframe);
	  logger.info("iframe");
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.ConditionText)).sendKeys("cold");
	  logger.info("ConditionText");
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Search)).click();
	  logger.info("Search");
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Select)).click();
	  logger.info("Select");
	  
 }
	  
	  @Test(priority = 6) 
	  public void MedicalProceed() throws InterruptedException 
	  { 
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  Travel_Elements Travel_obj = new Travel_Elements(driver);
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Next)).click();
	  logger.info("Next");
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Finish)).click();
	  logger.info("Finish");
	  
	  }
	  
	  
	  @Test(priority = 7) 
	  public void ChooseCover() throws InterruptedException 
	  { 
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  Travel_Elements Travel_obj = new Travel_Elements(driver);
	  driver.switchTo().defaultContent();
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.ChooseCover)).click();
	  logger.info("ChooseCover");
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.NextOptions)).click();
	  logger.info("NextOptions");
	  }
	  
	  @Test(priority = 8) 
	  public void CustomisePolicy() throws InterruptedException 
	  { 
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  Travel_Elements Travel_obj = new Travel_Elements(driver);
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.NextMedicalCover)).click();
	  logger.info("NextMedicalCover");
	  }
	  
	  
	  @Test(priority = 9) 
	  public void MedicalAddCover() throws InterruptedException 
	  { 
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  Travel_Elements Travel_obj = new Travel_Elements(driver);
	  
	  Thread.sleep(5000);
	  ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.AddCover)).click();
	  logger.info("AddCover");
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Summary)).click();
	  logger.info("Summary");
	  
}
	  
	  
	  @Test(priority = 10) 
	  public void NextPayment() throws InterruptedException 
	  { 
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  Travel_Elements Travel_obj = new Travel_Elements(driver);
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.NextPayment)).click();
	  logger.info("NextPayment");
	  
	  }
	  
	  @Test(priority = 11) 
	  public void Payment() throws InterruptedException 
	  { 
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  Travel_Elements Travel_obj = new Travel_Elements(driver);
	  wait.until(ExpectedConditions.elementToBeClickable(Travel_obj.Iframe)).click();
	  driver.switchTo().frame(Travel_obj.Iframe);
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
	

