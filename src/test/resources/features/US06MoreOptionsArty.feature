Feature: More options
  Background: user is logged in
    Given user is on the login page
    And that user is logged in as "helpdesk"
    #possible usertypes: helpdesk, humanResources, marketing
  Scenario: As a user, I should be able to see all the options under the MORE tab on the homepage

    When user clicks the "More" tab
    Then user should be able to four additional options
    |File|
    |Appreciation|
    |Announcement|
    |Workflow    |
