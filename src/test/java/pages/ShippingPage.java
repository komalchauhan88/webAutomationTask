package pages;

import elements.Button;
import elements.CheckBoxElement;
import elements.Element;
import framework.setup.BasePage;

public class ShippingPage extends BasePage {

    private CheckBoxElement agreeToTerms = new CheckBoxElement(".checker input", Element.LocatorType.CSS_SELECTOR);

    private Button proceedToCheckoutButton = new Button(".cart_navigation.clearfix .standard-checkout", Element.LocatorType.CSS_SELECTOR);

    public void agreeToTermsAndCondition() {
        agreeToTerms.check();
    }

    public void proceedToCheckOut() {
        proceedToCheckoutButton.submit();
    }

}
