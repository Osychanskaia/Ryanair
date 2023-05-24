package web.stepdefinitions.ui.popups;

import io.cucumber.java.en.And;
import pages.popups.UpgradeFarePopupPage;

public class UpgradeFarePopupStepDef {

    private final UpgradeFarePopupPage upgradeFarePopupPage = new UpgradeFarePopupPage();

    @And("I continue with Value fare on upgrade popup")
    public void iContinueWithValueFareOnPopup() {
        upgradeFarePopupPage.clickContinueToValueFarePopupButton();
    }
}
