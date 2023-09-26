package com.sanket.glue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddUser {

        WebDriver driver=new FirefoxDriver();
        @Given("user opens browser and navigates {string} url and enters {string} and {string}")
        public void user_opens_browser_and_navigates_url_and_enters_and(String url, String username, String password) {
                driver.get(url);
                driver.findElement(By.id("mui-1")).sendKeys(username);
                driver.findElement(By.id("outlined-adornment-password")).sendKeys(password);
        }
        @And("Clicks on Sign In button")
        public void clicks_on_sign_in_button() {
                driver.findElement(By.xpath("//button[text()='Sign In']")).click();

        }
        @When("user clicks on user option and Add user button")
        public void user_clicks_on_user_option_and_add_user_button() throws Throwable {
                Thread.sleep(3000);
                driver.findElement(By.xpath("//p[text()='User']")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//button[text()='Add User']")).click();

        }
        @And("enters {string} firstname and {string} lastname and {string} phonenumber")
        public void enters_firstname_and_lastname_and_phonenumber(String firstname, String lastname, String phonenumber) {
                driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
                driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
                driver.findElement(By.xpath("//input[@placeholder='91']")).sendKeys("91");
                driver.findElement(By.xpath("//input[@id='phone-number']")).sendKeys(phonenumber);
        }
        @And("enters {string} email and {string} dob and clicks on save button")
        public void enters_email_and_dob_and_clicks_on_save_button(String email, String dob ) throws InterruptedException {
                driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
                driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).sendKeys(dob);
                driver.findElement(By.xpath("//button[text()='Save']")).click();
                Thread.sleep(3000);

        }
        @Then("user should be added successfully")
        public void user_should_be_added_successfully() throws Throwable {
              //  WebElement element=driver.findElement(By.xpath("//div[text()='User added.']"));
                WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[text()='User added.']"))));
                Thread.sleep(2000);
                driver.quit();

        }

}
