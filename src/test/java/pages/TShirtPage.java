package pages;

import elements.Button;
import elements.Element;
import framework.setup.BasePage;

public class TShirtPage extends BasePage {

    private Element tShirt = new Element(".product_img_link > img", Element.LocatorType.CSS_SELECTOR);

    private Element addTShirtToCart = new Element(".ajax_add_to_cart_button", Element.LocatorType.CSS_SELECTOR);

    private Button proceedToCheckoutButton = new Button("#layer_cart .clearfix .layer_cart_cart .button-container a", Element.LocatorType.CSS_SELECTOR);

    public void hoverAndAddToCart() {
        tShirt.mouseHover();
        addTShirtToCart.click();
    }

    public void proceedToCheckout() {
        proceedToCheckoutButton.click();
    }
}
