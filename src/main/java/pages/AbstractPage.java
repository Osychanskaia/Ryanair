package pages;

import core.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class AbstractPage {

    public WebElement findBy(String xpath) {
        By element = By.xpath(xpath);
        return Waiters.waitAppearanceOf(element);
    }
}
