Feature: Composeing a mail

  Scenario Outline: To check a user is able to compose a mail to a given
    Given Application is up and running
    And User is logged in successfully
    When When user clicks on compose option
    And User enters <email_id> and <subject>
    And User clicks on send button
    Then Compose window is closed
    And Message window pops up

    Examples: 
      | email_id            | subject        |
      | techbodhi@gmail.com | Resume for job |
      | ganeshabc@gmail.com | Assignment     |
