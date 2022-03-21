@test
@delete
Feature: As a user, I want to delete record

  Scenario: Create new record and Delete it
    And  I click on add button
    Then assert that registration form is open
    And I type "Gevorg" as First Name
    And I type "Khachatryan" as Last Name
    And I type "tesvan123@gmail.com"  as Email
    And I type "16"  as Age
    And I type "200000"  as Salary
    And I type "aaaaaaaaaaaaaa"  as Department
    And I click on Submit Button
    And I click on delete button


