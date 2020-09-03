package com.qa.Test;

import java.awt.AWTException;
import java.io.FileNotFoundException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.BasePage;
import com.qa.CommonFunctions.ValidateHeader;
import com.qa.CommonFunctions.WebElements;
import com.qa.Pages.HomePage;

public class ValidateHeaderTest extends BasePage
{
	HomePage homepage;
	WebElements newwebelemets;
	
	@BeforeClass
	public void SetUpStart() throws FileNotFoundException
	{
		Initialization();
		homepage = new HomePage();
		newwebelemets = new WebElements();
	}
	
	@Test
	public void ValidateBootsLogoTest() throws InterruptedException, AWTException
    {
	ValidateHeader.validateBootsLogo();
    }
	
	@Test
	public void ValidateBootsMenuBarTest() throws InterruptedException, AWTException
    {
	ValidateHeader.validateBootsMenuBar();
    }
	
	@Test
	public void ValidateBootsSearchBarTest() throws InterruptedException, AWTException
    {
		ValidateHeader.validateBootsSearchBarWithValidData();
    }
	
	@Test
	public void ValidateBootsSearchJobsTest() throws InterruptedException, AWTException
    {
	ValidateHeader.validateBootsSearchJobsButtonClick();
	}
	
	@AfterClass
	 public void SetUpEnd()
	 {
	 	//driver.quit();
	 }
}
