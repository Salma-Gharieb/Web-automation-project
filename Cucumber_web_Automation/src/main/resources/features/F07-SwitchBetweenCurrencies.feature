@Smoke
Feature: user can change currency
  Scenario:
    Given user is on Homepage
    When user change currency to Euro
    And user searches for an item
    Then price is displayed in Euro
