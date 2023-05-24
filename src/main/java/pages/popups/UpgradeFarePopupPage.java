package pages.popups;

import pages.CommonPage;

public class UpgradeFarePopupPage extends CommonPage {

    private static final String CONTINUE_TO_VALUE_FARE_POPUP_BUTTON = "//button[text()='Continue with Value fare']";

    public void clickContinueToValueFarePopupButton() {
        findBy(CONTINUE_TO_VALUE_FARE_POPUP_BUTTON).click();
    }
}
