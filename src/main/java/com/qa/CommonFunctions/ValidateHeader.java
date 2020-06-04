package com.qa.CommonFunctions;
import java.awt.AWTException;

import com.qa.Base.BasePage;

public class ValidateHeader extends BasePage
{
public static void validateBootsLogo() throws InterruptedException, AWTException
{
	//Accept cookies
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.buttonAcceptCookies).click();
	//validate logo
	CommonMethods.Mousemove(WebElements.imgClientLogo);
	CommonMethods.NewtabFunction(WebElements.imgClientLogo);
	
}

public static void validateBootsMenuBar() throws InterruptedException, AWTException
{
	//1) Home menu
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.menubarHome);
	CommonMethods.NewtabFunction(WebElements.menubarHome);
	
	//2) Career areas
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.menuCareerAreas);
	
	//Career areas - pharmacy 
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.carrerPharmacy);
	CommonMethods.NewtabFunction(WebElements.carrerPharmacy);

	//Career areas - retail
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.carrerRetail);
	CommonMethods.NewtabFunction(WebElements.carrerRetail);
	
	//Career areas - opticians
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.carrerOpticians);
	CommonMethods.NewtabFunction(WebElements.carrerOpticians);
	
	//Career areas - seasonal - Airport
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.carrerSeasonalAirport);
	CommonMethods.NewtabFunction(WebElements.carrerSeasonalAirport);
	
	//Career areas - ireland
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.carrerIreland);
	CommonMethods.NewtabFunction(WebElements.carrerIreland);
	
	//Career areas - supply chain
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.carrerSupplyChain);
	CommonMethods.NewtabFunction(WebElements.carrerSupplyChain);
	
	//Career areas - support office
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.carrerSupportOffice);
	CommonMethods.NewtabFunction(WebElements.carrerSupportOffice);
	
	//Career areas - view all stories button click
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.buttonViewAllStoriesFromCarrerAreasMenu);
	CommonMethods.NewtabFunction(WebElements.buttonViewAllStoriesFromCarrerAreasMenu);
	
	//Early carrer menu
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.menuEarlyCareer);
	CommonMethods.NewtabFunction(WebElements.menuEarlyCareer);
	
	//Our stories menu
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.menuOurStories);
	CommonMethods.NewtabFunction(WebElements.menuOurStories);
	
	//FAQs menu
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.menuFAQ);
	CommonMethods.NewtabFunction(WebElements.menuFAQ);
}

public static void validateBootsSearchBarWithValidData() throws InterruptedException, AWTException
{
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.textboxSearch).sendKeys("Mar");
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.selectAutopopupsearchtext);
	CommonMethods.Mousemove(WebElements.buttonCloseSearchAuto).click();
}

public static void validateBootsSearchJobsButtonClick() throws InterruptedException, AWTException
{
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.buttonSearchJobs).click();
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.buttonIWantToWorkForBoots);
	CommonMethods.NewtabFunction(WebElements.buttonIWantToWorkForBoots);
}

}
