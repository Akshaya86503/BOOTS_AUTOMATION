package com.qa.Pages;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.Base.BasePage;
public class OurStories extends BasePage
{
	
//Method to validate various stories displayed on page
public void ValidateOurStorySection() throws InterruptedException, AWTException
{
	for(int i=3;i<7;i++)
	{
	Thread.sleep(4000);
	WebElement Storytext = driver.findElement(By.xpath("//div[@class='category-wrapper']/div["+i+"]"));
	Storytext.click();
	}
	}
	}

