Feature: As a user, I should be able to access the correct modules.

  Background: user is logged in
    Given user is on the login page
    And that user is logged in as "helpdesk"
    #possible usertypes: helpdesk, humanResources, marketing

  Scenario: User should access the correct page when they click on any module
    When user verifies below modules are present
      | Activity Stream  |
      | Tasks            |
      | Chat and Calls   |
      | Workgroups       |
      | Drive            |
      | Calendar         |
      | Mail             |
      | Contact Center   |
      #| CRM              |
      | Time and Reports |
      | Employees        |
      | Services         |
      | Company          |

    Then user should access the correct page by seeing the below titles
      | Portal                  |
      | Site map                |
      | Chat and Calls          |
      | Workgroups and projects |
      | Site map                |
      | Site map                |
      | Contact Center          |
      | Absence Chart           |
      | Company Structure       |
      | Meeting Rooms           |
      | Company                 |
