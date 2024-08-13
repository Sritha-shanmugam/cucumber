package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerStep {
    WebDriver driver;
    @Given("User go to practice automation testing site")
    public void user_go_to_practice_automation_testing_site() {
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");
    }
    @When("User enter email and password")
    public void user_enter_email_and_password() {
        driver.findElement(By.xpath("//input[@class='woocommerce-Input woocommerce-Input--text input-text'][@name='email']")).sendKeys("vipibe2340@biowey.com");
        driver.findElement(By.xpath("//input[@class='woocommerce-Input woocommerce-Input--text input-text'][@id='reg_password']")).sendKeys("Sritha@123");

    }
    @Then("User click register button")
    public void user_click_register_button() {
        driver.findElement(By.xpath("//input[@value='Register'][@name='register']")).click();

    }


}
