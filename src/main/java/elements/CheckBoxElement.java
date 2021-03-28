package elements;

import org.openqa.selenium.By;

public class CheckBoxElement extends Element {

    public CheckBoxElement(final By by) {
        super(by);
    }

    public CheckBoxElement(String locator, LocatorType locatorType) {
        super(locator, locatorType);
    }

    public void check() {
        if (!isSelected()) {
            super.click();
        }
    }

    @Override
    public void click() {
        super.click();
    }

    public boolean isSelected() {
        getElement();
        return element.isSelected();
    }

    public void uncheck() {
        if (isSelected()) {
            super.click();
        }
    }
}
