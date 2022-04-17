@Smoke
Feature: User could search for any product

  Background: User opens browser and navigates to homepage
    Given user is on Homepage

  Scenario Outline: User can search for product using fullname
    When User enters "<product name>" in search text box
    And clicks on search button
    Then User should find related results with "<product name>"

    Examples:
    |product name|
    |laptop|

