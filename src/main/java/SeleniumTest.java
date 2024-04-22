import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

    private static final Logger log = LogManager.getLogger(SeleniumTest.class);
    private WebDriver driver;

    @Before
    public void setUp() {
        // Configure Log4j
        System.setProperty("log4j.configurationFile", "log4j2.xml");

        // Initialize logger
        log.info("Initializing WebDriver...");
        driver = new FirefoxDriver();
        log.info("WebDriver initialized successfully.");
    }

    @Test
    public void login() {
        driver.get("https://www.saucedemo.com/");
        log.info("Navigated to the login page");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        log.info("Login button clicked");

        // Additional test steps...

        driver.quit();
        log.info("Browser closed");
    }
}
