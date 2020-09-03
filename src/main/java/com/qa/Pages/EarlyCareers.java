package com.qa.Pages;

import java.awt.AWTException;
import com.qa.Base.BasePage;
import com.qa.CommonFunctions.UniqueDesignMethods;

public class EarlyCareers extends BasePage
{
	//Method to validate banner image click
	public void ValidateBannerImageClick()throws InterruptedException, AWTException
	{
	UniqueDesignMethods.BannerImageClickMethod();
	}
	
	//Method to validate single story selection click
	public void ValidateSingleStorySelectionClick()throws InterruptedException, AWTException
	{
	UniqueDesignMethods.SingleStorySelectionClickMrthod("//img[@title='Future Leaders Apprenticeship']");	
	}
	
	//Method to validate latest jobs section
	public void ValidateLatestJobsSelection()throws InterruptedException, AWTException
	{
	UniqueDesignMethods.ViewLatestJobsSelection();
	}
	
	//Method to validate latest jobs section
	public void ValidateLatestJobRolesSelection()throws InterruptedException, AWTException
	{
	UniqueDesignMethods.ViewLatestRolesSectionSelection();
	}
	
	//Method to validate latest jobs section
	public void ValidateTwitIconSelection()throws InterruptedException, AWTException
	{
	UniqueDesignMethods.TwitIconsClick();
	}
	
	
}
