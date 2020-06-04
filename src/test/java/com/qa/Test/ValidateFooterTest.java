package com.qa.Test;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.BasePage;
import com.qa.CommonFunctions.ValidateFooter;
import com.qa.CommonFunctions.WebElements;
import com.qa.Pages.HomePage;

public class ValidateFooterTest extends BasePage
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
	
	@Test(priority=1)
	 public void ValidateBootsFooterLinksTest() throws InterruptedException, AWTException
	 {
	ValidateFooter.validateBootsFooterLinks();
	 }
	
	@Test(priority=2)
	 public void ValidateBootsFooterSocialMediaLinksTest() throws InterruptedException, AWTException
	 {
	ValidateFooter.validateBootsFooterSocialMediaLinks();
	 }
	
	@AfterClass
	 public void SetUpEnd()
	 {
	 	
	 }
}
