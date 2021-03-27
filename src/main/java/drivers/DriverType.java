package drivers;

import drivers.DriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum DriverType implements IDriverSetup {

    CHROME {
        public WebDriver getDriverObject(DesiredCapabilities dc) {
            try {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            } catch (WebDriverException e) {
            } catch (Exception e) {
                System.out.println("Initialization error displayed");
            }
            return new ChromeDriver(dc);

        }

        public DesiredCapabilities getDesiredCapabilities(DriverConfig config) {
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            System.out.println(config.getExplicitWaitTimeout());
            return capabilities;
        }

    }

}
