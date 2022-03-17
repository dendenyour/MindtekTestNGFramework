package projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HRLogOutPage {

    public HRLogOutPage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logOutButton;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement hrHomeLogIn;

}




