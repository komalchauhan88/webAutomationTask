package elements;

import org.openqa.selenium.By;

public class Button extends Element {

	public Button(By by) {
		super(by);
	}

	public Button(String locator, LocatorType locatorType) {

		super(locator, locatorType);
	}

	public void submit() {
		getElement();
		element.submit();
	}

}
