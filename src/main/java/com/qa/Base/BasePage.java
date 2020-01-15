package com.qa.Base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.qa.CommonFunctions.CommonMethods;

public class BasePage 
{
	 public static WebDriver driver;
	
	// Code to access the URL
		public static void Initialization()
		{
			CommonMethods.ReadFile("D:/Akshaya/General/Other/Selenium Projects/"
					+ "Automated Testing With Selenium/Boots_Automation/"
					+ "src/main/java/com/qa/Config/Configuration.properties");
			String browserName = CommonMethods.prop.getProperty("BROWSER");
			if(browserName.equals("chrome"))
			{
				ChromeOptions options = new ChromeOptions();
		        options.addArguments("--incognito");
				System.setProperty("webdriver.chrome.driver", "D:/Akshaya/General/Other/eclipse/chromedriver_win32/chromedriver.exe");
				driver = new ChromeDriver(options);
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(CommonMethods.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(CommonMethods.IMPLICIT_WAIT,TimeUnit.SECONDS);
			driver.get(CommonMethods.prop.getProperty("URL"));
		}
}
