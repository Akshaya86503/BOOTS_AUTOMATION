package com.qa.CommonFunctions;
import java.awt.AWTException;

import com.qa.Base.BasePage;

public class ValidateHeader extends BasePage
{
	
//Method to validate client logo
public static void validateBootsLogo() throws InterruptedException, AWTException
{
	//Accept cookies
	Thread.sleep(4000);
	WebElements.buttonAcceptCookies.click();
	//validate logo
	CommonMethods.NewtabFunction(WebElements.imgClientLogo);
	
}

//Method to validate header menu bar
public static void validateBootsMenuBar() throws InterruptedException, AWTException
{
	//1) Home menu
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.menubarHome);
	
	//2) Career areas
	Thread.sleep(4000);
	CommonMethods.Mousemove(WebElements.menuCareerAreas);
	
	//Career areas - pharmacy 
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.carrerPharmacy);

	/*Career areas - retail
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.carrerRetail);*/
	
	/*Career areas - opticians
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.carrerOpticians);*/
	
	/*Career areas - seasonal - Airport
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.carrerSeasonalAirport);*/
	
	/*Career areas - ireland
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.carrerIreland);*/
	
	/*Career areas - supply chain
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.carrerSupplyChain);*/
	
	/*Career areas - support office
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.carrerSupportOffice);*/
	
	//Career areas - view all stories button click
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.buttonViewAllStoriesFromCarrerAreasMenu);
	
	//Early carrer menu
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.menuEarlyCareer);
	
	/*Our stories menu
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.menuOurStories);*/
	
	//FAQs menu
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.menuFAQ);
}

//Method to validate search bar functionality
public static void validateBootsSearchBarWithValidData() throws InterruptedException, AWTException
{
	Thread.sleep(4000);
    WebElements.textboxSearch.sendKeys("Mar");
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.selectAutopopupsearchtext);
	WebElements.buttonCloseSearchAuto.click();
}

//Method to validate search jobs navigation
public static void validateBootsSearchJobsButtonClick() throws InterruptedException, AWTException
{
	Thread.sleep(4000);
	WebElements.buttonSearchJobs1.click();
	Thread.sleep(4000);
	CommonMethods.NewtabFunction(WebElements.buttonIWantToWorkForBoots1);
}

}
