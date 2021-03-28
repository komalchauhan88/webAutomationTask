Feature: Update Personal Information

  @E2E
  Scenario Outline: Update Personal Information of First Name in My Account
    Given User proceeds to update the personal information
    When User updates the <updatedFName>
    And provide the current <password> and proceed to save the Information
    Then user first name should be <updatedFName>

    Examples:
      | password     | updatedFName |
      | Welcome@1234 | Kamal        |