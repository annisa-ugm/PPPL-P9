package P12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage {
    WebDriver driver;
    public DeleteAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    By accountDeletedText = By.cssSelector("[data-qa='account-deleted']");
    By continueButton = By.cssSelector("[data-qa='continue-button']");

    public String getAccountDeletedText() {
        return driver.findElement(accountDeletedText).getText();
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }
}
