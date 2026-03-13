package com.qa.stepdefinitions;

import com.qa.driver.DriverFactory;
import com.qa.pages.LoginPage;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user is on login page")
    public void user_is_on_login_page() {

    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {

        loginPage.enterUsername(username);

    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {

        loginPage.enterPassword(password);

    }

    @When("user clicks login")
    public void user_clicks_login() {

        loginPage.clickLogin();

    }

    @Then("user should be redirected to inventory page")
    public void userShouldBeRedirectedToInventoryPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}