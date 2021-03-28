package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import framework.setup.WebTest;
import org.junit.Assert;
import pages.*;

public class OrderProduct extends WebTest {

    LoginPage loginPage = new LoginPage();
    LandingPage landingPage = new LandingPage();
    TShirtPage tShirtPage = new TShirtPage();
    SummaryPage summaryPage = new SummaryPage();
    AddressPage addressPage = new AddressPage();
    ShippingPage shippingPage = new ShippingPage();
    PaymentPage paymentPage = new PaymentPage();
    OrderHistory orderHistory = new OrderHistory();

    int initialOrderRowCount;

    @Given("^User logins in the website with (.+) and (.+)$")
    public void user_logins_in_the_website_with_username_and_password(String username, String password) throws Throwable {
        loginPage.login(username, password);
    }

    @When("^clicks at the T-Shirt tab$")
    public void clicks_at_the_T_Shirt_tab() throws Throwable {
        landingPage.openOrderHistory();
        initialOrderRowCount = orderHistory.getRowCount();
        landingPage.openTShirtLink();
    }

    @And("^adds T-Shirt in the cart$")
    public void adds_T_Shirt_in_the_cart() throws Throwable {
        tShirtPage.hoverAndAddToCart();
    }

    @And("^user proceeds to checkout$")
    public void user_proceeds_to_checkout() throws Throwable {
        tShirtPage.proceedToCheckout();
        summaryPage.proceedToCheckout();
    }

    @And("^user goes to address page and clicks to proceed$")
    public void user_goes_to_address_page_and_clicks_to_proceed() throws Throwable {
        addressPage.proceedToCheckout();
    }

    @And("^user confirms the terms and services and click to proceed$")
    public void user_confirms_the_terms_and_services_and_click_to_proceed() throws Throwable {
        shippingPage.agreeToTermsAndCondition();
        shippingPage.proceedToCheckOut();
    }

    @And("^user pays the amount for the T-Shirt$")
    public void user_pays_the_amount_for_the_T_Shirt() throws Throwable {
        paymentPage.payByBankWire();
        paymentPage.clickOnConfirmOrder();
    }

    @Then("^user should be able to validate order in order history")
    public void then_user_should_be_able_to_validate_order() {
        landingPage.navigateToCustomerAccount();
        landingPage.openOrderHistory();
        Assert.assertEquals(orderHistory.getRowCount(), initialOrderRowCount + 1);
    }

}
