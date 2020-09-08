package com.qa.CommonFunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;

import com.qa.Base.BasePage;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;

public class CommonMethods extends BasePage
{
	public static Properties prop;
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	//Method to read data from properties file
	public static void ReadFile(String filepath)
	{
		try
		{
		prop = new Properties();
		FileInputStream ip = new FileInputStream(filepath);
		prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return;
		
		
	}
	
	//method to move mouse on screen with hand icon
	public static WebElement Mousemove(WebElement e) throws AWTException
	{
	org.openqa.selenium.Point coordinates = e.getLocation();
	Robot robot = new Robot();
	robot.mouseMove(coordinates.getX(),coordinates.getY()+120);
	return e;
	}
	
	//open link in new tab without closing current tab
	public static WebElement NewtabFunction(WebElement ex) throws AWTException, InterruptedException
	{
		 Actions action = new Actions(driver);
		 action.contextClick(ex).build().perform();
		 Thread.sleep(1000);
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 robot.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		return ex;
	}
	
	//method to open link in new tab directly
	public static WebElement NewtabFunctionDirect(WebElement ex) throws AWTException, InterruptedException
	{
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).moveToElement(ex).click().perform();
		return ex;
	
	}
			
//Read data from excel file
	public static Object[][] ExcelRedaer(String path, String sheetName) throws IOException {
		FileInputStream file= new FileInputStream(path);
	    XSSFWorkbook wb = new XSSFWorkbook(file);
	    XSSFSheet sheet = wb.getSheet(sheetName);
	    int rowCount = sheet.getLastRowNum();
	    int column = sheet.getRow(0).getLastCellNum();
	    Object[][] data = new Object[rowCount][column];
	    for (int i = 1; i <= rowCount; i++) {
	        XSSFRow row = sheet.getRow(i);
	        for (int j = 0; j < column; j++) {
	            XSSFCell cell = row.getCell(j);
	            DataFormatter formatter = new DataFormatter();
	            String val = formatter.formatCellValue(cell);
	            data[i - 1][j] = val;
	        }
	    }
	    return data;
	}
	
	//method to iterate through accordion
	public static void IterateThroughAccordion() throws InterruptedException
	{	
		Thread.sleep(4000);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='faq-accordian-question']"));
		java.util.Iterator<WebElement> i = elements.listIterator(19);
		while(i.hasNext()) {
		    WebElement element = i.next();
		    if (element.isDisplayed()) {
		      element.click();
		      Thread.sleep(4000);
		      element.click();
		    }
		}
	}
	
	//Method to scroll down to webpage
	public static void ScrolledDownWebpage() throws InterruptedException
	{
		for (int second = 0;; second++) {
	        if(second >=60){
	            break;
	        }
	            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", ""); //y value '400' can be altered
	            Thread.sleep(3000);
	}
	}
	
	
	//Method to navigate to perticular menu
	public static void NavigateToPerticularPageCareerAreas(WebElement path) throws InterruptedException, AWTException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonAcceptCookies).click();
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.menuCareerAreas);
		Thread.sleep(4000);
		CommonMethods.Mousemove(path).click();
	}
	
	
	public static void NavigateToPerticularPage(WebElement path) throws InterruptedException, AWTException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonAcceptCookies).click();
		Thread.sleep(4000);
		CommonMethods.Mousemove(path).click();
	}
	
	//Method to capture screenshot
	public static void captureScreenshot(ITestResult result)
	{	 
		try 
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Failed screenshots/"+result.getName()+".png"));
		} 
		catch (Exception e)
		{
		System.out.println("Exception while taking screenshot "+e.getMessage());
		}
	}

}
