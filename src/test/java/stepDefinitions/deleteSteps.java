package stepDefinitions;

import POM.Seleniumeasy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class deleteSteps {
    @And("^I click on delete button$")
    public void iClickOnDeleteButton() {
        Seleniumeasy.deleteRecord();
    }
    @Then("^assert that First Name deleted$")
    public void assertThatFirstNameDeleted() {
        Seleniumeasy.assertElementHasText();
    }
}
