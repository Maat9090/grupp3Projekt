package tests.StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SandboxStepdefs {

    WebDriver driver;
    @Given("I launch chrome browser")
    public void  i_launch_chrome_browser(){
        System.setProperty("webdriver.chrome.driver", "D:/Skolan/AAA-AT/projects/final-projekt/project3/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I open sandbox homepage")
    public void  i_open_sandbox_homepage(){
        driver.manage().window().maximize();
        driver.get("https://scar.sandbox.iceberry.se/v.0.3.0/#/");

    }

    @Then("I click on products")
    public void  i_click_on_products(){

    }

    @And("I verify that i am on the products page")
    public void i_verify_that_i_am_on_the_products_page(){

    }

    @And("I click one item")
    public void  i_click_one_item(){

    }

    @And("I verify that the page shows the item")
    public void  i_verify_that_the_page_shows_the_item(){

    }

    @And("I click add to the card")
    public void  i_click_add_to_the_card(){

    }

    @And("I verify that item is in the card")
    public void  i_verify_that_item_is_in_the_card(){

    }

    @And("I logout")
    public void i_logout(){
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
    }


    @And("Close browser")
    public void  close_browser(){
        driver.quit();

    }


}
