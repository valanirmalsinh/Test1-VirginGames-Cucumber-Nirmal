package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    @Given("^I am on the  homepage$")
    public void iAmOnTheHomepage() {

    }
    @And("^I accept cookie on homepage$")
    public void iAcceptCookieOnHomepage() {
        new HomePage().acceptCookie();
    }

    @When("^I click on \"([^\"]*)\" link$")
    public void iClickOnLink(String arg0) {
        new HomePage().clickOnLoginTab();
    }


    @Then("^I should navigate to verify page successfully$")
    public void iShouldNavigateToVerifyPageSuccessfully() {
        Assert.assertEquals("Pardon Our Interruption",new HomePage().getVerifyPageText());
    }


}
