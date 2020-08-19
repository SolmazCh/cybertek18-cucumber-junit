package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleStepDefinitions {

    //creating the page object
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();


    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle =Driver.getDriver().getTitle();
        String expectedTitle = "Google";


       // Assert.assertTrue("Actual title does not match expected title!", actualTitle.equals(expectedTitle));
        Assert.assertEquals("Actual title does not match expected title!",actualTitle,expectedTitle);
    }



    @When("User searches {string}")
    public void userSearches(String searchValue) {

        //sending value into search box using page object
        googleSearchPage.searchBox.sendKeys(searchValue+ Keys.ENTER);


    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchValue) {
        String expectedTitle =searchValue+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Then("User should see About link")
    public void userShouldSeeAboutLink() {
        //asserting that about link is displayed
        Assert.assertTrue(googleSearchPage.aboutLink.isDisplayed());
    }

    @And("User clicks to About link")
    public void userClicksToAboutLink() {
        //clicking to about link
        googleSearchPage.aboutLink.click();
    }

    @Then("User should see title Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {

        String expectedTitle = "Google - About Google, Our Culture & Company News";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Then("User should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List<String> linkStrings) {

        int expectedSize =linkStrings.size();
        int actualSize = googleSearchPage.footerLinks.size();

        System.out.println("linkStrings = " + linkStrings);

        Assert.assertEquals(actualSize,expectedSize);
    }

}
