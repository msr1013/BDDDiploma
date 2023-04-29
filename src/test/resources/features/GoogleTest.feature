Feature: Testing feature

  Background:
    Given user opens orange hrm website

  @smoke @regression
  Scenario: Verify user should be able to login using correct username and password
    And user opens the browser
    And user enters username Admin, and password admin123
#    Then user validates Dashboard page

  Scenario Outline: Verify that user should be able to login using wrong username and password

    And user opens the browser
    And user enters username <username>, password <password> wrong
    Then user validates invalid user with Invlaid credentials error message
    Examples:
      | username  | password  |
      | Admin     | admin123  |
      | username1 | password2 |

  Scenario: Verify that user should be able to search any user and verify it in admin page
    And user enters username Admin, and password admin123 and submit

  Scenario: Verify that user should be able to search any user and verify it in admin page



