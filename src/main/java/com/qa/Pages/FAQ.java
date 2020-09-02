package com.qa.Pages;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;

public class FAQ extends BasePage 
{
	//Validate banner image click
	public void ValidateFAQAccrodionClick()throws InterruptedException, AWTException
	{
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
	CommonMethods.IterateThroughAccordion();
	}
}
		

