package pages;

import elements.Button;
import elements.Element;
import framework.setup.BasePage;

public class AddressPage extends BasePage {

    private Button proceedToCheckout = new Button("processAddress", Element.LocatorType.NAME);

    public void proceedToCheckout() {
        proceedToCheckout.submit();
    }
}
