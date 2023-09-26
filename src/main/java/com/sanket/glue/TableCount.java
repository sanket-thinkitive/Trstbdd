package com.sanket.glue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TableCount {

    public static void main(String[] args) throws Throwable {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://qa.trsthealth.com/login");
        driver.findElement(By.id("mui-1")).sendKeys("super_admin");
        driver.findElement(By.id("outlined-adornment-password")).sendKeys("Super1@trst");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        Thread.sleep(2000);
        WebElement tableElement= driver.findElement(By.xpath("//table[@class='MuiTable-root MuiTable-stickyHeader css-wrn5l5']"));
        //System.out.println(tableElement);
        List<WebElement> rows=tableElement.findElements(By.tagName("tr"));
        int rowsize= rows.size()-1;
        System.out.println(rowsize);


    }
}
