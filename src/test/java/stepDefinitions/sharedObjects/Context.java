package stepDefinitions.sharedObjects;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Context {

    public WebDriver driver;

//    public Context() {
//        setUpDriver();
//    }

    @Before
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1295, 730));
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("kill the chrome!");
        try {
            if (scenario.isFailed()) {
                byte[] screenshot =
                        ((TakesScreenshot) driver)
                                .getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "The scenario " + scenario.getName() + " has failed.");
            }
        } finally {
            driver.close();
            driver.quit();
        }
    }
}
