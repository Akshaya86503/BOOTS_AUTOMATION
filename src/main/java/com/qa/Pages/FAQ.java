package com.qa.Pages;
import java.awt.AWTException;
import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;

public class FAQ extends BasePage 
{
	//Validate banner image click
	public void ValidateFAQAccrodionClick()throws InterruptedException, AWTException
	{
	CommonMethods.IterateThroughAccordion();
	}
}
		

