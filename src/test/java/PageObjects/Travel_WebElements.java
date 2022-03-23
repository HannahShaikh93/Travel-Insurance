package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class Travel_WebElements extends BaseClass{
	


	public Travel_WebElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/app-root/app-get-quote/app-header/div[1]/app-cookie/div/div/div/div[2]/button")
	@CacheLookup
	public WebElement acceptCookies;
	//TRIP TYPE
	@FindBy(xpath = "//p[contains(text(),'Annual Multi-Trip')]")
	@CacheLookup
	public WebElement AnnualTrip;
	
	//TRAVELLING TO
	@FindBy(xpath = "//p[contains(text(),'Worldwide including USA,    Canada, Caribbean Isla')]")
	@CacheLookup
	public WebElement WWInc;
	
	//WINTERSPORTS
	@FindBy(xpath = "//label[@for='WintersportsYes']")
	@CacheLookup
	public WebElement WintersportsYes;
	
	//START DATE
	@FindBy(xpath = "//label[@for='dayStart1']")
	@CacheLookup
	public WebElement Today;
	
	//WHO TRAVELING WITH
	@FindBy(xpath = "//label[@for='Individual']")
	@CacheLookup
	public WebElement OnePerson;
	
	//DATE
	@FindBy(xpath = "//*[@id='traveller0DD']")
	@CacheLookup
	public WebElement dd;
	//MONTH
	@FindBy(xpath = "//*[@id='traveller0MM']")
	@CacheLookup
	public WebElement mm;
	//YEAR
	@FindBy(xpath = "//*[@id='traveller0YY']")
	@CacheLookup
	public WebElement yyyy;
	
	//GETQUOTE
	@FindBy(xpath = "//button[contains(text(),' Continue ')]")
	@CacheLookup
	public WebElement getQuoteContinue;
	
	//pre-existing medical
	@FindBy(xpath = "//label[@for='MedicalNoQ1']")
	@CacheLookup
	public WebElement MedicalNoQ1;
	//Q2
	@FindBy(xpath = "//label[@for='MedicalNoQ2']") 
	@CacheLookup 
	public WebElement MedicalNoQ2;
	//Q3
	@FindBy(xpath = "//label[@for='MedicalNoQ3']") 
	@CacheLookup 
	public WebElement MedicalNoQ3;
	
	//COUNTIUNE TO TRAVEL ONLY QUOTE
	@FindBy(xpath = "//span[contains(text(),'CONTINUE TO TRAVEL ONLY QUOTE')]") 
	@CacheLookup 
	public WebElement continueToTravelOnlyQuote;
	
	//CHOOSE COVER
	@FindBy(xpath = "//div[contains(text(),'Choose cover')]") 
	@CacheLookup 
	public WebElement ChooseCover;
	
	//NEXTOPTIONS
	@FindBy(xpath = "//span[contains(text(),'Next:')]") 
	@CacheLookup 
	public WebElement NextOptions;
	//NEXT TRAVELLER 
	@FindBy(xpath = "//span[contains(text(),'Next:')]") 
	@CacheLookup 
	public WebElement NextTraveller;
	
	//DETAILS 
	//Title
	@FindBy(xpath = "//select[@id='TravellerTitle0']") 
	@CacheLookup 
	public WebElement Title;
	//SELECT MRS
	@FindBy(xpath = "//option[contains(text(),'Mrs')]") 
	@CacheLookup 
	public WebElement TitleOption;
	//FNAME
	@FindBy(xpath = "//input[@id='travellerFname0']") 
	@CacheLookup 
	public WebElement FirstName;
	//LNAME
	@FindBy(xpath = "//input[@id='travellerLname0']") 
	@CacheLookup 
	public WebElement LastName;
	
	//PHONENO
	@FindBy(xpath = "//body/app-root[1]/app-travellers[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]") 
	@CacheLookup 
	public WebElement PhoneNumber;
	
	//EMAIL
	@FindBy(xpath = "//body/app-root[1]/app-travellers[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/input[1]") 
	@CacheLookup 
	public WebElement Email;
	
	//CONSENT
	@FindBy(xpath = "/html/body/app-root/app-travellers/div/div/form/div[1]/div[2]/div/div/div/div[1]/div[5]/label/div/label") 
	@CacheLookup 
	public WebElement Consent;
	
	//BYEMAIL
		@FindBy(xpath = "//strong[contains(text(),'Email')]") 
		@CacheLookup 
		public WebElement ByEmail;
		
	//POSTCODE
		@FindBy(xpath = "//input[@id='PostCodeMain']") 
		@CacheLookup 
		public WebElement Postcode;
		
	//FINDADDRESS
		@FindBy(xpath = "//div[contains(text(),'Find Address')]") 
		@CacheLookup 
		public WebElement FindAddress;
		
	//CHOOSEADDRESS
		@FindBy(xpath = "//select[@id='addressSelect']") 
		@CacheLookup 
		public WebElement ChooseAddress;
		
	//SELECTADDRESS
		@FindBy(xpath = "//option[contains(text(),'3 Smallbrook Close , Cwmbran')]") 
		@CacheLookup 
		public WebElement SelectAddress;
		
	//AUTORENEWAL
		@FindBy(xpath = "//div[contains(text(),'Switch off automatic renewal')]") 
		@CacheLookup 
		public WebElement AutoRenewal;
	
	//PROCEED
		@FindBy(xpath = "//div[contains(text(),'If you are happy to proceed, please tick the box.')]") 
		@CacheLookup 
		public WebElement Proceed;
		
	//CONTINUE
		@FindBy(xpath = "/html/body/app-root/app-travellers/div/div/form/div[2]/div/div[2]/label/div/button") 
		@CacheLookup 
		public WebElement Continue;
		
	//PAYMENT
		@FindBy(xpath = "//span[contains(text(),'Next:')]") 
		@CacheLookup 
		public WebElement Payment;
		
	//PAYMENT PAGE
		
		
		//iframe
		@FindBy(xpath = "//*[@id='contentFrame']") 
		@CacheLookup 
		public WebElement iframe;
		
		
		//CARD NUMBER
		
		@FindBy(xpath = "//*[@id=\"UPPFormCardFormCard\"]") 
		@CacheLookup 
		public WebElement CardNumber;
		
		//SECURITY NO
		@FindBy(xpath = "//*[@id=\"UPPFormCardFormCV2\"]") 
		@CacheLookup 
		public WebElement SecurityNumber;
		
		//EXPIRY MONTH
		@FindBy(xpath = "//*[@id=\"UPPFormCardFormExMonth\"]/option[11]") 
		@CacheLookup 
		public WebElement ExpiryMonth;
		
	   //EX YEAR
		@FindBy(xpath = "//*[@id=\"UPPFormCardFormExYear\"]/option[6]") 
		@CacheLookup 
		public WebElement ExpiryYear;
		
		//PAY NOW
		
		@FindBy(xpath = "//*[@id=\"UPPFormButtonPay\"]") 
		@CacheLookup 
		public WebElement PayNow;
		
		
		//policynumber
		@FindBy(xpath = "/html/body/app-root/app-paymentsuccess/div/div/div[1]/div/div[1]/div") 
		@CacheLookup 
		public WebElement textMsg;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

	
	
	
	
	
	
	
	
	

}
