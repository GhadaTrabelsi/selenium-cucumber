package com.e2etests.automation.step_definitions;


import com.e2etests.automation.page_objects.AboutPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutStepDefinition {

	
	public AboutPage aboutPage;
	public ConfigFileReader configFileReader;
	
	public AboutStepDefinition() {
		aboutPage = new AboutPage();
		configFileReader = new ConfigFileReader();
		
	}

	@When("Je clique sur le bouton about")
	public void jeCliqueSurLeBoutonAbout() {
		aboutPage.clickOnAbout();
		
	    
	}
	@Then("Je me redirige a la page About")
	public void jeMeRedirigeALaPageAbout() {
		
		String currentUrl = Setup.getDriver().getCurrentUrl();
	    assert currentUrl.contains("saucelabs.com");
	 
	}



}
