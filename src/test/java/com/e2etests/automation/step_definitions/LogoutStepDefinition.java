package com.e2etests.automation.step_definitions;


import org.junit.Assert;


import com.e2etests.automation.page_objects.LogoutPage;
import com.e2etests.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {

	public LogoutPage logoutPage;
	public ConfigFileReader configFileReader;
	
	
	
	public LogoutStepDefinition() {
		logoutPage = new LogoutPage();
		configFileReader = new ConfigFileReader();
	}
	
	
	@When("Je clique sur le menu burger")
	public void jeCliqueSurLeMenuBurger() {
	
		logoutPage.clickOnBurger();
	}
	
	
	
	@When("Je clique sur logout")
	public void jeCliqueSurLogout() {
		

		logoutPage.clickOnLogout();
	}
	
	@Then("Je me redirige vers la page de la connexion {string}")
	public void jeMeRedirigeVersLaPageDeLaConnexion(String titleDecnx) {
		
		String titlePageDecnx = LogoutPage.titlePageDecnx.getText();
		Assert.assertEquals(titlePageDecnx, titleDecnx);
		
		
		
	}

}
