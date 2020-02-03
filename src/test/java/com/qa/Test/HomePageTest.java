package com.qa.Test;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.BasePage;
import com.qa.Pages.ExternalJobSearch;
import com.qa.Pages.HomePage;

import junit.framework.Assert;

public class HomePageTest extends BasePage
{
	HomePage homepage;
	ExternalJobSearch External;
	
	@BeforeClass
	public void SetUpStart() throws FileNotFoundException
	{
		Initialization();
		homepage = new HomePage();
		External = new ExternalJobSearch();
	}
	
	@Test(priority=1)
	 public void ValidatePageTitle() throws InterruptedException, AWTException
	 {
	 	String Title=homepage.ValidatePageTitle();
	 	Assert.assertEquals(Title, "Home - Boots Jobs - Career Opportunities with Boots");
	 	System.out.println(Title);
	 }
	
	@Test(priority=2)
	 public void ValidatePageLogo() throws InterruptedException, AWTException
	 {
	 	Boolean flag=homepage.ValidatePageLogo();
	 	Assert.assertTrue(flag);
	 }
	
	@Test(priority=3)
	 public void Accept_Cookie_Policy() throws InterruptedException, AWTException
	 {
	 	homepage.ValidateAcceptCookies();
	 }

	 @Test(priority=4)
	 public void Navigate_To_JobSearch_Link() throws InterruptedException, AWTException
	 {
	 	homepage.NavigateToSearchJobsExpternalPage();
	 }
	 
	 @AfterClass
	 public void SetUpEnd()
	 {
	 	
	 }
}
