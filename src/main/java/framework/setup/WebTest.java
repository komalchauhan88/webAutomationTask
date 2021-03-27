package framework.setup;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

import drivers.DriverFactory;

public class WebTest {


    /**
     * The WebDriver driver
     */
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
