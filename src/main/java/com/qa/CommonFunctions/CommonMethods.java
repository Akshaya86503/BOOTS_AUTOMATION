package com.qa.CommonFunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.Base.BasePage;

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
			

}
