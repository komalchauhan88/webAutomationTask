package drivers;

import drivers.DriverConfig;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private static ThreadLocal<DriverClass> driverThread = new ThreadLocal<DriverClass>();

    public static void initiateDriver(final String browser) {

        if (driverThread.get() == null) {
            driverThread.set(new DriverClass(browser.toUpperCase()));
        } else {
            driverThread.set(driverThread.get());
        }

    }

    public static synchronized WebDriver getDriver() {

        initiateDriver("chrome");
        return driverThread.get().getDriver();
    }

    public static synchronized void quitDriver() {
        driverThread.get().getDriver().quit();
        driverThread.remove();
    }

    public static DriverConfig getConfig() {
        return driverThread.get().getConfig();
    }

}
