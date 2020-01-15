package com.qa.Test;
import java.awt.AWTException;
import java.io.FileNotFoundException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.BasePage;
import com.qa.Pages.ExternalJobSearch;

public class ExternalJobSearchTest extends BasePage
{
	ExternalJobSearch External;
	
	@BeforeClass
	public void SetUpStart() throws FileNotFoundException
	{
		External = new ExternalJobSearch();
	}
	
	@Test(priority=3)
	 public void Search_Jobs_With_InvalidData() throws InterruptedException, AWTException
	 {
		 External.SearchJobsWithInvalidData();
	 }
	 
	 @Test(priority=4)
	 public void SearchJobs_With_SortingOptions() throws InterruptedException, AWTException
	 {
		 External.ValidateJobsSortingFunctionality();
	 }
	 
	 @Test(priority=5)
	 public void SearchJobs_With_Pagination() throws InterruptedException, AWTException
	 {
		 External.ValidateJobsPaginationFunctionality();
	 }
	 
	 @Test(priority=6)
	 public void Search_Jobs_With_ValidData() throws InterruptedException, AWTException
	 {
		 External.SearchJobsWithValidData();
	 }
	 
	 @AfterClass
	 public void SetUpEnd()
	 {
	 	
	 }
}
