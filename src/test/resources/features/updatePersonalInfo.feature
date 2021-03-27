Feature: Update Personal Information

  @E2E
  Scenario Outline: Update Personal Information of First Name in My Account
    Given User logins in the website with <username> and <password>
    And User proceeds to update the personal information
    And User updates the <updatedFName>
    And provide the current <password> and proceed to save the Information
    Examples:
      | username                   | password     | updatedFName |
      | komalchauhan88@hotmail.com | Welcome@1234 | Sintu        |