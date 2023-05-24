package pages.popups;

import pages.CommonPage;

public class FastTrackPopupPage extends CommonPage {

    private static final String NO_THANKS_BUTTON = "//button[text()=' No, thanks ']";

    public void skipFastTrack() {
        findBy(NO_THANKS_BUTTON).click();
    }
}
