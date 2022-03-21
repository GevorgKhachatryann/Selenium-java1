package stepDefinitions;

import POM.Seleniumeasy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class editSteps {
    @And("^I click on edit button$")
    public void iClickOnEditButton() {
        Seleniumeasy.clickEdit();
    }

    @And("^I clear First Name box$")
    public void iClearFirstNameBox() {
        Seleniumeasy.clearName();
    }

    @And("^I type \"([^\"]*)\" as new First Name$")
    public void newName(String newname1){
        Seleniumeasy.newName(newname1);
    }

    @Then("^assert that First Name changed$")
    public void assertThatFirstNameChanged() {
        Seleniumeasy.assertEditedName();
    }

    @Then("^assert that First Name has remained the same$")
    public void assertThatFirstNameHasRemainedTheSame() {
         Seleniumeasy.assertEditingName();
    }
}
