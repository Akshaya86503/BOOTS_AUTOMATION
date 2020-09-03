package com.qa.Pages;
import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;
import com.qa.CommonFunctions.WebElements;


public class PharmacistPage extends BasePage
{
	//Method to validate book a call back form submission
	public void BookaCallBackWithValidData(String FN,String LN,String Email,String Cemail,String Phone,String Cjob,String Prole,String Ploc,String Cbtoday, String Cbtime) throws InterruptedException, AWTException
	{
		Thread.sleep(4000);
		WebElements.textboxFirstName.sendKeys(FN);
		WebElements.textboxLastName.sendKeys(LN);
		WebElements.textboxEmail.sendKeys(Email);
		WebElements.textboxConfirmEmail.sendKeys(Cemail);
		WebElements.textboxPhoneNumber.sendKeys(Phone);
		WebElements.textboxCurruntJob.sendKeys(Cjob);
		Thread.sleep(4000);
		WebElements.drpPreferredRole.click();	
        driver.findElement(By.xpath("//div[@class='dropdown department open']/ul/li[text()='"+Prole+"']")).click();
        Thread.sleep(4000);
		WebElements.drpPreferredLocation.click();	
        driver.findElement(By.xpath("//div[@class='dropdown location open']/ul/li[text()='"+Ploc+"']")).click();
        Thread.sleep(4000);
        WebElements.drpCallBackToday.click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div[3]/div/div/form/div/div[5]/div[1]/div[1]/ul/li['"+Cbtoday+"']")).click();
        Thread.sleep(4000);
		WebElements.drpCallBackTime.click();
        driver.findElement(By.xpath("//div[@class='dropdown time open']/ul/li[text()='"+Cbtime+"']")).click();
       // Thread.sleep(4000);
		//WebElements.buttonSubmit.click();
		
	}
	
	/*Method to validate all locations drop down functionality
	public void ValidateAllLocationsFunctionalitytest() throws AWTException, InterruptedException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.drpAllLocations).click();
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.txtLocationName).click();
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonViewJobs);
		CommonMethods.NewtabFunction(WebElements.buttonViewJobs);
	}*/
	
	//Method to validate all locations drop down functionality
	public void ValidateAllLocationsFunctionality() throws InterruptedException, AWTException
	{
		CommonMethods.Mousemove(WebElements.drpAllLocations);
		Thread.sleep(4000);
		WebElements.drpAllLocations.click();
		 ArrayList<String> arlTest = new ArrayList<String>();
		 arlTest.add("South West");
		 arlTest.add("London");
		for(int i=0;i<arlTest.size();i++)
		{
		Thread.sleep(4000);
		WebElement txt = CommonMethods.Mousemove(driver.findElement(By.xpath("//div[@class='location-container drop-locations']/div/ul/li/span[text()='"+arlTest.get(i)+"']")));
		Thread.sleep(4000);
		txt.click();
		Thread.sleep(4000);
		WebElements.drpAllLocations.click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='navy-blue-t drop clicked']")).click();
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonViewJobs);
		Thread.sleep(4000);
		CommonMethods.NewtabFunction(WebElements.buttonViewJobs);
		
	}
	}
	

