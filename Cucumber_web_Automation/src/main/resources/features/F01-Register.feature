@Smoke
Feature: user could register to the system
  Scenario: user can register with valid data
    Given user is on Homepage
    When user clicks on register link
    And user Enters valid data
    And clicks on register button
    Then user is registered successfully