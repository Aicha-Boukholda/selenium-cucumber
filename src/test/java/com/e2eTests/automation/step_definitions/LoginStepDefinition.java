package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	public LoginPage loginpage;
	public LoginStepDefinition()
	{
		loginpage= new LoginPage();
	}
	
	@Given("Je visite le site nopcommerce")
	public void jeVisiteLeSiteNopcommerce() {
		Setup.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
				
		
	    
	}
	@When("Je saisis l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String Email) {
		LoginPage.getEmail().sendKeys(Email);
	    
	}
	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {
		LoginPage.getPassword().sendKeys(password);
	}
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		LoginPage.getBtnLogin().click();
	    
	}
	@Then("je me redirige vers la page de home (string)")
	public void jeMeRedirigeVersLaPageDeHome(String text) {
	    
	}




}
