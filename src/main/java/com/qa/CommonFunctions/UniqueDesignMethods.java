package com.qa.CommonFunctions;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.Base.BasePage;

public class UniqueDesignMethods extends BasePage
{
	public static void BannerImageClickMethod() throws AWTException, InterruptedException
	{
	Thread.sleep(4000);
	WebElements.imgBannerImage.click();
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.linkBannerImageIWantToWorkForBoots);
	CommonMethods.NewtabFunction(WebElements.linkBannerImageIWantToWorkForBoots);
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.buttonImageBannerClose).click();
	}
	
	public static String SingleStorySelectionClickMrthod(String xp) throws AWTException, InterruptedException
	{
    Thread.sleep(4000);
	WebElement locatedElement = CommonMethods.Mousemove(driver.findElement(By.xpath(xp)));
	CommonMethods.NewtabFunction(locatedElement);
	return xp;
	}
	
	public static void TwitIconsClick() throws AWTException, InterruptedException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.iconTwitterReply);
		CommonMethods.NewtabFunction(WebElements.iconTwitterReply);
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.iconTwitterRetweet);
		CommonMethods.NewtabFunction(WebElements.iconTwitterRetweet);
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.iconTwitterFav);
		CommonMethods.NewtabFunction(WebElements.iconTwitterFav);
	}
	
	public static void ViewLatestRolesSectionSelection() throws AWTException, InterruptedException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonViewLatestRolesSection).click();
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkBannerImageIWantToWorkForBoots);
		CommonMethods.NewtabFunction(WebElements.linkBannerImageIWantToWorkForBoots);
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonImageBannerClose).click();
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonViewLatestRolesSubitems);
		CommonMethods.NewtabFunction(WebElements.buttonViewLatestRolesSubitems);		
	}
	
	public static void ViewLatestJobsSelection() throws AWTException, InterruptedException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonExplore);
		CommonMethods.NewtabFunction(WebElements.buttonExplore);
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonLatestJobsSelection);
		CommonMethods.NewtabFunction(WebElements.buttonLatestJobsSelection);		
	}
	
	
	
	

}
