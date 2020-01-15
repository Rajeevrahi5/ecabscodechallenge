Feature: API Automation With REST Assured


  Scenario: API Test - Get User List
    When user hits the Root URL
    Then User is listed and Status code and body content is verified


  Scenario: API Test - Successful Registration with valid credentials
    When user hits the Root URL
    Then User is registered and Status code and body content is verified

  Scenario: API Test - UnSuccessful Registration with email
    When user hits the Root URL
    Then Registration is failed and Status code and body content is verified

