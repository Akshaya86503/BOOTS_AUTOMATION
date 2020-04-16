package com.qa.Pages;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;

public class HomePage extends BasePage
{
	//Accept cookies button
	@FindBy(xpath="//*[contains(text(), 'Accept Cookies')]")
	WebElement cookieBtn;

	//Search jobs button
	@FindBy(xpath="/html/body/nav/ul/li[7]/a")
	WebElement searchjobsBtn;

	//Search jobs external (i want to work for boots) button
	@FindBy(xpath="/html/body/nav/ul/li[7]/div/ul/li[1]/a/span")
	WebElement searchjobsExternalBtn;
	
	//Logo
	@FindBy(xpath="/html/body/nav/div/a/img")
	WebElement imgLogo;

	//object initialization
	public HomePage() throws FileNotFoundException 
	{
		PageFactory.initElements(driver, this);
	}

	//Action
	//Testcase1:Validate page logo
	public boolean ValidatePageLogo()
	{
		return imgLogo.isDisplayed();
	}
	
	//Testcase2:Validate page title
	public String ValidatePageTitle()throws InterruptedException
	{
		return driver.getTitle();
	}
	
	
	//Testcase3 : Validate accept cookies button click functionality
	public void ValidateAcceptCookies() throws InterruptedException, AWTException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(cookieBtn);
		Thread.sleep(4000);
		cookieBtn.click();
	}

	//Testcase4 : Navigate to search jobs external (I want to work for boots) page
	public void NavigateToSearchJobsExpternalPage() throws InterruptedException, AWTException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(searchjobsBtn);
		Thread.sleep(4000);
		CommonMethods.Mousemove(searchjobsExternalBtn);
		Thread.sleep(4000);
		searchjobsExternalBtn.click();
		
	}
	
	
}
