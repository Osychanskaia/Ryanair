I use Cucumber + Selenium + TestNg, log4j, lombok

Test Runner(TestNg, CucumberOptions) /src/test/java/web/TestRunner.java

Test located /src/test/resources/scenarios/CheckLoginPopupAfterPassingAllBookingSteps.feature

Step definitions /src/test/java/web/stepdefinitions

Pages /src/main/java/pages

Driver /src/main/java/core/driver/DriverFactory.java

for countries and titles I use enums /src/main/java/enums

Report generates to target/json_repot.json

I use chromedriver 113.0(for MacOs in terminal perform the command: "xattr -d com.apple.quarantine chromedriver")
