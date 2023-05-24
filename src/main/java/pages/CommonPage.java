package pages;

public class CommonPage extends AbstractPage {

    private static final String CONTINUE_BUTTON = "//button[contains(text(),'Continue')]";

    public void clickContinueButton() {
        findBy(CONTINUE_BUTTON).click();
    }
}
