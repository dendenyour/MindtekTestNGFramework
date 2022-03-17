package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class SauceLabsTests extends TestBase {


    @Test(groups = {"regression","smoke"})
    public void validateLoginTest(){

       driver.get(ConfigReader.getProperty("SauceLabsURL"));

       WebElement username= driver.findElement(By.id("user-name"));
       username.sendKeys("standard_user");
       WebElement pass= driver.findElement(By.id("password"));
       pass.sendKeys("secret_sauce");

       driver.findElement(By.id("login-button")).click();

       String actualPageHeader=driver.findElement(By.xpath("//span[@class='title']")).getText();
       String expectedPageHeader="PRODUCTS";

        Assert.assertEquals(actualPageHeader,expectedPageHeader);





    }
}
