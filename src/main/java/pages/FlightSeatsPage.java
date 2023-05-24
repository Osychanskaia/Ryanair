package pages;

public class FlightSeatsPage extends CommonPage {

    private static final String SELECT_SEATS_LATER_OPTION = "//h4[text()=' Option 2: Select seats later ']";
    private static final String CONTINUE_WITHOUT_A_SEAT_BUTTON = "//button[text()=' Continue without a seat ']";
    private static final String NEXT_FLIGHT_BUTTON = "//button[text()=' Next flight ']";
    private static final String SELECT_AVAILABLE_SEAT = "//div[@class='seatmap__seats']/div[contains(@class,'seatmap__')" +
            " and not(contains(@class,'unavailable')) and not(contains(@class,'aisle'))]";

    public void clickSelectSeatsLater() {
        findBy(SELECT_SEATS_LATER_OPTION).click();
    }

    public void clickContinueWithoutSeatButton() {
        findBy(CONTINUE_WITHOUT_A_SEAT_BUTTON).click();
    }

    public void proceedWithoutSeat() {
        clickSelectSeatsLater();
        clickContinueWithoutSeatButton();
    }

    public void clickNextFlightButton() {
        findBy(NEXT_FLIGHT_BUTTON).click();
    }

    public void selectAvailableSeatsFor2flights() throws InterruptedException {
        Thread.sleep(3000);
        findBy(SELECT_AVAILABLE_SEAT).click();
        clickNextFlightButton();
        Thread.sleep(3000);
        findBy(SELECT_AVAILABLE_SEAT).click();
    }
}
