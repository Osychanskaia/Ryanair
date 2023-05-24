package web.stepdefinitions.ui;

import io.cucumber.java.en.And;
import pages.ExtrasPage;

import static web.commonstepdefinitions.SoftAssertionsStepDef.softly;

public class ExtrasPageStepDef {

    private final ExtrasPage extrasPage = new ExtrasPage();

    @And("I wait Fast Track block is displayed")
    public void waitForFastTrackPageLoaded() {
        extrasPage.waitForFastTrackPageLoaded();
    }

    @And("I wait Transfer Card block is displayed")
    public void waitForCarHirePageLoaded() {
        extrasPage.waitForTransferCardPageLoaded();
    }
}
