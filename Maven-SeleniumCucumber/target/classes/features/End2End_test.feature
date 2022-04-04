Feature: Automated End2End Test

  Scenario: Customer place an order by purchasing an item from search
    Given user is on homepage
    And he search for "<productName>"
    And choose to add two items and move to shoppingcart
    And move to checkout page and enter personal deatails "<fname>","<lname>","<email>","<country>","<city>","<address>","<zipcode>","<phonenumber>"
    Then he can view the order and download the invoice

    Examples:
      |productName              | fname | lname | email         |country | city|address |zipcode|phonenumber|
      |Apple MacBook Pro 13-inch| salma | ahmed |salmahmed@gmail.com|Egypt   |cairo|downtown|62511  |01020679625|
