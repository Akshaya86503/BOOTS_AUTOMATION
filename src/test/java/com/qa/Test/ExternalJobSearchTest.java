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
import com.qa.Pages.ExternalJobSearch;

public class ExternalJobSearchTest extends BasePage
{
	ExternalJobSearch External;
	@BeforeClass
	public void SetUpStart() throws FileNotFoundException
	{
		External = new ExternalJobSearch();
	}
	
	@DataProvider
	 public Object[][] getExcelData() throws InvalidFormatException, IOException{
	 return CommonMethods.ExcelRedaer("C:/Users/arahate/git/BOOTS_AUTOMATION/src/main/java/com/qa/TestData/test1.xlsx", "Sheet1");
	 }
	 
	 @Test(priority=4)
	 public void SearchJobs_With_InvalidData() throws InterruptedException, AWTException
	 {
		 External.SearchJobsWithInvalidData();
	 }
     //@Test(priority=6)
	 public void SearchJobs_With_SortingOptions() throws InterruptedException, AWTException
	 {
		 External.ValidateJobsSortingFunctionality();
	 }
	 
	 @Test(priority=5)
	 public void SearchJobs_With_Pagination() throws InterruptedException, AWTException
	 {
		 External.ValidateJobsPaginationFunctionality();
	 }
	 
	 @Test(dataProvider = "getExcelData",priority=7)
	 public void Search_Jobs_With_ValidData(String keyt, String Loct, String dist, String bus, String fun, String job, String cont, String ref) throws InterruptedException, AWTException
	 {
		 External.SearchJobsWithValidData(keyt,Loct,dist,bus,fun,job,cont,ref);
	 } 
	 
	 @AfterClass
	 public void SetUpEnd()
	 {
	 	
	 }
}
