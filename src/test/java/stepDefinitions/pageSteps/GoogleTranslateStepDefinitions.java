package stepDefinitions.pageSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleTranslateStepDefinitions {

    @When("I translate {string} from {string} to {string}")
    public void iTranslateFromTo(String stringToTranslate, String languageToTranslate, String languageTranslated) {
    }

    @Then("The {string} translation of {string} to {string} is displayed")
    public void theTranslationIsDisplayed(String languageTranslated, String stringToTranslate, String stringTranslated) {
    }
}
