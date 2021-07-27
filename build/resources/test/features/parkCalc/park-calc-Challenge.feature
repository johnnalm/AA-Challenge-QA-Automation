Feature: Park Calculator


  @TC1-Valet-Parking-Calculation
  Scenario: A user will calculate the valet parking costs
    Given I go to Parking cost Calculator Page
    When I select Valet Parking Option
    And I put the Entry date in the actual date
    And I put the Leaving date in the actual date
    And I put 1:00 into the leaving date
    And I click on calculate button
    Then I should see the right amount calculated