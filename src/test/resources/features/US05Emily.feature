Feature: As a user, I should be able to send simple text messages using the message tab

  Background: user is logged in
    Given user is on the login page
    And that user is logged in as "helpdesk"
    #possible usertypes: helpdesk, humanResources, marketing

  Scenario: As a user, I should be able to send simple text messages using the message tab
    When user clicks the "Message" tab
    And the user writes the message body
    |Hello|
    Then user sends the message
    And verifies message is sent successfully


  Scenario: As a user, I should be able to send simple text messages using the message tab
    When user clicks the "Message" tab
    And the user doesn't write a message body
    Then user sends the message
    Then user should see the following message: The message title is not specified