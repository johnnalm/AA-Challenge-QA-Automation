Feature: Park Calculations

Background:
  Given I go to Parking cost Calculator Page


  Scenario: An user will calculate the valet parking costs
    When I select 'Valet Parking' Option
    And I put the Entry date '5/30/2021'
    And I put the Leaving date '5/30/2021'
    And I put '1:00' into the leaving time
    And I click on calculate button
    Then I should see the right amount for 1 hour and 'Valet Parking' option


  Scenario: An user will calculate the Short-Term Parking
    When I select 'Short-Term Parking' Option
    And I put the Entry date '5/30/2021'
    And I put the Leaving date '5/30/2021'
    And I put '1:00' into the leaving time
    And I click on calculate button
    Then I should see the right amount for 1 hour and 'Short-Term Parking' option

  Scenario: An user will calculate the Economy Parking
    When I select 'Economy Parking' Option
    And I put the Entry date '5/30/2021'
    And I put the Leaving date '5/30/2021'
    And I put '1:00' into the leaving time
    And I click on calculate button
    Then I should see the right amount for 1 hour and 'Economy Parking' option

Scenario: An User Will calculate valet parking with PM Hours
  When I select 'Valet Parking' Option
  And I put the Entry date '5/30/2021'
  And I put the Leaving date '5/30/2021'
  And I put '1:00' into the leaving time
  And I switch to PM time in leaving time
  And I click on calculate button
  Then I check the Values in the leaving time
