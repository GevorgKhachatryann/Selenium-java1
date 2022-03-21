package stepDefinitions;

import POM.Seleniumeasy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class deleteSteps {
    @And("^I click on delete button$")
    public void iClickOnDeleteButton() {
        Seleniumeasy.deleteRecord();
    }
  
}
