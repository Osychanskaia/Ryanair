package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

import static core.driver.DriverFactory.getDriver;
import static core.globalvalues.GlobalValues.defaultTimeout;
import static org.testng.Assert.fail;

public class Waiters {

    public static WebElement waitAppearanceOf(By by) {
        try {
            return waitForExpectedCondition(ExpectedConditions.visibilityOfElementLocated(by), defaultTimeout).findElement(by);
        } catch (Exception e) {
            String errorMessage = "Element " + by + " wasn't appeared in " + defaultTimeout + " seconds!";
            fail(errorMessage);
        }
        return getDriver().findElement(by);
    }

    public static WebElement waitAppearanceOf(int timeout, WebElement element) {
        try {
            return waitForExpectedCondition(ExpectedConditions.visibilityOf(element), timeout);
        } catch (Exception e) {
            String errorMessage = "Element " + element + " wasn't appeared in " + timeout + " seconds!";
            fail(errorMessage);
        }
        return element;
    }

    private static <T> T waitForExpectedCondition(ExpectedCondition<T> condition, int limit) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(limit))
                .withTimeout(Duration.ofSeconds(limit))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class)
                .until(condition);
    }

    public static boolean isElementAppeared(int waitSeconds, WebElement webElement) {
        return Objects.nonNull(softWaitAppearanceOf(waitSeconds, webElement));
    }

    public static WebElement softWaitAppearanceOf(int limit, WebElement we) {
        try {
            return waitAppearanceOf(limit, we);
        } catch (AssertionError e) {
            return null;
        }
    }
}
