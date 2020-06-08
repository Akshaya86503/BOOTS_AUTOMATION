package com.qa.Base;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.qa.CommonFunctions.CommonMethods;

public class BasePage 
{
	 public static WebDriver driver;
	 public static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Code to access the URL
		public static void Initialization()
		{
			CommonMethods.ReadFile("C:/Users/arahate/git/BOOTS_AUTOMATION/src/main/java/com/qa/Config/Configuration.properties");
			String browserName = CommonMethods.prop.getProperty("BROWSER");
			if(browserName.equals("chrome"))
			{
				ChromeOptions options = new ChromeOptions();
		        options.addArguments("--incognito");
				System.setProperty("webdriver.chrome.driver", "D:/Akshaya/General/Other/eclipse/chromedriver_win32/chromedriver.exe");
				driver = new ChromeDriver(options);
			}
			driver.manage().window().maximize();
			driver.get(CommonMethods.prop.getProperty("URL"));
		}
}
