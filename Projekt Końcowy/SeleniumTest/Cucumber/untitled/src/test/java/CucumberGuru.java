package junit;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.After;


public class CucumberGuru {
    private WebDriver driver;

    @Given("User is on the Guru99 login page")
    public void userIsOnLoginPage () {
        System.setProperty("webdriver.chrome.driver", "C://Users//przem//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V1/");
    }

    @When("User enters username {string} and password {string}")
    public void userEntersUsernameAndPassword (String username, String password){
        WebElement loginField = driver.findElement(By.name("uid"));
        loginField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
    }

    @When("User clicks the login button")
    public void userClicksLoginButton () {
        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        loginButton.click();
    }

    @Then("User should see the message {string}")
    public void userShouldSeeMessage (String expectedMessage){
        WebElement welcomeMessage = driver.findElement(By.tagName("marquee"));
        String messageText = welcomeMessage.getText();
        assertTrue(messageText.contains(expectedMessage));
    }

    @After
    public void closeBrowser () {
        driver.quit();
    }
}
