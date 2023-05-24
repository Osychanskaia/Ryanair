package web;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {"pretty", "json:target/json_repot.json"},
        glue = {"web"},
        features = "src/test/resources/scenarios",
        tags = "@Login_Popup")
public class TestRunner extends AbstractTestNGCucumberTests {

}
