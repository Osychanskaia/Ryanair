package pages;

import static java.lang.String.format;

public class HomePage extends CommonPage {

    private static final String YES_I_AGREE_POPUP_BUTTON = "//button[text()='Yes, I agree']";
    private static final String DEPARTURE_INPUT = "//input[@placeholder='Departure']";
    private static final String DESTINATION_INPUT = "//input[@placeholder='Destination']";
    private static final String COUNTRY = "//fsw-countries//div//span[text()=' %s ']";
    private static final String AIRPORT = "//fsw-airport-item//span[text()=' %s ']";
    private static final String SEARCH_BUTTON = "//button//span[text()='Search']";
    private static final String DEPARTURE_DATE = "(//calendar[2]//div[@class='calendar-body__cell'])[5]";

    private static final String RETURN_DATE = "(//calendar[2]//div[@class='calendar-body__cell'])[10]";

    public void clickYesIAgreePopupButton() {
        findBy(YES_I_AGREE_POPUP_BUTTON).click();
    }

    public void clickDeparture() {
        findBy(DEPARTURE_INPUT).click();
    }

    public void clickDestinationInput() {
        findBy(DESTINATION_INPUT).click();
    }

    public void setCountry(final String country) {
        findBy(format(COUNTRY, country)).click();
    }

    public void setAirport(final String airport) {
        findBy(format(AIRPORT, airport)).click();
    }

    public void chooseAvailableDepartureDate() {
        findBy(DEPARTURE_DATE).click();
    }

    public void chooseAvailableReturnDate() {
        findBy(RETURN_DATE).click();
    }

    public void clickSearchButton() {
        findBy(SEARCH_BUTTON).click();
    }

    public void performSearch(final String departureCountry, final String departureAirport,
            final String destinationCountry, final String destinationAirport) {
        clickYesIAgreePopupButton();
        clickDeparture();
        setCountry(departureCountry);
        setAirport(departureAirport);
        setCountry(destinationCountry);
        setAirport(destinationAirport);
        chooseAvailableDepartureDate();
        chooseAvailableReturnDate();
        clickSearchButton();
    }
}
