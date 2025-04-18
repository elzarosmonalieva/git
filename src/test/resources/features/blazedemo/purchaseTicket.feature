Feature: Testing the purchase functionality
Background:
  Given user navigates to the 'https://www.blazedemo.com/'
  When user choose 'Boston' for departure
  And user choose 'London' for destination and click finding flight button

  Scenario: Validating finding flight functionality
#    Given user navigates to the 'https://www.blazedemo.com/'
#    When user choose 'Boston' for departure
#    And user choose 'London' for destination and click finding flight button
    Then user validate the header 'Flights from Boston to London:'

  Scenario: Validating purchase ticket functionality
#    Given user navigates to the 'https://www.blazedemo.com/'
#    When user choose 'Boston' for departure
#    And user choose 'London' for destination and click finding flight button
    And User clicks the first Flight
    And User provides personal information 'Elly','2055 avenue','Des Plaines','IL','60045'
    And User provides card information 'American Express','5245345354534','12','2027','Elly'
    And User clicks remember me box and purchase flight button
    Then User validates purchase message 'Thank you for your purchase today!'