Feature: Log In

  Scenario: User should be able to log in with valid credentials
    Given user is on the login page
    And user enters valid credentials
    When user clicks log-in button
    Then user lands on the homepage

    Scenario: User should not be able to log in with invalid credentials
      Given user is on the login page
      And user enters invalid credentials
      When user clicks log-in button
      Then 'Incorrect username or password' should be displayed