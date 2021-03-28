package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverClass {

    private WebDriver driver;

    private DriverType selectedDriverType;

    private String browserName = null;

    private DriverConfig config = new DriverConfig();

    private final DriverType defaultDriverType = DriverType.CHROME;

    public DriverClass(String browser) {
        this.browserName = browser;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public DriverClass() {

    }

    public WebDriver getDriver() {
        if (driver == null) {
            selectedDriverType = getDriverType();
            DesiredCapabilities desiredCapabilities = selectedDriverType.getDesiredCapabilities(config);
            instantiateWebDriver(desiredCapabilities);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public void closeDriver() {
        if (!(driver == null)) {
            driver.quit();
        }
    }

    public void quitDriver() {
        driver.quit();
    }

    public DriverConfig getConfig() {
        return config;
    }

    private DriverType getDriverType() {
        DriverType driverType = defaultDriverType;
        try {
            driverType = DriverType.valueOf(browserName);
        } catch (IllegalArgumentException ignored) {
            System.err.println("Unknown driver specified, defaulting to '" + driverType + "'...");
        } catch (NullPointerException ignored) {
            System.err.println("No driver specified, defaulting to '" + driverType + "'...");
        }
        return driverType;
    }

    private void instantiateWebDriver(DesiredCapabilities desiredCapabilities) {

        driver = selectedDriverType.getDriverObject(desiredCapabilities);
    }

}
