package web.stepdefinitions.ui;

import io.cucumber.java.en.When;
import pages.FlightSeatsPage;

public class FlightSeatsStepDef {

    private final FlightSeatsPage flightSeatsPage = new FlightSeatsPage();

    @When("I choose the seats for 2 flights")
    public void iChooseTheAvailableSeats() throws InterruptedException {
        flightSeatsPage.selectAvailableSeatsFor2flights();
    }
}
