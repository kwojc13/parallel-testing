package stepDefinitions.pageSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.sharedObjects.Context;
import io.cucumber.java8.*;

public class SharedStepDefinitions implements En {
    public SharedStepDefinitions(Context context) {

        Given("^I go to the \"([^\"]*)\" page$", (String pageName) -> {
            context.driver.get(pageName);
            //sleeps are not functional, i want to see the page for a while
            Thread.sleep(1000);
            if (pageName.equals("https://google.com")) {
                WebElement consentButton = context.driver.findElement(By.xpath("//div[contains(text(), 'Zgadzam')]"));
                consentButton.click();
            } else {
                WebElement consentButton = context.driver.findElement(By.xpath("//button//span[contains(text(), 'agree')]"));
                consentButton.click();
            }
            Thread.sleep(3000);
        });

    }
}
