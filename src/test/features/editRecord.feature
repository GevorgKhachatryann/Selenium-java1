@test
@edit
Feature: As a user, I want to edit record
  Scenario: Edit second Record First Name
  //Given Web Tables page is open
    And   I click on edit button
    And   I clear First Name box
    And   I type "Tesvan" as First Name
    And   I click on Submit Button
    Then  assert that First Name changed


  Scenario: Edit First Name without click submit button
    And   I click on edit button
    And   I clear First Name box
    And   I type "Tesvan" as First Name
    Then assert that First Name has remained the same