package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="input-email")
    WebElement emailAddressField;
    @FindBy(id="input-password")
    WebElement passwordField;
    @FindBy(css = "input[value='Login']")
    WebElement loginButton;

    public WebElement emailAddressField() {
        return emailAddressField;
    }
    public WebElement passwordField() {
        return passwordField;
    }
    public WebElement loginButton() {
        return loginButton;
    }
}
