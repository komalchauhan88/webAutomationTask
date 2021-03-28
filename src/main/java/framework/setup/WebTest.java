package framework.setup;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;


import drivers.DriverFactory;
import org.testng.ITestContext;

public class WebTest {

    protected WebDriver driver;

    @BeforeClass
    public void setup(ITestContext test) {

        DriverFactory.initiateDriver(test.getCurrentXmlTest().getParameter(
                "browser"));
        driver = DriverFactory.getDriver();
    }

    @AfterClass
    public void tearDown() {

        DriverFactory.quitDriver();
    }

}
