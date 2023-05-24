package web.stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.CommonPage;

import static core.driver.DriverFactory.getDriver;

public class CommonStepDef {

    private final CommonPage commonPage = new CommonPage();

    @Given("I navigate to Ryanair start page")
    public void iNavigateToStartPage() {
        getDriver().manage().window().maximize();
        getDriver().get("https://www.ryanair.com/ie/en/");
    }

    @And("I click Continue button")
    public void iClickContinue() throws InterruptedException {
        Thread.sleep(2000);
        commonPage.clickContinueButton();
    }
}
