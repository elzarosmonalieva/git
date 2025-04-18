Feature: Testing LogIn Functionality


  Scenario: Testing happy path Login (correct Username + correct Password)

    When User enters the username 'guest1@microworks.com' and password 'Guest1!'
    Then User clicks the remember me checkbox and signs in
    And validates the title 'ORDER DETAILS - Weborder'

  Scenario: Correct username wrong password
    When user enters the correct username 'guest1@microworks.com' and wrong password '123456!'
    Then User clicks the remember me checkbox and signs in
    And validates the message 'Sign in Failed'

  Scenario: Wrong username correct password
    When user enters the wrong username 'guest1@microworks' and correct password 'Guest1!'
    Then User clicks the remember me checkbox and signs in
    And validates the message 'Sign in Failed'

  Scenario: Empty username empty password
    When user enters the empty username '' and empty password ''
    Then User clicks the remember me checkbox and signs in
    And validates the message 'Sign in Failed'

