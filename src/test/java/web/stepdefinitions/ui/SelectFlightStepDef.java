package web.stepdefinitions.ui;

import enums.TitlesEnum;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.SelectFlightPage;

public class SelectFlightStepDef {

    private final SelectFlightPage selectFlightPage = new SelectFlightPage();

    @When("I select the flights")
    public void iSelectTheFlight() {
        selectFlightPage.selectOutboundFlight();
        selectFlightPage.selectInboundFlight();
    }

    @And("I continue with Value fare")
    public void iContinueWithValueFare() {
        selectFlightPage.selectValueFare();
    }

    @And("I click Login later on Select flight page")
    public void iClickLoginLater() {
        selectFlightPage.clickLoginLater();
    }

    @And("I fill data for one passenger with {string} title, {string} first name and {string} last name")
    public void iFillDataForOnePassenger(String title, String firstName, String lastName) {
        selectFlightPage.fillPassengerData(TitlesEnum.valueOf(title).getTitleName(), firstName, lastName);
    }
}
