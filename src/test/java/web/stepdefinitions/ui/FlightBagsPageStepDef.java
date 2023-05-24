package web.stepdefinitions.ui;

import io.cucumber.java.en.And;
import pages.FlightBagsPage;

public class FlightBagsPageStepDef {

    private final FlightBagsPage flightBagsPage = new FlightBagsPage();

    @And("I choose 20kg check-in bag")
    public void iChoose20kgCheckInBag() {
        flightBagsPage.add20KGBag();
    }

    @And("I choose 1 small cabin bag")
    public void iChooseSmallCabinBag() {
        flightBagsPage.selectSmallBagOnly();
    }

}
