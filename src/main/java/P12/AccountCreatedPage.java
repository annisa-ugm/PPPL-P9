package P12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPage {
    WebDriver driver;
    public AccountCreatedPage(WebDriver driver) {
        this.driver = driver;
    }

    By accountCreatedText = By.cssSelector("[data-qa='account-created'] b");
    By continueButton = By.cssSelector("[data-qa='continue-button']");

    public String getAccountCreatedText() {
        return driver.findElement(accountCreatedText).getText();
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }
}
