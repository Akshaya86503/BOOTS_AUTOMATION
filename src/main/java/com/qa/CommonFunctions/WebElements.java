package com.qa.CommonFunctions;
import java.io.FileNotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.BasePage;

public class WebElements extends BasePage
{
	//Client Logo
	@FindBy(xpath="//img[contains(@title,'Boots Logo')]")
	public static WebElement imgClientLogo;
	
	//Accept cookies
	@FindBy(xpath="//button[@title='Accept Cookies']")
	public static WebElement buttonAcceptCookies;
	
	//Home menu
	@FindBy(xpath="//a[text()='Home']")
	public static WebElement menubarHome;
	
	//Early careers menu
	@FindBy(xpath="//a[@title='Early Careers']")
	public static WebElement menuEarlyCareer;
	
	//Our stories menu
	@FindBy(xpath="//a[@title='Our Stories']")
	public static WebElement menuOurStories;
	
	//FAQ menu
	@FindBy(xpath="//a[@title='FAQs']")
	public static WebElement menuFAQ;
	
	//Career areas menu
	@FindBy(xpath="//a[@title='Career Areas']")
	public static WebElement menuCareerAreas;
	
	//Career areas - pharmacy
	@FindBy(xpath="//a[@title='Pharmacy']")
	public static WebElement carrerPharmacy;
	
	//Career areas - pharmacist
	@FindBy(xpath="//a[@href='https://www.boots.jobs/pharmacy/pharmacist/']")
	public static WebElement careerPharmacist;
	
	//Career areas - Retail
	@FindBy(xpath="//a[@href='https://www.boots.jobs/retail/']")
	public static WebElement carrerRetail;
	
	//Career areas - Ireland
	@FindBy(xpath="//a[@href='https://www.boots.jobs/ireland/']")
	public static WebElement carrerIreland;
	
	//Career areas - Supply chain
	@FindBy(xpath="//a[@href='https://www.boots.jobs/supply-chain/']")
	public static WebElement carrerSupplyChain;
	
	//Career areas - Support Office
	@FindBy(xpath="//a[@href='https://www.boots.jobs/support-office/']")
	public static WebElement carrerSupportOffice;
	
	//Career areas - Seasonal - Airport
	@FindBy(xpath="//a[@href='https://www.boots.jobs/retail/airport-opportunities/']")
	public static WebElement carrerSeasonalAirport;
	
	//Career areas - Opticians
	@FindBy(xpath="//a[@href='https://www.boots.jobs/opticians/']")
	public static WebElement carrerOpticians;
	
	//Search text box
	@FindBy(xpath="//input[@type='search']")
	public static WebElement textboxSearch;
	
	//Select autopoup search
	@FindBy(xpath="//*[@id='mCSBap_1_container']/div/div[1]/div[1]/h3/a/span")
	public static WebElement selectAutopopupsearchtext;
	
	//Close button from Search textbox
	@FindBy(xpath="//div[@class='proclose']")
	public static WebElement buttonCloseSearchAuto;
	
	//Searchjobs button on Header
	@FindBy(xpath="//a[text()='Search jobs']")
	public static WebElement buttonSearchJobs;
	
	//Option 1 from search jobs dropdown
	@FindBy(xpath="//a[@title='I want to work for Boots']")
	public static WebElement buttonIWantToWorkForBoots;
	
	//View all stories button from Carrer areas menu
	@FindBy(xpath="//a[@href='https://www.boots.jobs/our-stories']")
	public static WebElement buttonViewAllStoriesFromCarrerAreasMenu;
	
	//Share icon from footer
	@FindBy(xpath="//div[@class='share-top-wrapper']/img")
	public static WebElement imgFooterSocialShareIcon;
	
	//Share via Twitter link from footer
	@FindBy(xpath="//img[@title='Share via Twitter']")
	public static WebElement linkFooterSocialTwitter;
	
