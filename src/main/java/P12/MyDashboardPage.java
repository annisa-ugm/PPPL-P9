package P12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyDashboardPage {
    WebDriver driver;
    public MyDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By loggedInAsText = By
            .xpath("//a[i[contains(@class, 'fa-user')]]");

    By deleteAccountButton = By.cssSelector("a[href='/delete_account']");

    public String getLoggedInAsText() {
        return driver.findElement(loggedInAsText).getText();
    }

    public void clickDeleteAccountButton() {
        driver.findElement(deleteAccountButton).click();
    }

}
