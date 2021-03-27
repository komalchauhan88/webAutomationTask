package elements;

import org.openqa.selenium.By;


/**
 * Defines the functionalities of locating different WebElements using LinkText.
 * It only defines the functionalities supported by the framework for the
 * selectors.
 */
public class Link extends Element {

	/**
	 * Initializing the LinkText Element with By locator.
	 * 
	 * @param by
	 *            The By locator
	 */
	public Link(By by) {
		super(by);
	}

	/**
	 * Initializing the LinkText of element.
	 * 
	 * @param locator
	 *            : The link of element
	 * @param locatorType
	 *            : The linktext locatorType.
	 */
	public Link(String locator, Element.LocatorType locatorType) {
		super(locator, locatorType);
	}

	/**
	 * To fetch the Href for any Link element.
	 * 
	 * @return the Href attribute of element.
	 */
	public String getHref() {
		getElement();
		return element.getAttribute("href");
	}

}
