package web.stepdefinitions.ui;

import enums.CountriesEnum;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageStepDef {

    private final HomePage homePage = new HomePage();

    @Given("I search for a return flight from {string} to {string} on available dates for 1 adult")
    public void iSearchForOneWayFlight(String departure, String destination) {
        homePage.performSearch(CountriesEnum.valueOf(departure).getCountryName(), CountriesEnum.valueOf(departure).getAirportName(),
                CountriesEnum.valueOf(destination).getCountryName(), CountriesEnum.valueOf(destination).getAirportName());
    }
}
