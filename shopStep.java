package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class shopStep {
    WebDriver driver;

    @Given("The user login successfully")
    public void the_user_login_successfully() {
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vipibe2340@biowey.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sritha@123");
        driver.findElement(By.xpath("//input[@name='login']")).click();
    }

    @When("User click shop link")
    public void user_click_shop_link() {
        driver.findElement(By.xpath("//a[text()='Shop']")).click();
    }

    @Then("User navigate to the shop page")
    public void user_navigate_to_the_shop_page() {
        String expectedTitle = "Products – Automation Practice Site";
        String actualTitle = driver.getTitle();
        if (!actualTitle.equals(expectedTitle)) {
            throw new AssertionError("Expected Title = " + expectedTitle + " But got = " + actualTitle);
        }
        System.out.println("Actual Title is : " +actualTitle);
    }

    @And("User get the productNames")
    public void userGetTheProductNames() {
        List<WebElement> products = driver.findElements(By.cssSelector(".products .product .woocommerce-loop-product__title"));
        for (WebElement product : products) {
            String productName = product.findElement(By.className("woocommerce-loop-product__title")).getText();
            String productPrice = product.findElement(By.className("woocommerce-Price-amount")).getText();
            System.out.println("Product Name = " + productName + " | Price = " + productPrice);
            driver.quit();
        }
    }
}
