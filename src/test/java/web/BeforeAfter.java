package web;


import io.cucumber.java.After;
import io.cucumber.java.Before;

import static core.driver.DriverFactory.startDriver;
import static core.driver.DriverFactory.stopDriver;

public class BeforeAfter {

    @Before
    public void setUp() {
        startDriver();
    }

    @After
    public void tearDown() {
        stopDriver();
    }
}
