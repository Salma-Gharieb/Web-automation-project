@Smoke
Feature: Registered user login

#  Background:User should register first
#    Given user is on Homepage
#    When user clicks on register link
#    And user Enters valid data
#    And clicks on register button
#    Then user is registered successfully
#    And user can logout

  Scenario: User can login with valid data
    When user clicks on login link
    And user Enters valid email and password
    And clicks on login button
    Then user is logged in successfully