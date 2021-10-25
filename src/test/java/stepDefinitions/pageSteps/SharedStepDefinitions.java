package stepDefinitions.pageSteps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.sharedObjects.Context;
import io.cucumber.java8.*;

import static com.codeborne.selenide.Selenide.$;

public class SharedStepDefinitions implements En {
    public SharedStepDefinitions(Context context) {

        Given("^I go to the \"([^\"]*)\" page$", (String pageName) -> {
            Selenide.open(pageName);
            //sleeps are not functional, i want to see the page for a while
            Selenide.sleep(1000);
            if (pageName.equals("https://google.com")) {
                SelenideElement consentButton = $(By.xpath("//div[contains(text(), 'Zgadzam')]"));
                consentButton.click();
            } else {
                SelenideElement consentButton = $(By.xpath("//button//span[contains(text(), 'agree')]"));
                consentButton.click();
            }
            Selenide.sleep(3000);
        });

    }
}
