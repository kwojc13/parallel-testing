package stepDefinitions.sharedObjects;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
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

    public Context() {
        setUpDriver();
    }

    @Before
    public void setUpDriver() {
        System.setProperty("chromeoptions.args", "--no-sandbox,--verbose,--whitelisted-ips='',--disable-dev-shm-usage,--disable-gpu");
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
        Configuration.startMaximized = false;
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("kill the chrome!");
        WebDriverRunner.closeWebDriver();
    }
}
