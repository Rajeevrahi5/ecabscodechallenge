Feature: Expedia Flight Search

  Background: Browser is set up and URL is launched
    Given user launch expedia URL

  Scenario: Search multi city flight and verify the price
    When User clicks on Flight option
    And User clicks on multi city option
    And Enter first Departure city
    And Enter first Arrival city
    And Enter first Departure date
    And Select number of travellers
    And Enter second Departure city
    And Enter second Arrival city
    And Enter second Departure date
    And Click on Add another flight button
    And Enter third Departure city
    And Enter third Arrival city
    And Enter third Departure date
    Then Click on Search button
    And Verify first Departure city
    And Verify first Arrival city
    And Verify first Departure date
    And Verify number of travellers
    And Verify second Departure city
    And Verify second Arrival city
    And Verify second Departure date
    And Verify third Departure city
    And Verify third Arrival city
    And Verify third Departure date
    And Verify individual and total price
