package pages;

import elements.Button;
import elements.Element;
import framework.setup.BasePage;

public class SummaryPage extends BasePage {

    private Button checkout = new Button(".cart_navigation.clearfix .standard-checkout", Element.LocatorType.CSS_SELECTOR);

    public void proceedToCheckout() {
        checkout.click();
    }
}
