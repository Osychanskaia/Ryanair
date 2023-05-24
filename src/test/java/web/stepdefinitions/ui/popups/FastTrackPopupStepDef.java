package web.stepdefinitions.ui.popups;

import io.cucumber.java.en.When;
import pages.popups.FastTrackPopupPage;

public class FastTrackPopupStepDef {

    private final FastTrackPopupPage fastTrackPopupPage = new FastTrackPopupPage();

    @When("I skip the FastTrack popup")
    public void iSkipFastTrack() {
        fastTrackPopupPage.skipFastTrack();
    }
}
