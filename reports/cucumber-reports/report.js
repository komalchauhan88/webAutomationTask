$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("orderProduct.feature");
formatter.feature({
  "line": 1,
  "name": "Product Order",
  "description": "",
  "id": "product-order",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Order T-shirt and Verify it in order history",
  "description": "",
  "id": "product-order;order-t-shirt-and-verify-it-in-order-history",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User logins in the website with \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "clicks at the T-Shirt tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "adds T-Shirt in the cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user proceeds to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user goes to address page and clicks to proceed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user confirms the terms and services and click to proceed",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user pays the amount for the T-Shirt",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should be able to validate order in order history",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "product-order;order-t-shirt-and-verify-it-in-order-history;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "product-order;order-t-shirt-and-verify-it-in-order-history;;1"
    },
    {
      "cells": [
        "komalchauhan88@hotmail.com",
        "Welcome@1234"
      ],
      "line": 15,
      "id": "product-order;order-t-shirt-and-verify-it-in-order-history;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Order T-shirt and Verify it in order history",
  "description": "",
  "id": "product-order;order-t-shirt-and-verify-it-in-order-history;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User logins in the website with komalchauhan88@hotmail.com and Welcome@1234",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "clicks at the T-Shirt tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "adds T-Shirt in the cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user proceeds to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user goes to address page and clicks to proceed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user confirms the terms and services and click to proceed",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user pays the amount for the T-Shirt",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should be able to validate order in order history",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "komalchauhan88@hotmail.com",
      "offset": 32
    },
    {
      "val": "Welcome@1234",
      "offset": 63
    }
  ],
  "location": "OrderProduct.user_logins_in_the_website_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 19756090505,
  "status": "passed"
});
formatter.match({
  "location": "OrderProduct.clicks_at_the_T_Shirt_tab()"
});
formatter.result({
  "duration": 3453770550,
  "status": "passed"
});
formatter.match({
  "location": "OrderProduct.adds_T_Shirt_in_the_cart()"
});
formatter.result({
  "duration": 257655209,
  "status": "passed"
});
formatter.match({
  "location": "OrderProduct.user_proceeds_to_checkout()"
});
formatter.result({
  "duration": 8120853768,
  "status": "passed"
});
formatter.match({
  "location": "OrderProduct.user_goes_to_address_page_and_clicks_to_proceed()"
});
formatter.result({
  "duration": 2757124975,
  "status": "passed"
});
formatter.match({
  "location": "OrderProduct.user_confirms_the_terms_and_services_and_click_to_proceed()"
});
formatter.result({
  "duration": 2098574769,
  "status": "passed"
});
formatter.match({
  "location": "OrderProduct.user_pays_the_amount_for_the_T_Shirt()"
});
formatter.result({
  "duration": 6545051928,
  "status": "passed"
});
formatter.match({
  "location": "OrderProduct.then_user_should_be_able_to_validate_order()"
});
formatter.result({
  "duration": 3686166015,
  "status": "passed"
});
formatter.uri("updatePersonalInfo.feature");
formatter.feature({
  "line": 1,
  "name": "Update Personal Information",
  "description": "",
  "id": "update-personal-information",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Update Personal Information of First Name in My Account",
  "description": "",
  "id": "update-personal-information;update-personal-information-of-first-name-in-my-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User proceeds to update the personal information",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User updates the \u003cupdatedFName\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "provide the current \u003cpassword\u003e and proceed to save the Information",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user first name should be \u003cupdatedFName\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "update-personal-information;update-personal-information-of-first-name-in-my-account;",
  "rows": [
    {
      "cells": [
        "password",
        "updatedFName"
      ],
      "line": 11,
      "id": "update-personal-information;update-personal-information-of-first-name-in-my-account;;1"
    },
    {
      "cells": [
        "Welcome@1234",
        "Komal"
      ],
      "line": 12,
      "id": "update-personal-information;update-personal-information-of-first-name-in-my-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Update Personal Information of First Name in My Account",
  "description": "",
  "id": "update-personal-information;update-personal-information-of-first-name-in-my-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User proceeds to update the personal information",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User updates the Komal",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "provide the current Welcome@1234 and proceed to save the Information",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user first name should be Komal",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "UpdatePersonalInfo.user_proceeds_to_update_the_personal_information()"
});
formatter.result({
  "duration": 3660849547,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Komal",
      "offset": 17
    }
  ],
  "location": "UpdatePersonalInfo.user_updates_the_First_Name(String)"
});
formatter.result({
  "duration": 152305689,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome@1234",
      "offset": 20
    }
  ],
  "location": "UpdatePersonalInfo.provide_the_current_password_and_proceed_to_save_the_Information(String)"
});
formatter.result({
  "duration": 3491806683,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Komal",
      "offset": 26
    }
  ],
  "location": "UpdatePersonalInfo.user_first_name_should_be(String)"
});
formatter.result({
  "duration": 38988519,
  "status": "passed"
});
});