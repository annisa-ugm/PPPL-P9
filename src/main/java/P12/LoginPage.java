package P12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By inputNameField = By.cssSelector("[data-qa='signup-name']");
    By inputEmailField = By.cssSelector("[data-qa='signup-email']");
    By signUpButton = By.cssSelector("[data-qa='signup-button']");

    public void setInputNameField(String query) {
        driver.findElement(inputNameField).sendKeys(query);
    }

    public void setInputEmailField(String query) {
        driver.findElement(inputEmailField).sendKeys(query);
    }

    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }
}
