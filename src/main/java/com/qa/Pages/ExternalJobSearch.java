package com.qa.Pages;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;

public class ExternalJobSearch extends BasePage
{
JavascriptExecutor jsx = (JavascriptExecutor)driver;

	
	        //page factory
	        //Enter keywords
			@FindBy(xpath="//*[@id='search_text']")
			WebElement enterkeywordsTextbox;
			
			@FindBy(xpath="//*[@id='jobs_search']/div[1]/ul/li[2]/a[contains(text(), 'support pharmacist')]")
			WebElement enterkeywordsTextboxAuto;
			
			//Enter location
			@FindBy(xpath="//*[@id='location']")
			WebElement enterlocationTextbox;
			
			//Select distance
			@FindBy(xpath="//*[@id='jobs_search']/div[1]/div[3]/div/span")
			WebElement selectDistanceDropdown;
			
			//select distance dropdown option
			//@FindBy(xpath="//*[@id='jobs_search']/div[1]/div/ul/li[@data-value='"+check+"']")
			WebElement selectDistanceDropdownOption;
			
			//Enter job reference
			@FindBy(xpath="//*[@id='job_reference']")
			WebElement enterjobreferenceTextbox;
			
			//Click on filter button
			@FindBy(xpath="//*[@id='jobs_search']/a[1]")
			WebElement filterBtn;
			
			//Select business area
			@FindBy(xpath="//*[@id='jobs_search']/div[2]/div[1]/div/span")
			WebElement selectbusinessareaDropdown;
			
			//Select business area dropdown option
			@FindBy(xpath="//*[@id='jobs_search']/div[2]/div[1]/ul/li[@data-value='Supply Chain']")
			WebElement selectbusinessareaDropdownOption;
			
			//Select function area
			@FindBy(xpath="//*[@id='jobs_search']/div[2]/div[2]/div/span")
			WebElement selectfunctionareaDropdown;
			
			//Select function area dropdown option
			@FindBy(xpath="//*[@id='jobs_search']/div[2]/div[2]/ul/li[@data-value='Supply and Demand Planning']")
			WebElement selectfunctionareaDropdownOption;
			
			//Select specialism
			@FindBy(xpath="//*[@id='jobs_search']/div[2]/div[3]/span")
			WebElement selectspecialismDropdown;
			
			//Select specialism dropdown option
			@FindBy(xpath="//*[@id='jobs_search']/div[2]/div[3]/ul/li[@data-value='Quality']")
			WebElement selectspecialismDropdownOption;
			
			//Select job type
			@FindBy(xpath="//*[@id='jobs_search']/div[2]/div[4]/div/span")
			WebElement selectjobtypeDropdown;
			
			//Select job type dropdown option
			@FindBy(xpath="//*[@id='jobs_search']/div[2]/div[4]/ul/li[@data-value='Full-time']")
			WebElement selectjobtypeDropdownOption;
			
			//Select contract type
			@FindBy(xpath="//*[@id='jobs_search']/div[2]/div[5]/div/span")
			WebElement selectcontracttypeDropdown;
			
			//Select contract type option
			@FindBy(xpath="//*[@id='jobs_search']/div[2]/div[5]/ul/li[@data-value='Permanent']")
			WebElement selectcontracttypeDropdownOption;
			
			//Click on "Lets Search CTA"
			@FindBy(xpath="//*[@id='do-search']/span")
			WebElement letssearchCTA;
			
			//Click on Reset CTA
			@FindBy(xpath="//*[@id='jobs_search']/a[2]")
			WebElement resetCTA;
			
			//Click on 'Read More CTA'
			@FindBy(xpath="//span[text()='Read more']")
			WebElement readmoreCTA;
			
			//Click on Apply button
			@FindBy(xpath="//span[text()='Apply']")
			WebElement applyBTN;
			
			//Click on Sort By dropdown
			@FindBy(xpath="//span[text()='Sort by']")
			WebElement sortbyDRP;

			//object initialization
			public ExternalJobSearch() throws FileNotFoundException 
			{
				PageFactory.initElements(driver, this);
				}
			
			//Action
			//Testcase1 : Search jobs with valid data
			public void SearchJobsWithValidData(String keyword,String Location,String Distance,String BusArea,String FunArea,String JobType,String ConType,String Reference) throws InterruptedException, AWTException
			{
				Thread.sleep(4000);
				enterkeywordsTextbox.clear();
				enterjobreferenceTextbox.clear();
				enterlocationTextbox.clear();
				Thread.sleep(4000);
				enterkeywordsTextbox.sendKeys(keyword);
				enterlocationTextbox.sendKeys(Location);
				selectDistanceDropdown.click();
				Thread.sleep(4000);
		        driver.findElement(By.xpath("//*[@id='jobs_search']/div[1]/div[3]/div/ul/li[text()='"+Distance+"']")).click();
				Thread.sleep(4000);
				selectbusinessareaDropdown.click();
		        driver.findElement(By.xpath("//*[@id='jobs_search']/div[2]/div[1]/div/ul/li[text()='"+BusArea+"']")).click();
		        Thread.sleep(4000);
				selectfunctionareaDropdown.click();
		        driver.findElement(By.xpath("//*[@id='jobs_search']/div[2]/div[2]/div/ul/li[text()='"+FunArea+"']")).click();
		        Thread.sleep(4000);
		        selectjobtypeDropdown.click();
		        Thread.sleep(4000);
		        driver.findElement(By.xpath("//*[@id='jobs_search']/div[2]/div[4]/div/ul/li[text()='"+JobType+"']")).click();
		        Thread.sleep(4000);
		        selectcontracttypeDropdown.click();
		        Thread.sleep(4000);
		        driver.findElement(By.xpath("//*[@id='jobs_search']/div[2]/div[5]/div/ul/li[text()='"+ConType+"']")).click();
		        Thread.sleep(4000);
				enterjobreferenceTextbox.sendKeys(Reference);
		        Thread.sleep(4000);
	            letssearchCTA.click();
	            CommonMethods.Mousemove(readmoreCTA);
	            Thread.sleep(4000);
	            readmoreCTA.click();
			}
			
			//Testcase2 : Search jobs with invalid data
			public void SearchJobsWithInvalidData() throws InterruptedException, AWTException
			{
				Thread.sleep(4000);
				enterkeywordsTextbox.sendKeys(CommonMethods.prop.getProperty("InvalidKeyword"));
				Thread.sleep(4000);
				enterlocationTextbox.sendKeys(CommonMethods.prop.getProperty("InvalidLocation"));
				Thread.sleep(4000);
				enterjobreferenceTextbox.sendKeys(CommonMethods.prop.getProperty("InvalidReference"));
				Thread.sleep(4000);
		        letssearchCTA.click();
			}
			
			public void ValidateJobsSortingFunctionality() throws InterruptedException, AWTException
			{
				driver.navigate().refresh();
				Thread.sleep(4000);
				sortbyDRP.click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/div[4]/main/section/div[2]/div[2]/div[1]/div[1]/ul/li[text()='"+CommonMethods.prop.getProperty("SortBy")+"']")).click();
			}
			
			public void ValidateJobsPaginationFunctionality() throws InterruptedException, AWTException
			{
				driver.navigate().refresh();
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/div[4]/main/section/div[2]/div[2]/div[2]/div[1]/ul/li[4]/a/span")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/div[4]/main/section/div[2]/div[2]/div[2]/div[1]/ul/li[6]/a/span")).click();
			}
}
