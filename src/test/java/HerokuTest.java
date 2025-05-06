import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HerokuTest {
    @Test
    public void hoverTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/hovers']"));
        hoverLink.click();

        WebElement firstImage = driver.findElement(By.xpath("(//div[@class='figure'])[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(firstImage).perform();

        WebElement nameText = driver.findElement(By.xpath("(//div[@class='figure'])[1]//h5"));
        String displayedName = nameText.getText();
        System.out.println(displayedName);

        Assertions.assertEquals("name: user1", displayedName);
    }

    @Test
    public void dragAndDropTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/drag_and_drop']"));
        hoverLink.click();

        WebElement columnA = driver.findElement(By.id("column-a"));
        WebElement columnB = driver.findElement(By.id("column-b"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(columnA).moveToElement(columnB).release().build().perform();

    }

    @Test
    public void keyPressesTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/key_presses']"));
        hoverLink.click();

        WebElement target = driver.findElement(By.id("target"));
        WebElement result = driver.findElement(By.id("result"));

        Actions actions = new Actions(driver);
        actions.sendKeys(target, Keys.ESCAPE).perform();

        String resultText = result.getText();
        System.out.println(resultText);

        Assertions.assertEquals("You entered: ESCAPE", resultText);
    }
}
