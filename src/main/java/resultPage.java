import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class resultPage {
    WebDriver driver;
    public resultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    //locator
//    public void getLinks(By links) {
//        setLinks(links);
//    }

//    public WebElement setLinks(String query) {
//        return driver.findElement(By.partialLinkText(query));
//    }
}
