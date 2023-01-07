package tests.StepDefinitionsSaucedemo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class AddItemStepdef {

    WebDriver driver;
    @Given("I launch chrome browser")
    public void  i_launch_chrome_browser(){
        System.setProperty("webdriver.chrome.driver", "D:/Skolan/AAA-AT/projects/final-projekt/project3/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I open Saucedemo homepage")
    public void i_open_saucedemo_homepage() {
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Then("I fill in username")
    public void i_fill_in_username() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("I fill in password")
    public void i_fill_in_password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("I click one login")
    public void i_click_one_login() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("I verify that i am on the products page")
    public void i_verify_that_i_am_on_the_products_page() {
        String title = driver.getTitle();
        System.out.println(title);
        assertTrue(title.contains("Swag Labs"));

    }

    @And("I click one item")
    public void i_click_one_item() {

    }

    @And("I verify that the page shows the item")
    public void i_verify_that_the_page_shows_the_item() {

    }

    @And("I click add to the card")
    public void i_click_add_to_the_card() {

    }
    @And("I verify that item is in the card")
    public void i_verify_that_item_is_in_the_card() {

    }

    @And("close browser")
    public void close_browser() {

    }







}
