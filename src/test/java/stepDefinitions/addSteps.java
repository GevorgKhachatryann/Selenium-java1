package stepDefinitions;

import BaseClass.BaseClass;
import POM.Seleniumeasy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;


public class addSteps    {
  /*  public addSteps(BaseClass base) {
        super(base);
    }*/

    /*@Given("^Web Tables page is open$")
       public void webTablesPageIsOpen() {
          super.visit();
    }*/
    @And("^I click on add button$")
    public void iClickOnAddButton() {
        Seleniumeasy.addRecord();
    }
    @Then("^assert that registration form is open$")
    public void assertThatRegistrationFormIsOpen() {
        Seleniumeasy.RegistrationForm();
    }

    @And("^I type \"([^\"]*)\" as First Name$")
    public void enterFirstName(String firstname){
        Seleniumeasy.firstNameInput(firstname);
    }
    @And("^I type \"([^\"]*)\" as Last Name$")
    public void enterLastName(String lastname){
        Seleniumeasy.lastNameInput(lastname);
    }
    @And("^I type \"([^\"]*)\"  as Email$")
    public void enterEmail(String email123){
        Seleniumeasy.typeEmail(email123);
    }
    @And("^I type \"([^\"]*)\"  as Age$")
    public void enterAge(String sixteen){
        Seleniumeasy.typeAge(sixteen);
    }
    @And("^I type \"([^\"]*)\"  as Salary$")
    public void enterSalary(String salary1){
        Seleniumeasy.typeSalary(salary1);
    }
    @And("^I type \"([^\"]*)\"  as Department$")
    public void enterDepartment(String department1){
        Seleniumeasy.typeDepartment(department1);
    }


    @And("^I click on Submit Button$")
    public void iClickOnSubmitButton() {
        Seleniumeasy.clickSubmitBtn();
    }

    @Given("^WebTables Page is open$")
    public void webTablesPageIsOpen() {
         Seleniumeasy.assertText();
    }
}
