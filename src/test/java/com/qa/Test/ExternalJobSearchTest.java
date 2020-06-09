package com.qa.Test;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;
import com.qa.CommonFunctions.WebElements;
import com.qa.Pages.ExternalJobSearch;

public class ExternalJobSearchTest extends BasePage
{
	ExternalJobSearch External;
	WebElements webdata;
	
	
	@BeforeClass
	public void SetUpStart() throws FileNotFoundException
	{
		Initialization();
		External = new ExternalJobSearch();
		webdata = new WebElements();
	}
	
	@DataProvider
	 public Object[][] getExcelData() throws InvalidFormatException, IOException{
	 return CommonMethods.ExcelRedaer("C:/Users/arahate/git/BOOTS_AUTOMATION/src/main/java/com/qa/TestData/test1.xlsx", "Sheet1");
	 }
	 
	@Test(priority=12)
	 public void SearchJobs_With_InvalidData() throws InterruptedException, AWTException
	 {
		 External.SearchJobsWithInvalidData();
	 }
   @Test(priority=13)
	 public void SearchJobs_With_SortingOptions() throws InterruptedException, AWTException
	 {
		 External.ValidateJobsSortingFunctionality();
	 }
	 
	@Test(priority=14)
	 public void SearchJobs_With_Pagination() throws InterruptedException, AWTException
	 {
		 External.ValidateJobsPaginationFunctionality();
	 }
	 
	@Test(dataProvider = "getExcelData",priority=15)
	 public void SearchJobsWithValidData(String keyt, String Loct, String dist, String bus, String fun, String job, String cont, String ref) throws InterruptedException, AWTException
	 {
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/button")).click();
		Thread.sleep(4000);
		WebElements.buttonSearchJobs.click();
		WebElements.buttonIWantToWorkForBoots.click();
		Thread.sleep(4000);
		External.SearchJobsWithValidData(keyt,Loct,dist,bus,fun,job,cont,ref);
	 } 
	 
	@AfterClass
	 public void SetUpEnd()
	 {
	
	 }
}
