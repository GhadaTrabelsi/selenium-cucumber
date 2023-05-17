package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
	
    public  WebDriverWait wait;

    
	 @FindBy(how = How.CSS, using = "#menu_button_container .bm-burger-button")		
	    public static WebElement btnBurger;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Logout")
	    public static WebElement btnLogout;
	 
	 @FindBy(how = How.XPATH, using = "//div[@class='login_logo']") 
		public static WebElement titlePageDecnx;
}

