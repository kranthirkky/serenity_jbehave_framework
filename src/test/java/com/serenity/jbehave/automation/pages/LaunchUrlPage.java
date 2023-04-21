package com.serenity.jbehave.automation.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import java.time.Duration;

public class LaunchUrlPage extends PageObject {

    String facebookUrl = "https://www.facebook.com/";

    @FindBy(xpath = "//input[@name='email']")
    WebElementFacade emailInputTextBox;

    @FindBy(xpath = "//input[@name='pass']")
    WebElementFacade passwordInputTextBox;

    public void launchUrlInChrome() {
        getDriver().get(facebookUrl);
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofMillis(50000));
        System.out.println("INFO!!: Page Title : "+ getDriver().getTitle());
        System.out.println("Printing Url : " + getDriver().getCurrentUrl());
    }

    public void verifyPageResults(){
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofMillis(90000));
        emailInputTextBox.waitUntilVisible().waitUntilClickable().click();
        emailInputTextBox.sendKeys("Automation");
        passwordInputTextBox.waitUntilClickable().click();
        passwordInputTextBox.sendKeys("password");
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
        System.out.println("INFO!!: Test Executed");
    }
}
