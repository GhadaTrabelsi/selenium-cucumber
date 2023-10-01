package com.e2etests.automation.page_objects;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AboutPage {
	
    public  WebDriverWait wait;

	public ConfigFileReader configFileReader;

	 @FindBy(how = How.ID, using = "about_sidebar_link")		
	    public static WebElement btnAbout;
	 
	 
	 public AboutPage() {

		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
		wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));

	}
 
 
 
 public void clickOnAbout() {
	 btnAbout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_sidebar_link")));

	 btnAbout.click();
	}
 

	
	
}
