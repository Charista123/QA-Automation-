Feature: Log in to the application

  Scenario: success login
    Given open login page
    When click icon user
    And input username
    And input password
    Then click login button
#    Then user is on the dashboard page

  Scenario: failed login
    Given open login page
    When click icon user
    And input username
    And input invalid password
    And click login button
    Then user gets an error message
