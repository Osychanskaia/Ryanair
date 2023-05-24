package pages;

public class FlightBagsPage extends CommonPage {

    private static final String SMALL_BAG_ONLY_RADIO_BUTTON = "//label[contains(@class,'radio-circle-button')]";
    private static final String ADD_20KG_BAG = "//div[@data-ref='counter.counter__increment']";

    public void selectSmallBagOnly() {
        findBy(SMALL_BAG_ONLY_RADIO_BUTTON).click();
    }
    public void add20KGBag() {
        findBy(ADD_20KG_BAG).click();
    }
    public void proceedWith20KGBag() {
        selectSmallBagOnly();
        add20KGBag();
        clickContinueButton();
    }

}
