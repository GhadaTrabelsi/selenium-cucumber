package com.e2etests.automation.step_definitions;

import org.json.simple.JSONObject;
import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	private SeleniumUtils seleniumUtils;

	public LoginStepDefinition() {
		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
	}

	@Given("Je me connecte à l application Swag Labs")
	public void jeMeConnecteALApplication() {
		loginPage.login();
	}
	

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String title) throws InterruptedException {
		String title_page = LoginPage.titlePage.getText();
		Assert.assertEquals(title_page, title);
	}
	


	@Given("Je me connecte à l application Swag Labs avec non correct coordonnes")
	public void jeMeConnecteÀLApplicationSwagLabsAvecNonCorrectCoordonnes() {
		loginPage.loginNp();
		
	}



	@Then("Le message d erreur s affiche {string}")
	public void leMessageDErreurSAffiche(String msg) throws InterruptedException {
		
	    String msgError = LoginPage.msgError.getText();
		Assert.assertEquals(msgError, msg);
	}
	



	/* Login Outline */
	@Given("Je me connecte sur l application")
	public void jeMeConnecteSurLApplication() {
		loginPage.connectToApp();
	}

	@When("Je saisi le username {string}")
	public void jeSaisiLeUsername(String username) {
		loginPage.fillUsername(username);
	}

	@When("Je saisi le password {string}")
	public void jeSaisiLePassword(String password) throws InterruptedException {
		//loginPage.fillPassword(password);
		seleniumUtils.writeText(LoginPage.password, password);
		
//		JSONObject waitTimes = seleniumUtils.JsonData(0); // 0 car il semble que vous ayez un tableau JSON d'objets
//		long mediumWait = Long.parseLong(waitTimes.get("MediumWait").toString());
//
//		// Utilisez mediumWait dans vos méthodes de sommeil Thread.sleep()
//		try {
//		    Thread.sleep(mediumWait);
//		} catch (InterruptedException e) {
//		    e.printStackTrace();
//		}
		long mediumWait = seleniumUtils.getWait("MediumWait");
		Thread.sleep(mediumWait);
	}

	
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPage.clickOnLogin();
	}

}
