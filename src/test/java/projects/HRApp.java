package projects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestBase;

public class HRApp extends TestBase {

    @Test
    public void validUserValidPassLogin() {

        driver.get(ConfigReader.getProperty("HRAppURL"));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Mindtek");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("MindtekStudent");
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

    }

    @Test
    public void invalidUserInvalidPassLogin() {

        driver.get(ConfigReader.getProperty("HRAppURL"));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Mindtekkk67");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mindtekstudent");
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
    }
}
