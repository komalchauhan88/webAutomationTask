package pages;

import elements.Element;
import elements.Table;
import framework.setup.BasePage;

public class OrderHistory extends BasePage {

    private Table orderListTable = new Table("#order-list", Element.LocatorType.CSS_SELECTOR);

    public boolean isOrderPresent(String orderID) {
        return orderListTable.getContent(1, 1).equalsIgnoreCase(orderID);
    }
}
