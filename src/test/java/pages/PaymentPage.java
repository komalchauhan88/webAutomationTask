package pages;

import elements.Button;
import elements.Element;
import framework.setup.BasePage;

import java.util.Arrays;
import java.util.List;

public class PaymentPage extends BasePage {

    private Button bankWire = new Button(".bankwire", Element.LocatorType.CSS_SELECTOR);

    private Button confirmOrder = new Button(".button-medium span .icon-chevron-right", Element.LocatorType.CSS_SELECTOR);

    private Element orderReferenceLine = new Element(".box br", Element.LocatorType.CSS_SELECTOR);

    public void payByBankWire() {
        bankWire.click();
    }

    public void clickOnConfirmOrder() {
        confirmOrder.getElements().get(1).click();
    }

    public String getOrderReferenceNumber() {
        int locationOfNumber = 0;
        List<String> ls = Arrays.asList(orderReferenceLine.getElements().get(5).getText().split(" "));
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).equalsIgnoreCase("reference")) {
                locationOfNumber = i + 1;
                break;
            }
        }
        return ls.get(locationOfNumber);
    }

}
