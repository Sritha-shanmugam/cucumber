package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginStep {
    WebDriver driver;
    @Given("I go to practice automation site")
    public void i_go_to_practice_automation_site() {
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");

    }
    @When("I enter valid mail and password")
    public void i_enter_valid_mail_and_password() {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vipibe2340@biowey.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sritha@123");
    }
    @Then("I click remember me button")
    public void i_click_remember_me_button() {
        driver.findElement(By.id("rememberme")).click();

    }
    @Then("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.xpath("//input[@name='login']")).click();
        driver.quit();

    }

}
