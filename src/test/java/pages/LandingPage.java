package pages;

import elements.Element;
import elements.Link;
import framework.setup.BasePage;

public class LandingPage extends BasePage {


    private Link tShirtLink = new Link("T-shirts", Element.LocatorType.LINK_TEXT);

    private Link orderHistory = new Link(".myaccount-link-list > li > a[title='Orders']",
            Element.LocatorType.CSS_SELECTOR);

    private Link personalInformation = new Link(".myaccount-link-list > li > a[title='Information']",
            Element.LocatorType.CSS_SELECTOR);

    private Link customerAccount = new Link(".header_user_info .account", Element.LocatorType.CSS_SELECTOR);

    public void openTShirtLink() {
        tShirtLink.click();
    }

    public void openOrderHistory() {
        orderHistory.click();
    }

    public void navigateToCustomerAccount() {
        customerAccount.click();
    }

    public void openMyPersonalInformation(){
        personalInformation.click();
    }
}
