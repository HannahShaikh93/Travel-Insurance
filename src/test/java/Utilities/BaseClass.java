package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getApplicationURL();
	public String chrome = readconfig.getChromePath();
	public String firefox = readconfig.getFirefoxPath();

	public static WebDriver driver;

	public static Logger logger;

	@Parameters("browser")
	@BeforeTest
	public void setup(String br) throws WebDriverException, IOException {
		logger = Logger.getLogger("TraveLinsur");
		PropertyConfigurator.configure("log4j.properties");

		if (br.equals("chrome")) {
			
			  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			  ChromeOptions options = new ChromeOptions();
			 options.addArguments("--incognito");
			 //options.addArguments("--headless");
			  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			  WebDriverManager.chromedriver().setup(); 
			  driver = new ChromeDriver(options);
			

		} else if (br.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (br.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		// driver.get(baseURL);

		logger.info("Insurefor Get quote page Title :-" + driver.getTitle());

	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

//	 Full_Page_Screenshot
	public void takeScreenshot(String fileName) throws WebDriverException, IOException {

		// take screenshot and store it as a file format:
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					// now copy the screenshots in desired location using copyfile method:
		FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "\\Screenshots\\" + fileName + ".jpg"));


	}
	

}
