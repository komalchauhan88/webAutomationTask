package elements;

import org.openqa.selenium.By;

public class Link extends Element {

    public Link(By by) {
        super(by);
    }

    public Link(String locator, Element.LocatorType locatorType) {
        super(locator, locatorType);
    }

    public String getHref() {
        getElement();
        return element.getAttribute("href");
    }

}
