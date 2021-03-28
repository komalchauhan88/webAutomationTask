package drivers;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class DriverConfig {

    private boolean setAssumeUntrustedCertificateIssuer = true;
    private boolean setAcceptUntrustedCertificates = true;
    private boolean enableJavascript = true;
    private WebDriver driver;
    private String chromeDriverPath;
    private String chromeBinPath;
    private int webSessionTimeout = 90 * 1000;
    public static final int DEFAULT_IMPLICIT_WAIT_TIMEOUT = 5;
    public static final int DEFAULT_EXPLICIT_WAIT_TIME_OUT = 15;
    public static final int DEFAULT_PAGE_LOAD_TIMEOUT = 90;
    private double implicitWaitTimeout = DEFAULT_IMPLICIT_WAIT_TIMEOUT;
    private int explicitWaitTimeout = DEFAULT_EXPLICIT_WAIT_TIME_OUT;
    private int pageLoadTimeout = DEFAULT_PAGE_LOAD_TIMEOUT;

    private String browserVersion;
    private boolean addJSErrorCollectorExtension = false;
    private ArrayList<WebDriverEventListener> webDriverListeners;
    private boolean useFirefoxDefaultProfile = true;
    private int browserWindowWidth = -1;
    private int browserWindowHeight = -1;
    private String testType;
    private String browserName;


    public ArrayList<WebDriverEventListener> getWebDriverListeners() {

        return webDriverListeners;
    }

    public void setWebDriverListeners(final ArrayList<WebDriverEventListener> webDriverListeners) {
        this.webDriverListeners = webDriverListeners;
    }

    public void setWebDriverListeners(final String listeners) {
        ArrayList<WebDriverEventListener> listenerList = new ArrayList<WebDriverEventListener>();
        String[] list = listeners.split(",");
        for (String aList : list) {

            WebDriverEventListener listener = null;
            try {
                if (!aList.equals("")) {
                    listener = (WebDriverEventListener) (Class.forName(aList)).newInstance();
                    listenerList.add(listener);
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (ClassCastException e) {
                e.printStackTrace();
            }
        }
        this.webDriverListeners = listenerList;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public String getChromeBinPath() {
        return chromeBinPath;
    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public int getExplicitWaitTimeout() {
        if (explicitWaitTimeout < getImplicitWaitTimeout()) {
            return (int) getImplicitWaitTimeout();
        } else {
            return explicitWaitTimeout;
        }
    }


    public double getImplicitWaitTimeout() {
        return implicitWaitTimeout;
    }

    public void setBrowserVersion(final String browserVersion) {
        this.browserVersion = browserVersion;
    }

    public void setChromeBinPath(final String chromeBinPath) {
        this.chromeBinPath = chromeBinPath;
    }

    public void setChromeDriverPath(final String chromeDriverPath) {
        this.chromeDriverPath = chromeDriverPath;
    }

    public void setDriver(final WebDriver driver) {
        this.driver = driver;
    }

    public void setEnableJavascript(final boolean enableJavascript) {
        this.enableJavascript = enableJavascript;
    }

    public void setExplicitWaitTimeout(final int explicitWaitTimeout) {
        this.explicitWaitTimeout = explicitWaitTimeout;
    }

    public void setImplicitWaitTimeout(final double implicitWaitTimeout) {
        this.implicitWaitTimeout = implicitWaitTimeout;
    }

    public void setPageLoadTimeout(final int pageLoadTimeout) {
        this.pageLoadTimeout = pageLoadTimeout;
    }

    public void setSetAcceptUntrustedCertificates(final boolean setAcceptUntrustedCertificates) {
        this.setAcceptUntrustedCertificates = setAcceptUntrustedCertificates;
    }

    public void setSetAssumeUntrustedCertificateIssuer(final boolean setAssumeUntrustedCertificateIssuer) {
        this.setAssumeUntrustedCertificateIssuer = setAssumeUntrustedCertificateIssuer;
    }

    public void setBrowserWindowHeight(final int browserWindowHeight) {
        this.browserWindowHeight = browserWindowHeight;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(final String browserName) {
        this.browserName = browserName;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(final String testType) {
        this.testType = testType;
    }
}

