package com.w2a.base;

import java.io.FileInputStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.w2a.utilities.ExcelReader;
import com.w2a.utilities.ExtentManager;
import com.w2a.utilities.MonitoringMail;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Page {

	public static WebDriver driver;//static keyword was used so that you don't have to crate instance of the object each time.
	public static CRMTopMenu menu;
	public static Properties object_repository = new Properties();
	public static Properties common_config = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger(Page.class);
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/com/w2a/excel/testdata.xlsx");
	public static MonitoringMail mail = new MonitoringMail();
	public static WebDriverWait wait;
	//public ExtentReports rep = ExtentManager.getInstance();
	//public static ExtentTest test;

	public Page() {
		
		if (driver==null) { 
			/*First time, driver==null, so firefox browser is launched. In LoginTest, when HomePage class was callled, it extended Page superclass.
			When loginPage class was called, it did not extend from Page class, bcoz the driver was not equal to null and was equal to chrome driver. If loginPage
			called Page class, new browser window would opena and exeption woudl be seen*/
			
		WebDriverManager.chromedriver().setup();
		
		//COnfiguring the browser to disable browser window pop up, yellow bars
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		driver = new ChromeDriver(options);

		/*WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();*/

		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menu = new CRMTopMenu(driver);
		}
	}

}
