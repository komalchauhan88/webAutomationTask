package pages;

import elements.Element;
import elements.Table;
import framework.setup.BasePage;

public class OrderHistory extends BasePage {

    private Table orderListTable = new Table("#order-list", Element.LocatorType.CSS_SELECTOR);

    public int getRowCount() {
        return orderListTable.getRowCount();
    }
}
