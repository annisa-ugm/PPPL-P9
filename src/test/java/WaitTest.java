import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTest {
    @Test
    public void waitTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.rockstargames.com/VI");
        WebElement elementToTest = driver.findElement(By.xpath("/html/"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
//        wait.until(ExpectedConditions.elementToBeClickable())
//        driver.findElement(By.xpath("/html/"))
//        driver.findElement(By.id("login-button")).click();
        WebElement errorMessage = driver.findElement(By.partialLinkText("required"));
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(errorMessage));
    }

    @Test
    public void firstTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        WebElement addButton = driver.findElement(By.id("add_btn"));
        addButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("row2")));
        WebElement row2 = driver.findElement(By.id("row2"));
        Assertions.assertTrue(row2.isDisplayed(), "Row 2 should be displayed after click add button");

        driver.quit();
    }

    @Test
    public void thirdTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        WebElement editButtonRow1 = driver.findElement(By.id("edit_btn"));
        editButtonRow1.click();

        WebElement queryInputRow1 = driver.findElement(By
                .xpath("/html/body/div/div/section/section/div/div[1]/div/input"));
        queryInputRow1.clear();

        queryInputRow1.sendKeys("Pizza");
        WebElement saveButtonRow1 = driver.findElement(By.id("save_btn"));
        saveButtonRow1.click();

        String getQueryInputRow1 = queryInputRow1.getAttribute("value");
        Assertions.assertEquals("Pizza", getQueryInputRow1);

        driver.quit();
    }

    @Test
    public void fourthTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        WebElement addButton = driver.findElement(By.id("add_btn"));
        addButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean instructionGone = wait.until(
                ExpectedConditions.invisibilityOfElementLocated(By
                        .xpath("/html/body/div/div/section/section/p[2]"))
        );

        Assertions.assertTrue(instructionGone);
        driver.quit();
    }


    @Test
    public void fifthTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        WebElement addButton = driver.findElement(By.id("add_btn"));
        addButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("row2")));

        WebElement row2 = driver.findElement(By.id("row2"));
        Assertions.assertTrue(row2.isDisplayed(), "Row 2 should be displayed after wait for 3s");
        driver.quit();
    }
}
