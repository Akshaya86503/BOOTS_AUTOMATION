package com.qa.Test;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;
import com.qa.CommonFunctions.WebElements;
import com.qa.Pages.EarlyCareers;

public class EarlyCareersTest extends BasePage
{
	EarlyCareers ECarrer;
	WebElements newwebelemets;
	
	@BeforeClass
	public void SetUpStart() throws FileNotFoundException
	{
		Initialization();
		ECarrer = new EarlyCareers();
		newwebelemets = new WebElements();
	}
	
	
	@Test
	public void ValidateImageBannerClickTest() throws InterruptedException, AWTException
    {
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonAcceptCookies).click();
		WebElements.menuEarlyCareer.click(); 
		Thread.sleep(4000);
		ECarrer.ValidateBannerImageClick();
	}
	
	@Test
	public void ValidateLatestJobsSectionClickTest() throws InterruptedException, AWTException
    {
		//ECarrer.ValidateLatestJobsSelection();
    }
	
	@Test
	public void ValidateLatestJobsRolesSectionClickTest() throws InterruptedException, AWTException
    {
		
		ECarrer.ValidateLatestJobRolesSelection();
    }
	
	@Test
	public void ValidateTwitIconClickTest() throws InterruptedException, AWTException
    {
		ECarrer.ValidateTwitIconSelection();
    }
	
	@Test
	public void ValidateSingleStorySelectionClickTest() throws InterruptedException, AWTException
    {
		ECarrer.ValidateSingleStorySelectionClick();
    }
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	if(ITestResult.FAILURE==result.getStatus())
	{
		CommonMethods.captureScreenshot(result);
	}
	}
	
	@AfterClass
	 public void SetUpEnd()
	 {
		//driver.quit();
	 }
}
