@Smoke
Feature: Registered User could change password

  Background: User should login first to the website
    Given user is on Homepage
    When user clicks on login link
    And user Enters valid email and password
    And clicks on login button
    Then user is logged in successfully

  Scenario Outline: user can change password
    When user clicks on myaccount link
    And Click on change password link
    And Enters "<oldPassword>" and "<newPassword>"
    And clicks on change password button
    Then password is changed successfully
    Examples:
      | oldPassword  | newPassword     |
      | 12345678     | testpassword12  |