	//Share via Linked In link from footer
	@FindBy(xpath="//img[@title='Share via LinkedIn']")
	public static WebElement linkFooterSocialLinkedIn;
	
	//Share via Facebook from footer
	@FindBy(xpath="//img[@title='Share via Facebook']")
	public static WebElement linkFooterSocialFacebook;
	
	//Share via Email from footer
	@FindBy(xpath="//img[@title='Share via Email']")
	public static WebElement linkFooterSocialEmail;
	
	//Accessiblity link from footer
	@FindBy(xpath="//a[@title='Accessibility']")
	public static WebElement linkFooterAccessibility;
	
	//Sitemap link from footer
	@FindBy(xpath="//a[@title='Sitemap']")
	public static WebElement linkFooterSitemap;
	
	//Privacy statement link from footer
	@FindBy(xpath="//a[@title='Privacy Statement']")
	public static WebElement linkFooterPrivacyStatement;
	
	//Cookie policy link from footer
	@FindBy(xpath="//a[@title='Cookie policy']")
	public static WebElement linkFooterCookiePolicy;
	
	//Facebook link from footer
	@FindBy(xpath="//div[@class='Social']/ul/li/a[@title='Facebook']")
	public static WebElement linkFooterFacebook;
	
	
	//Twitter link from footer
	@FindBy(xpath="//div[@class='Social']/ul/li/a[@title='Twitter']")
	public static WebElement linkFooterTwitter;
	
	//Twitter link from footer
	@FindBy(xpath="//div[@class='Social']/ul/li/a[@title='Instagram']")
	public static WebElement linkFooterInstagram;
	
	//Twitter link from footer
	@FindBy(xpath="//div[@class='Social']/ul/li/a[@title='LinkedIn']")
	public static WebElement linkFooterLinkedIn;
	
	//boots-uk.com link from footer
	@FindBy(xpath="//a[@title='boots-uk.com']")
	public static WebElement linkFooterbootsukcom;
	
	//Boots CSR link from footer
	@FindBy(xpath="//a[@title='Boots CSR']")
	public static WebElement linkFooterBootsCSR;
	
	//Boots.com link from footer
	@FindBy(xpath="//a[@title='Boots.com']")
	public static WebElement linkFooterBootscom;
	
	//Contact Us link from footer
	@FindBy(xpath="//a[@title='Contact Us']")
	public static WebElement linkFooterContactUs;
	
//  -----------------------------------------------------------------------	
	//Early carrers - Banner image
	@FindBy(xpath="//img[@title='Banner']")
	//@FindBy(xpath="//img[@src='https://www.boots.jobs/wp-content/uploads/2019/11/early-careers-header.jpg']")
	public static WebElement imgBannerImage;
	
	//Early carrers - Banner image click - I want to work for boots
	@FindBy(xpath="//div[@class='sj-button-wrapper']/a[1]")
	public static WebElement linkBannerImageIWantToWorkForBoots;
	
	//Early carrers - Banner image click - I already work for boots
	@FindBy(xpath="//div[@class='sj-button-wrapper']/a[2]")
	public static WebElement linkBannerImageIAlreadyWorkForBoots;
	
    //Close icon of image banner 
	@FindBy(xpath="//div[@class='search-jobs-overlay active']/a[text()='Close']")
	public static WebElement buttonImageBannerClose;
	
	//Single story selection
	@FindBy(xpath="//img[@title='Future Leaders Apprenticeship']")
	public static WebElement imgSingleStorySelection;
	
	//Early carrer twitter links - reply icon 
	@FindBy(xpath="//a[@href='https://twitter.com/intent/tweet?in_reply_to=1264176786390294529']")
	public static WebElement iconTwitterReply;
	
	//Early carrer twitter links - retweet icon 
	@FindBy(xpath="//a[@href='https://twitter.com/intent/retweet?tweet_id=1264176786390294529']")
	public static WebElement iconTwitterRetweet;
	
