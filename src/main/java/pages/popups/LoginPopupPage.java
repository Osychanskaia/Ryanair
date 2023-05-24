package pages.popups;

import org.openqa.selenium.WebElement;
import pages.CommonPage;

public class LoginPopupPage extends CommonPage {

    private static final String LOGIN_POPUP = "//*[@class='auth-popup']";

    public WebElement getLoginPopup() {
        return findBy(LOGIN_POPUP);
    }
}
