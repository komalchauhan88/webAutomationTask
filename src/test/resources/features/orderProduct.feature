Feature: Product Order

  @E2E
  Scenario Outline: Order T-shirt and Verify it in order history
    Given User logins in the website with <username> and <password>
    When clicks at the T-Shirt tab
    And adds T-Shirt in the cart
    And user proceeds to checkout
    And user goes to address page and clicks to proceed
    And user confirms the terms and services and click to proceed
    And user pays the amount for the T-Shirt
    Then user should be able to validate order in order history
    Examples:
      | username                   | password     |
      | komalchauhan88@hotmail.com | Welcome@1234 |