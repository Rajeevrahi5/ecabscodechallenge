Feature: Automation Practice SignIn

  Scenario: Sign in with no credentials
    Given user enters the URL
    When user clicks on SignIn button at home page
    And user clicks on SignIn button at account page
    Then error message related to Email is thrown


  Scenario: Sign in with email and empty password
    Given user enters the URL
    When user clicks on SignIn button at home page
    And user enters Email ID
    And user clicks on SignIn button at account page
    Then error message related to password is thrown


  Scenario: Sign in with password and empty email
    Given user enters the URL
    When user clicks on SignIn button at home page
    And user enters Password
    And user clicks on SignIn button at account page
    Then error message related to Email is thrown

  Scenario: Sign in with incorrect credentials
    Given user enters the URL
    When user clicks on SignIn button at home page
    And user enters Email ID
    And user enters Password
    And user clicks on SignIn button at account page
    Then Authentication fail error is thrown

