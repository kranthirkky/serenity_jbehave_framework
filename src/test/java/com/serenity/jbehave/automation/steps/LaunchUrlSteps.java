package com.serenity.jbehave.automation.steps;

import com.serenity.jbehave.automation.pages.LaunchUrlPage;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class LaunchUrlSteps {

    @Steps
    LaunchUrlPage launchUrlPage;

    @Given("user launches the url")
    public void setLaunchUrlPage(){
        launchUrlPage.launchUrlInChrome();
    }

    @Then("user verifies the webpage")
    public void verifyWebPageResults(){
        launchUrlPage.verifyPageResults();
    }
}
