package web.commonstepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;


public class SoftAssertionsStepDef {

    public static SoftAssert softly;

    @Then("I assert all verifications at once")
    public void iAssertAllVerificationAtOnce() {
        softly.assertAll();
    }

    @And("I'm gonna use soft assertions")
    public void iMGonnaUseSoftAssertions() {
        softly = new SoftAssert();
    }
}
