package com.qa.Test;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.BasePage;
import com.qa.Pages.HomePage;
import com.qa.CommonFunctions.*;

public class HomePageTest extends BasePage
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
	
	@Test(priority=7)
	public void HomepageBannerClickTest() throws InterruptedException, AWTException
    {
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.buttonAcceptCookies).click();
	homepage.ValidateHomepageBannerClick();
	}
	
	@Test(priority=8)
	public void HomepageStoryBannerClickTest() throws InterruptedException, AWTException
    {
	homepage.ValidateOurStoriesSliderClick();
	}
	
	@Test(priority=9)
	public void ValidateFollowOurStorySliderClickTest() throws InterruptedException, AWTException
    {
	//homepage.ValidateFollowOurStorySliderClick();
	}
	 
	@AfterClass
	 public void SetUpEnd()
	 {
		driver.quit();
	 }
}
