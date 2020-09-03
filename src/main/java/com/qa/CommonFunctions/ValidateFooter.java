package com.qa.CommonFunctions;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.qa.Base.BasePage;

public class ValidateFooter extends BasePage
{
	//Method to validate footer links
	public static void validateBootsFooterLinks() throws InterruptedException, AWTException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonAcceptCookies).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		
		/*Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterbootsukcom);
		CommonMethods.NewtabFunction(WebElements.linkFooterbootsukcom);*/
		
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterBootsCSR);
		CommonMethods.NewtabFunction(WebElements.linkFooterBootsCSR);
		
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterBootscom);
		CommonMethods.NewtabFunction(WebElements.linkFooterBootscom);
		
		/*Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterContactUs);
		CommonMethods.NewtabFunction(WebElements.linkFooterContactUs);*/
		
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterAccessibility);
		CommonMethods.NewtabFunction(WebElements.linkFooterAccessibility);
		
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterSitemap);
		CommonMethods.NewtabFunction(WebElements.linkFooterSitemap);
		
		/*Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterPrivacyStatement);
		CommonMethods.NewtabFunction(WebElements.linkFooterPrivacyStatement);
		
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterCookiePolicy);
		CommonMethods.NewtabFunction(WebElements.linkFooterCookiePolicy);*/
	}
	
	//Method to validate footer social media links
	public static void validateBootsFooterSocialMediaLinks() throws InterruptedException, AWTException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.imgFooterSocialShareIcon).click();
		CommonMethods.Mousemove(WebElements.imgFooterSocialShareIcon).click();
		
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterSocialTwitter);
		CommonMethods.NewtabFunction(WebElements.linkFooterSocialTwitter);
		
	
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterSocialLinkedIn);
		CommonMethods.NewtabFunction(WebElements.linkFooterSocialLinkedIn);
		
		/*Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterSocialEmail);
		CommonMethods.NewtabFunction(WebElements.linkFooterSocialEmail);*/
		
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterSocialFacebook);
		CommonMethods.NewtabFunction(WebElements.linkFooterSocialFacebook);
		
		/*Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.imgFooterSocialShareIcon).click();
		
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterFacebook);
		CommonMethods.NewtabFunction(WebElements.linkFooterFacebook);
		
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterTwitter);
		CommonMethods.NewtabFunction(WebElements.linkFooterTwitter);
		
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterInstagram);
		CommonMethods.NewtabFunction(WebElements.linkFooterInstagram);
		
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.linkFooterLinkedIn);
		CommonMethods.NewtabFunction(WebElements.linkFooterLinkedIn);*/
		
	}
	
	
}
