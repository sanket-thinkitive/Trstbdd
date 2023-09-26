package com.sanket.glue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class Patient {
    WebDriver driver= new FirefoxDriver();
    @Given("user opens browser and navigates {string} url and enters {string} username and {string} password")
    public void user_opens_browser_and_navigates_url_and_enters_username_and_password(String url, String username, String password) throws Throwable {
        driver.get(url);
        driver.findElement(By.id("mui-1")).sendKeys(username);
        driver.findElement(By.id("outlined-adornment-password")).sendKeys(password);
        Thread.sleep(3000);
    }
    @When("Clicks on SignInbutton")
    public void clicks_on_sign_inbutton()  {

        driver.findElement(By.xpath("//button[text()='Sign In']")).click();

    }
    @And("clicks on Add patient button")
    public void clicks_on_add_patient_button() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Add Patient']")).click();

    }
    @And("add {string} Firstname and {string} lastname and {string} dob and {string} email and {string} phonenumber")
    public void add_firstname_and_lastname_and_dob_and_email_and_phonenumber(String Firstname, String lastname, String dob, String email, String phonenumber) throws Throwable {
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(Firstname);
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(lastname);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        driver.findElement(By.id("mui-5")).sendKeys(dob);
        driver.findElement(By.xpath("//input[@placeholder='91'][1]")).sendKeys("91");
        driver.findElement(By.xpath("//input[@id='phone-number']")).sendKeys(phonenumber);
        Thread.sleep(3000);
    }
   /* @When("selects gender and Maritalstatus and provider")
    public void selects_gender_and_maritalstatus_and_provider() throws Throwable {
        driver.findElement(By.xpath("//input[@name='maritalStatus']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1qlw4eg'][1]")).click();
    }*/
    @And("clicks on next and next and next and next and next and next and Finish")
    public void clicks_on_next_and_next_and_next_and_next_and_next_and_next_and_finish() {
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        driver.findElement(By.xpath("//button[text()='Finish']")).click();

    }
    @Then("patient should be added successfully and displayed")
    public void patient_should_be_added_successfully_and_displayed() {
        String s1= driver.getCurrentUrl();
        System.out.println(s1);

    }


}
