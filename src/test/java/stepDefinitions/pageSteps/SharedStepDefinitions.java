package stepDefinitions.pageSteps;

import stepDefinitions.sharedObjects.Context;
import io.cucumber.java8.*;

public class SharedStepDefinitions implements En {
    public SharedStepDefinitions(Context context) {

        Given("^I go to the \"([^\"]*)\" page$", (String pageName) -> {
            context.driver.get(pageName);
            Thread.sleep(3000);
        });

    }
}
