Feature: Save credentials

  Scenario Outline: As a user, I should be able to save my user credential on a computer
    Given user is on the login page
    And user enters "valid" credentials for "<userType>" "<username>" and "<password>"
    Then user clicks on the Remember me on this computer checkbox
    When user clicks log-in button
    Then user lands on the homepage
    Examples:
      | userType  | username                     | password |
      | Help Desk | helpdesk1@cybertekschool.com | UserUser |