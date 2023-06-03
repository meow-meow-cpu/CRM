Feature: As a user, I should be able to log out from the CRM app.

Background: user is logged in
  Given that user is logged in as "helpdesk"
    #possible usertypes: helpdesk, humanResources, marketing

  @us03
Scenario:  As a user, I should be able to log out from the CRM app.
  When user clicks on profile icon
  Then the Log Out option from the homepage should be displayed
  When user clicks log out button
  Then user is back on the login page



