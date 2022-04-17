@Smoke
Feature: user could add different products to compare list

  Scenario: user add two products to compare list
    Given user is on Homepage
    When user navigates to notebook page from computer category
    And user add First products to compare cart
    And user add Second products to compare cart
    Then products is added to compare cart

