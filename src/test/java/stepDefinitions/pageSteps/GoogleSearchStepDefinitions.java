package stepDefinitions.pageSteps;

import io.cucumber.java8.*;
import pageObjects.Pages;
import stepDefinitions.sharedObjects.Context;

public class GoogleSearchStepDefinitions implements En {
    public GoogleSearchStepDefinitions(Context context, Pages pages) {

        When("^I search for \"([^\"]*)\"$", (String searchedString) -> {
            pages.googleSearchPage.searchForString(searchedString);
        });
    }
}
