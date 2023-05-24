Feature: Login popup verification

  Background:
    Given I'm gonna use soft assertions

  @Login_Popup
  Scenario:Login popup shows after adding 20kg bag
    Given I navigate to Ryanair start page
    And I search for a return flight from "DUB" to "NPL" on available dates for 1 adult
    When I select the flights
    And I continue with Value fare
    And I continue with Value fare on upgrade popup
    And I click Login later on Select flight page
    And I fill data for one passenger with 'MR' title, 'Test' first name and 'Test' last name
    And I click Continue button
    And I choose the seats for 2 flights
    And I click Continue button
    And I skip the FastTrack popup
    And I choose 1 small cabin bag
    And I choose 20kg check-in bag
    And I click Continue button
    And I wait Fast Track block is displayed
    And I click Continue button
    And I wait Transfer Card block is displayed
    And I click Continue button
    Then Login popup shows up
    And I assert all verifications at once