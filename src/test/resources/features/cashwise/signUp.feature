Feature: User Sign Up

  Background:
    Given the user is on the Sign Up page

  @SignUpPositive
  Scenario Outline: Successful user sign up
    When the user signs up with email "<email>", password "<password>", and confirm password "<confirmPassword>"
    Then the user should be successfully signed up

    Examples:
      | email               | password  | confirmPassword |
      | test1234@gmail.com  | Pass@123  | Pass@123        |

  @SignUpNegativeEmail
  Scenario Outline: Invalid email format
    When the user signs up with email "<email>", password "<password>", and confirm password "<confirmPassword>"
    Then the user should see email error message "<expectedEmailMsg>"

    Examples:
      | email            | password  | confirmPassword | expectedEmailMsg                  |
      |                  | Pass@123  | Pass@123        | Please enter a valid email address |
      | invalid-email     | Pass@123  | Pass@123        | Please enter a valid email address |
      | test#gmail.com    | Pass@123  | Pass@123        | Please enter a valid email address |

  @SignUpNegativePassword
  Scenario Outline: Invalid password
    When the user signs up with email "<email>", password "<password>", and confirm password "<confirmPassword>"
    Then the user should see password error message "<expectedPasswordMsg>"

    Examples:
      | email             | password  | confirmPassword | expectedPasswordMsg                  |
      | test@gmail.com     | 12345     | 12345           | Password must be at least 6 characters |
      | test@gmail.com     |           | 123456          | Password cannot be empty!             |

  @SignUpNegativeConfirmPassword
  Scenario Outline: Password mismatch
    When the user signs up with email "<email>", password "<password>", and confirm password "<confirmPassword>"
    Then the user should see confirm password error message "<expectedConfirmPassMsg>"

    Examples:
      | email             | password  | confirmPassword | expectedConfirmPassMsg            |
      | test@gmail.com     | 123456     | 654321          | Passwords do not match!            |
      | test@gmail.com     | 123456     | 12              | Passwords do not match!            |


