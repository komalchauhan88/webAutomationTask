package pages;

import cucumber.api.java.en.And;
import elements.Element;
import elements.Link;
import framework.setup.BasePage;

public class LandingPage extends BasePage {


    private Link tShirtLink = new Link(".clearfix.menu-content:not(.submenu-container) li a[title='T-shirts']", Element.LocatorType.CSS_SELECTOR);

    private Link orderHistory = new Link(".myaccount-link-list > li > a[title='Orders']",
            Element.LocatorType.CSS_SELECTOR);

    private Link personalInformation = new Link(".myaccount-link-list > li > a[title='Information']",
            Element.LocatorType.CSS_SELECTOR);

    private Link customerAccount = new Link(".header_user_info .account", Element.LocatorType.CSS_SELECTOR);

    public void openTShirtLink() {
        tShirtLink.getElements().get(1).click();
    }

    public void openOrderHistory() {
        orderHistory.click();
    }

    public void navigateToCustomerAccount() {
        customerAccount.click();
    }

    public void openMyPersonalInformation() {
        personalInformation.click();
    }

    private Element customerName = new Element(".header_user_info .account span", Element.LocatorType.CSS_SELECTOR);

    public String getCustomerName() {
        return customerName.getText();
    }
}
