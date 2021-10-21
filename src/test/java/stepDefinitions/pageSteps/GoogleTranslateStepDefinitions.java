package stepDefinitions.pageSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;
import pageObjects.Pages;
import stepDefinitions.sharedObjects.Context;

public class GoogleTranslateStepDefinitions implements En {
    public GoogleTranslateStepDefinitions(Context context, Pages pages) {

        When("^I translate \"([^\"]*)\" from \"([^\"]*)\" to \"([^\"]*)\"$", (String stringToTranslate, String langBasic, String langTranslated) -> {
            pages.googleTranslatePage.translateFromTo();
        });

    }
}
