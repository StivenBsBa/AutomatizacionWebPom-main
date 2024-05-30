package com.unac.stepsdefinitions;

import com.unac.pages.AccountOverviewPage;
import com.unac.pages.LoginPage;
import com.unac.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepsDefinitions {

    RegisterPage registerPage;
    AccountOverviewPage accountOverviewPage;
    LoginPage loginPage;

    @Given("quiero navegar a la página de registro de Parabank")
    public void navigateToRegistrationPage() {
        loginPage.open();
        loginPage.clickRegisterLink();
    }

    @When("y quiero Registrar una nueva cuenta con los siguientes datos {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void registerNewAccount(String firstName, String lastName, String addressStreet, String addressCity,
                                   String addressState, String addressZipCode, String phoneNumber, String ssn,
                                   String username, String password) {
        registerPage.register(firstName, lastName, addressStreet, addressCity, addressState, addressZipCode,
                phoneNumber, ssn, username, password);
    }

    @Then("Verifico que la cuenta con el número {string} existe en el resumen de la cuenta")
    public void verifyAccountExists(String accountNumber) {
        accountOverviewPage.goToAccountsOverview();
    }
}