	//Early carrer twitter links - fav icon 
	@FindBy(xpath="//a[@href='https://twitter.com/intent/favorite?tweet_id=1264176786390294529']")
	public static WebElement iconTwitterFav;	
	
//  -----------------------------------------------------------------------		
	
	//View latest roles section
	@FindBy(xpath="//a[@class='btn search-jobs-cta inside-button'and @title='View Latest Roles']")
	public static WebElement buttonViewLatestRolesSection;
	
	//View latest roles seciton submenus selection
	@FindBy(xpath="//a[@class='btn search-jobs-cta inside-button']/following::a[1]")
	public static WebElement buttonViewLatestRolesSubitems;
	
//  --------------------------------------------------------------------------
	
	//View latest jobs selection
	@FindBy(xpath="//h4[text()='Latest Jobs']/following::span[@class='role'][1]")
	public static WebElement buttonLatestJobsSelection;
	
	//Explore button click
	@FindBy(xpath="//a[@title='Explore']")
	public static WebElement buttonExplore;
			
//  --------------------------------------------------------------------------
	
	//book a call back
	@FindBy(xpath="//span[text()='Book a call back']")
	public static WebElement buttonBookaCallBack;
	
    //First name
	@FindBy(xpath="//input[@id='first-name']")
	public static WebElement textboxFirstName;
  
   // Last name
	@FindBy(xpath="//input[@id='last-name']")
	public static WebElement textboxLastName;
   
	//Email
	@FindBy(xpath="//input[@id='email']")
	public static WebElement textboxEmail;
	
	//Confirm email
	@FindBy(xpath="//input[@id='confemail']")
	public static WebElement textboxConfirmEmail;
	
	//phone number
	@FindBy(xpath="//input[@id='phone-number']")
	public static WebElement textboxPhoneNumber;
	
	//Currunt job
	@FindBy(xpath="//input[@id='job-role']")
	public static WebElement textboxCurruntJob;
	
	//preferred role
	@FindBy(xpath="//div[@id='department']")
	public static WebElement drpPreferredRole;
	
	//preferred location
	@FindBy(xpath="//div[@id='location']")
	public static WebElement drpPreferredLocation;
	
	//Call back today day
	@FindBy(xpath="//div[@id='day']")
	public static WebElement drpCallBackToday;
	
	//Call back time
	@FindBy(xpath="//div[@id='time']")
	public static WebElement drpCallBackTime;
	
	//Captcha selection
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	public static WebElement chkCaptchaSelection;
	
	//button submit
	@FindBy(xpath="//button[@value='Submit details']")
	public static WebElement buttonSubmit;
	
//  --------------------------------------------------------------------------
	
	//All locations
	@FindBy(xpath="//span[@class='navy-blue-t drop']")
	public static WebElement drpAllLocations;
	
	//location name
	@FindBy(xpath="//div[@class='location-container drop-locations']/div/ul/li/span[text()='Midlands']")
	public static WebElement txtLocationName;
	
	//View jobs button
	@FindBy(xpath="//div[@title='View jobs']")
	public static WebElement buttonViewJobs;
		
//  --------------------------------------------------------------------------
	
	//Our stories page
	//Back to top button
	@FindBy(xpath="//div[@class='arrow']")
	public static WebElement buttonBackToTop;
			
	//--------------------------------------------------------------------------
	
	//Home page
	//Home page banner image
	@FindBy(xpath="//img[@class='desktop-ph']")
	public static WebElement imgHomepageBannerImage;
	
	//View all stories button from View story section of homepage
	@FindBy(xpath="//a[@class='button white navy-blue-t']/span[text()='View all stories']")
	public static WebElement buttonViewStory;
	
	//First image slider option click
	@FindBy(xpath="//div[@class='slider-container']/div/span[1]")
	public static WebElement imgFisrtSlideClick;
				
	//--------------------------------------------------------------------------
	
	//object initialization
	public WebElements() throws FileNotFoundException 
	{
		PageFactory.initElements(driver, this);
	}
}
