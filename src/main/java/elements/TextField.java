package elements;

import org.openqa.selenium.By;

public class TextField extends Element {

	public TextField(By by) {
		super(by);
	}

	public TextField(String locator, LocatorType locatorType) {
		super(locator, locatorType);
	}

	public void clearandType(String text) {
		getElement().clear();
		getElement().sendKeys(text);
	}

	public void Type(String text) {
		getElement().sendKeys(text);
	}
}
