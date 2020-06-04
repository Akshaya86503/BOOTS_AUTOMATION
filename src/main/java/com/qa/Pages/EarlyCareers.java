package com.qa.Pages;

import java.awt.AWTException;

import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;
import com.qa.CommonFunctions.UniqueDesignMethods;
import com.qa.CommonFunctions.WebElements;

public class EarlyCareers extends BasePage
{
	//Validate banner image click
	public void ValidateBannerImageClick()throws InterruptedException, AWTException
	{
	UniqueDesignMethods.BannerImageClickMethod();
	}
	
	//Validate single story selection click
	public void ValidateSingleStorySelectionClick()throws InterruptedException, AWTException
	{
	UniqueDesignMethods.SingleStorySelectionClickMrthod("//img[@title='Future Leaders Apprenticeship']");	
	}
	
	//Validate latest jobs section
	public void ValidateLatestJobsSelection()throws InterruptedException, AWTException
	{
	UniqueDesignMethods.ViewLatestJobsSelection();
	}
	
	//Validate latest jobs section
	public void ValidateLatestJobRolesSelection()throws InterruptedException, AWTException
	{
	UniqueDesignMethods.ViewLatestRolesSectionSelection();
	}
	
	//Validate latest jobs section
	public void ValidateTwitIconSelection()throws InterruptedException, AWTException
	{
	UniqueDesignMethods.TwitIconsClick();
	}
	
	
}
