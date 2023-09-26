package com.sanket.glue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

    WebDriver driver= new FirefoxDriver();
    @Given("user opens browser and navigates {string} url")
    public void user_opens_browser_and_navigates_url(String url) {

        driver.get(url);
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        driver.findElement(By.id("mui-1")).sendKeys(username);
        driver.findElement(By.id("outlined-adornment-password")).sendKeys(password);
    }
    @And("user clicked on login button")
    public void user_clicked_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
    }
    @Then("user should be logged in and dashboard page should be displayed")
    public void user_should_be_logged_in_and_dashboard_page_should_be_displayed() throws Throwable {
        Thread.sleep(2000);
        String s1=driver.getCurrentUrl();
        String s2="https://qa.trsthealth.com/patient";
        Assert.assertEquals(s1,s2);
    }
}
