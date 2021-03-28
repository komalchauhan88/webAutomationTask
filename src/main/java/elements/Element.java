package elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverFactory;

public class Element {

    protected WebDriver driver = DriverFactory.getDriver();

    protected WebElement element = null;

    protected List<WebElement> listOfElements = null;

    protected String locator = null;

    protected By by = null;

    public static enum LocatorType {
        ID, NAME, CLASS_NAME, LINK_TEXT, PARTIAL_LINK_TEXT, CSS_SELECTOR, TAG_NAME, XPATH,
    }

    public Element(By by) {
        this.by = by;
    }

    public Element(String locator, LocatorType locatorType) {
        this.locator = locator;
        this.by = getLocatorBy(locator, locatorType);
    }

    private By getLocatorBy(final String locator, final LocatorType locatorType) {

        switch (locatorType) {

            case ID:
                return By.id(locator);

            case NAME:
                return By.name(locator);

            case CLASS_NAME:
                return By.className(locator);

            case LINK_TEXT:
                return By.linkText(locator);

            case PARTIAL_LINK_TEXT:
                return By.partialLinkText(locator);

            case CSS_SELECTOR:
                return By.cssSelector(locator);

            case TAG_NAME:
                return By.tagName(locator);

            case XPATH:
                return By.xpath(locator);

            default:

                return By.xpath(locator);
        }
    }

    protected WebElement getElement() {
        return element = (new WebDriverWait(DriverFactory.getDriver(),
                DriverFactory.getConfig().getExplicitWaitTimeout()))
                .until(ExpectedConditions.visibilityOfElementLocated(by));

    }


    public List<WebElement> getElements() {

        return listOfElements = driver.findElements(by);

    }

    public void click() {
        getElement().click();
    }

    public void sendKeys(final CharSequence arg0) {
        getElement().clear();
        getElement().sendKeys(arg0);
    }

    public boolean isTextPresent(final String text) {
        return getElement().getText().contains(text);
    }

    public boolean isEnabled() {
        return getElement().isEnabled();
    }

    public boolean isSelected() {
        getElement();
        return element.isSelected();
    }

    public boolean isDisplayed() {
        try {
            getElement();
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getValue() {
        getElement();
        return element.getAttribute("value");
    }

    public String getText() {
        getElement();
        return element.getText();
    }

    public String getTagName() {
        getElement();
        return element.getTagName();
    }

    public String getLocator() {
        return locator;
    }

    public void dragDrop(Element elem) {
        Actions action = new Actions(driver);
        action.dragAndDrop(getElement(), elem.getElement());
    }

    public void rightClick() {
        Actions action = new Actions(driver);
        action.contextClick(getElement()).build().perform();
    }

    public void doubleClick() {
        Actions action = new Actions(driver);
        action.doubleClick(getElement()).build().perform();
    }

    public void mouseHover() {
        Actions action = new Actions(driver);
        action.moveToElement(getElement()).build().perform();
    }
}
