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

public class LogoutPage {
	
    public  WebDriverWait wait;

	public ConfigFileReader configFileReader;

	 @FindBy(how = How.CSS, using = "#menu_button_container .bm-burger-button")		
	    public static WebElement btnBurger;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Logout")
	    public static WebElement btnLogout;
	 
	 @FindBy(how = How.XPATH, using = "//div[@class='login_logo']") 
		public static WebElement titlePageDecnx;
	 
	 
	 
	 
	 
	 public LogoutPage() {
			PageFactory.initElements(Setup.getDriver(), this);
			configFileReader = new ConfigFileReader();
			wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		}
	 
	 
	 
	 public void clickOnBurger() {
		 btnBurger.click();
		}
	 
	 public void clickOnLogout() {
			 btnLogout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));

		 btnLogout.click();
		}
	 
	 
	 
	 
	 
}



