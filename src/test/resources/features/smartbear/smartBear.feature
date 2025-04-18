Feature: Testing Smart Order Functionality

  Scenario: Happy Path Order
    Given User provides username,password and click loginButton
    When User clicks the Order Link from MainPage
    And User provides the 'My Money',4 for Product Information
    And User provides the 'Ahmet','20545 St','DesPlaines','IL','606565' for Address Information
    And User provides the 'VISA','345345345345','06/27' for Payment Information
    Then User clicks process button and validates 'New order has been successfully added.'
    And User clicks view all orders Link from MainPage
    And User validates all information 'Ahmet','My Money','4','02/25/2025','20545 St','DesPlaines','IL','606565','VISA','345345345345','06/27'