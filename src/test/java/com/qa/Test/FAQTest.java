package com.qa.Test;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;
import com.qa.CommonFunctions.WebElements;
import com.qa.Pages.FAQ;

public class FAQTest extends BasePage
{
	FAQ faqpage;
	WebElements newwebelemets;
	
	@BeforeClass
	public void SetUpStart() throws FileNotFoundException
	{
		Initialization();
		faqpage = new FAQ();
		newwebelemets = new WebElements();
	}
	
	@Test
	public void FAQpageTextAccordionTest() throws InterruptedException, AWTException
    {
		CommonMethods.NavigateToPerticularPage(WebElements.menuFAQ);
		Thread.sleep(4000);
		faqpage.ValidateFAQAccrodionClick();
	}
	
	
	@AfterClass
	 public void SetUpEnd()
	 {
		//driver.quit();
	 }
}
