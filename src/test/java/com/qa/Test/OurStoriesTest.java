package com.qa.Test;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;
import com.qa.CommonFunctions.WebElements;
import com.qa.Pages.OurStories;

public class OurStoriesTest extends BasePage
{
	OurStories storypage;
	WebElements newwebelemets;
	
	//@BeforeClass
	public void SetUpStart() throws FileNotFoundException
	{
		Initialization();
		storypage = new OurStories();
		newwebelemets = new WebElements();
	}
	
	//@Test(priority=14)
	public void OurStoriesPageTest() throws AWTException, InterruptedException
	{
		CommonMethods.NavigateToPerticularPage(WebElements.menuOurStories);
		Thread.sleep(4000);
		storypage.ValidateOurStorySection();
	}
	
	//@AfterClass
	 public void SetUpEnd()
	 {
		 
	 }
}
