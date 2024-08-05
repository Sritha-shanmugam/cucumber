package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinitions {
    WebDriver driver;

    @Given("^User is entering google.co.in$")
    public void openGoogle() {
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        //etProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
    }

    @When("^User is typing the search term \"([^\"]*)\"$")
    public void user_is_typing_the_search_term(String searchTerm) {
        driver.findElement(By.name("q")).sendKeys(searchTerm);
    }

    @And("^enters the return key$")
    public void entersTheReturnKey() {
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }

    @Then("^the user should see the search results$")
    public void theUserShouldSeeTheSearchResults() {
        boolean status = driver.findElement(By.id("search")).isDisplayed();
        if (status) {
            System.out.println("Results Displayed");
        } else {
            System.out.println("No Results Displayed");
        }

    }
}
