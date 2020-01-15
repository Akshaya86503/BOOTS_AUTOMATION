package com.qa.Test;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.BasePage;
import com.qa.Pages.ExternalJobSearch;
import com.qa.Pages.HomePage;

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
	 public void Accept_Cookie_Policy() throws InterruptedException, AWTException
	 {
	 	homepage.ValidateAcceptCookies();
	 }

	 @Test(priority=2)
	 public void Navigate_To_JobSearch_Link() throws InterruptedException, AWTException
	 {
	 	homepage.NavigateToSearchJobsExpternalPage();
	 }
	 
	 @AfterClass
	 public void SetUpEnd()
	 {
	 	
	 }
}
