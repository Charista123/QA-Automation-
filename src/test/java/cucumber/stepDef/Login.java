package cucumber.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import java.util.concurrent.TimeUnit;

public class Login {

    WebDriver driver;
    String baseUrl = "https://www.psegameshop.com/";

    @Given("open login page")
    public void openLoginPage() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @When("click icon user")
    public void clickIcon() {
        driver.findElement(By.className("icon-user")).click();
    }

    @When("input username")
    public void inputUsername() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use Duration.ofSeconds to create a Duration object
        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
        usernameField.sendKeys("charistagb22@gmail.com");
    }

    @When("input password")
    public void inputPassword() {
        driver.findElement(By.id("password")).sendKeys("Charista2201");
    }

    @When("input invalid password")
    public void inputInvalidPassword() {
        driver.findElement(By.id("password")).sendKeys("invalid_password");
    }

    @When("click login button")
    public void clickLoginButton() {
        driver.findElement(By.className("woocommerce-form-login__submit")).click();
    }

//    @Then("user is on the dashboard page")
//    public void userInDashboardPage() {
//        String successLogin = driver.findElement(By.id("logo")).getText();
//        Assert.assertEquals(successLogin, "PS Enterprise Gameshop - Indonesia's #1 Game Shop");
//    }

    @Then("user gets an error message")
    public void userGetErrorMessage() {
        String errorLogin = driver.findElement(By.className("woocommerce-error")).getText();
        Assert.assertTrue(errorLogin.contains("Error: The password you entered for the email address"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
