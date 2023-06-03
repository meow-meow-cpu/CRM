@US04
Feature: As a user, I should be able to see all the options under the user profile

  Background: user is logged in
    Given user is on the login page
    And that user is logged in as "helpdesk"
    #possible usertypes: helpdesk, humanResources, marketing

  Scenario: As a user, I should be able to see all the options under the user profile
    When user clicks on profile icon
    Then user sees five options:

      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                  |
