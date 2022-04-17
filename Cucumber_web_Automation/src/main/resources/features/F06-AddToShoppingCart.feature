@Smoke
Feature:User can add product to shopping cart

  Background:User search for product to add to cart first
    Given user is on Homepage
    When User enters "laptop" in search text box
    And clicks on search button
    Then User should find related results with "laptop"

  Scenario:
    When user clicks on product
    And clicks on add to cart button
    Then product is added to shopping cart