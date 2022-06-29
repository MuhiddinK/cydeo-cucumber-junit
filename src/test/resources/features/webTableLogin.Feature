Feature: User should be able to login using correct credentials

  @wip
  Scenario: Positive login scenario
    Given user is on the login page of web table
    When user enters username "username"
    And user enters password "password"
    And user clicks to login button
    Then user should se url contains orders

