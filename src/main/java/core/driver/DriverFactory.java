package core.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static core.globalvalues.GlobalValues.defaultTimeout;

public class DriverFactory {

    private static final ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
    private static final Logger log = LogManager.getLogger(DriverFactory.class);

    public static WebDriver getDriver() {
        return drivers.get();
    }

    public static void startDriver() {
        if(drivers.get() == null) {
            createDriver();
        }
    }

    private static void createDriver() {
        log.info("Start driver method started....");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(defaultTimeout * 4));
        addDriver(driver);
        log.info("Start driver method finished....");
    }

    public static void addDriver(WebDriver driver) {
        log.info("Created driver added to the list of drivers");
        drivers.set(driver);
    }

    public static void stopDriver() {
        if (drivers.get() != null) {
            log.info("Driver isn't null. Stopping it...");

            log.info("Next method: quit()");
            try {
                drivers.get().quit();
            } catch (WebDriverException ignore) {
                log.error("Chrome wasn't quit!");
            }
            log.info("Next method: drivers.remove");
            drivers.remove();
            log.info("Driver has been stopped and removed!");
        } else {
            log.info("Driver is null!");
        }
    }
}
