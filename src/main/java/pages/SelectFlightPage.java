package pages;

import static java.lang.String.format;

public class SelectFlightPage extends CommonPage {

    private static final String SELECT_OUTBOUND_FLIGHT = "//journey-container[@data-ref='outbound']//button[text()=' Select ']";
    private static final String SELECT_INBOUND_FLIGHT = "//journey-container[@data-ref='inbound']//button[text()=' Select ']";
    private static final String VALUE_FARE = "//div[@data-e2e='fare-card--standard']//button";
    private static final String LOGIN_LATER = "//span[text()='Log in later']";
    private static String TITLE = "//button[contains(@class,'dropdown__toggle')]";
    private static String TITLE_VALUE = "//div[@class='dropdown-item__content']//div[text()=' %s ']";
    private static String FIRST_NAME = "//input[@autocomplete='given-name']";
    private static String LAST_NAME = "//input[@autocomplete='family-name']";
    private static final String CONTINUE_BUTTON = "//button[text()=' Continue ']";

    public void selectOutboundFlight() {
        findBy(SELECT_OUTBOUND_FLIGHT).click();
    }

    public void selectInboundFlight() {
        findBy(SELECT_INBOUND_FLIGHT).click();
    }

    public void selectValueFare() {
        findBy(VALUE_FARE).click();
    }

    public void clickLoginLater() {
        findBy(LOGIN_LATER).click();
    }

    public void selectTitle(final String value) {
        findBy(TITLE).click();
        findBy(format(TITLE_VALUE, value)).click();
    }

    public void fillFirstName(final String firstName) {
        findBy(FIRST_NAME).sendKeys(firstName);
    }

    public void fillLastName(final String lastName) {
        findBy(LAST_NAME).sendKeys(lastName);
    }

    public void fillPassengerData(final String title, final String firstName, final String lastName) {
        selectTitle(title);
        fillFirstName(firstName);
        fillLastName(lastName);
    }
}

