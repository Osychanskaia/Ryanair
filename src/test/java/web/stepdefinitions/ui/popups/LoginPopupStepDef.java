package web.stepdefinitions.ui.popups;

import io.cucumber.java.en.And;
import pages.popups.LoginPopupPage;
import core.Waiters;

import static core.globalvalues.GlobalValues.smallWait;
import static web.commonstepdefinitions.SoftAssertionsStepDef.softly;

public class LoginPopupStepDef {

    private final LoginPopupPage loginPopupPage = new LoginPopupPage();

    @And("Login popup shows up")
    public void verifyLoginPopupAppeared() {
        boolean isPopupDisplayed = Waiters.isElementAppeared(smallWait, loginPopupPage.getLoginPopup());
        softly.assertTrue(isPopupDisplayed, "Login Popup is not displayed");
    }
}
