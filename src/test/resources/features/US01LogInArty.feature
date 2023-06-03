
Feature: Log In

  #Background: user is logged in
   # Given that user is logged in as "helpdesk"
    #possible usertypes: helpdesk, humanResources, marketing

  Scenario Outline: User should be able to log in with valid credentials
    Given user is on the login page
    And user enters "valid" credentials for "<userType>" "<username>" and "<password>"
    When user clicks log-in button
    Then user lands on the homepage
    Examples:
      | userType  | username                     | password |
      | Help Desk | helpdesk1@cybertekschool.com | UserUser |


  Scenario Outline: User should not be able to log in with invalid credentials
    Given user is on the login page
    And user enters "invalid" credentials for "<userType>" "<username>" and "<password>"
    When user clicks log-in button
    Then  following message should be displayed:Incorrect username or password
    Examples:
      | userType  | username               | password |
      | Help Desk | helpdesk1@casyyytytsdl.com | Uayttytyytsddasr |