@test
@Add
Feature: As a user, I want to add new record

  Scenario: Add Record  with valid credentials
   //Given Web Tables page is open
    And  I click on add button
    Then assert that registration form is open
    And I type "Gevorg" as First Name
    And I type "Khachatryan" as Last Name
    And I type "tesvan123@gmail.com"  as Email
    And I type "16"  as Age
    And I type "200000"  as Salary
    And I type "aaaaaaaaaaaaaa"  as Department
    And I click on Submit Button


   Scenario: Submit Record without credentials
    Given WebTables Page is open
    And  I click on add button
    And  I click on Submit Button
    Then assert that registration form is open

