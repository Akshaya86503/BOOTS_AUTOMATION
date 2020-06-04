package com.qa.Pages;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.qa.Base.BasePage;
import com.qa.CommonFunctions.CommonMethods;
import com.qa.CommonFunctions.WebElements;


public class HomePage extends BasePage
{
	//Validate our stories slider on home page
	public void ValidateOurStoriesSliderClick()throws InterruptedException, AWTException
	{
		for(int i=2;i<10;i++)
		{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='slider-container']/div/span["+i+"]")).click();
		}
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.imgFisrtSlideClick).click();
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonViewStory);
		CommonMethods.NewtabFunction(WebElements.buttonViewStory);
	}
	
	public void ValidateFollowOurStorySliderClick()throws InterruptedException, AWTException
	{
		/*Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonAcceptCookies).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		for(int i=6;i>0;i--)
		{
		WebElement eng = driver.findElement(By.xpath("/html/body/div[4]/main/section/div[3]/div[3]/div["+i+"]/div[4]/a[1]"));
		Thread.sleep(4000);
		eng.click();
		Thread.sleep(4000);
		}*/
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.buttonAcceptCookies).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(4000);
		WebElement tb = CommonMethods.Mousemove(driver.findElement(By.xpath("/html/body/div[4]/main/section/div[3]/div[3]/div[6]/div[4]/a[1]")));
		Thread.sleep(4000);
		tb.click();
	}
	
	
	public void ValidateHomepageBannerClick() throws InterruptedException, AWTException
	{
		Thread.sleep(4000);
		CommonMethods.Mousemove(WebElements.imgHomepageBannerImage);
		CommonMethods.NewtabFunction(WebElements.imgHomepageBannerImage);
		
	}
	}
		
