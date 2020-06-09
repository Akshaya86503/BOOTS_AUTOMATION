package com.qa.Test;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;
import com.qa.CommonFunctions.WebElements;
import com.qa.Pages.PharmacistPage;

public class PharmacistPageTest extends BasePage
{
	PharmacistPage pharmacy;
	WebElements newwebelemets;
	
	@BeforeClass
	public void SetUpStart() throws FileNotFoundException
	{
		Initialization();
		pharmacy = new PharmacistPage();
		newwebelemets = new WebElements();
	}
	
	@DataProvider
	 public Object[][] getExcelData() throws InvalidFormatException, IOException
	{
	 return CommonMethods.ExcelRedaer("C:/Users/arahate/git/BOOTS_AUTOMATION/src/main/java/com/qa/TestData/test1.xlsx", "Sheet2");
	 }
	
	@Test(priority=1)
	public void AllLocationsFunctionalityTest() throws AWTException, InterruptedException
	{
	CommonMethods.NavigateToPerticularPageCareerAreas(WebElements.careerPharmacist);
	Thread.sleep(4000);
	pharmacy.ValidateAllLocationsFunctionality();
	}
	
	@Test(dataProvider = "getExcelData",priority=2)
	 public void BookaCallBackFormWithValidDataTest(String FN, String LN, String Email, String Cemail, String Phone, String Cjob, String Prole, String Ploc, String Cbtoday, String Cbtime) throws InterruptedException, AWTException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonBookaCallBack);
		Thread.sleep(4000);
		WebElements.buttonBookaCallBack.click();
		 pharmacy.BookaCallBackWithValidData(FN, LN, Email, Cemail, Phone, Cjob, Prole, Ploc, Cbtoday, Cbtime);
	} 
	
	 
	@AfterClass
	 public void SetUpEnd()
	 {
		
	 }
}
