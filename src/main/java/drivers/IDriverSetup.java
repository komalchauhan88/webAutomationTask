package drivers;

import drivers.DriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public interface IDriverSetup {
	
	WebDriver getDriverObject (DesiredCapabilities dc);
	
	DesiredCapabilities getDesiredCapabilities(DriverConfig config);

}
