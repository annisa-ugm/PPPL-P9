package P12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By loginButton = By.cssSelector("a[href='/login']");

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }





}
