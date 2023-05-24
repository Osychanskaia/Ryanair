package pages;

import core.Waiters;

import static core.globalvalues.GlobalValues.defaultTimeout;

public class ExtrasPage extends CommonPage {

    private static final String FAST_TRACK_BLOCK = "//*[@id='fast-main-card']";
    private static final String TRANSFER_CARD_BLOCK = "//div[@class='transfer-card']";

    public void waitForFastTrackPageLoaded() {
        Waiters.waitAppearanceOf(defaultTimeout, findBy(FAST_TRACK_BLOCK));
    }

    public void waitForTransferCardPageLoaded() {
        Waiters.waitAppearanceOf(defaultTimeout, findBy(TRANSFER_CARD_BLOCK));
    }
}
