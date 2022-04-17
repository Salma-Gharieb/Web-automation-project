@Smoke
Feature: user can add product to wishlist

  Background:
    Given user is on Homepage
    When User enters "laptop" in search text box
    And clicks on search button
    Then User should find related results with "laptop"

  Scenario:
    When user clicks on product
    And clicks on add to wishlist button
    Then product is added to wishlist