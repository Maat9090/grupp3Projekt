
Feature:Sandbox Add item
  Scenario: Add item to the card
    Given I launch chrome browser
    When I open sandbox homepage
    Then I click on products
    And I verify that i am on the products page
    And I click one item
    And I verify that the page shows the item
    And I click add to the card
    And I verify that item is in the card
    And close browser
