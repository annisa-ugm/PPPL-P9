import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import javax.swing.*;

public class GoogleTest {
    @Test
    public void startingTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com");
//        driver.getCurrentUrl();
        String title = driver.getTitle();

        //locate
        WebElement queryInput = driver.findElement(By.id("sb_form_q"));
        WebElement form = driver.findElement(By.id("sb_form"));

        //interaction
        queryInput.sendKeys("Revandra");
        form.submit();

//        Action action = new Action(driver);
//        action.click(input)

//        System.out.println(title);
//        driver.quit();
    }

    @Test
    public void startingTestDtediChrome(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://sv.ugm.ac.id/departemen-teknik-elektro-dan-informatika-dtedi/");
        String title = driver.getTitle();
        System.out.println(title);
        Assertions.assertEquals("Departemen Teknik Elektro dan " +
                "Informatika (DTEDI) - Sekolah Vokasi UGM", title);
        driver.quit();
    }

    @Test
    public void startingTestDtediEdge(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://sv.ugm.ac.id/departemen-teknik-elektro-dan-informatika-dtedi/");
        String title = driver.getTitle();
        System.out.println(title);
        Assertions.assertEquals("Departemen Teknik Elektro dan " +
                "Informatika (DTEDI) - Sekolah Vokasi UGM", title);
        driver.quit();
    }

    @Test
    public void login(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        //locate
        WebElement queryInputUsername = driver.findElement(By.id("user-name"));
        WebElement queryInputPassword = driver.findElement(By.id("password"));

        //interaction
        queryInputUsername.sendKeys("error_user");
        queryInputPassword.sendKeys("secret_sauce");

        WebElement klikLogin = driver.findElement(By.id("login-button"));
        klikLogin.click();

        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);

        WebElement textProduk = driver.findElement(By.className("title"));
        String teks = textProduk.getText();
        Assertions.assertEquals("Products", teks);

        Assertions.assertEquals("Swag Labs", title);
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", url);

        WebElement klikAddToCart = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        klikAddToCart.click();

        WebElement klikCart = driver.findElement(By.className("shopping_cart_link"));
        klikCart.click();

    }

    @Test
    public void testGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://bing.com/");
        searchPage lamanPencarian = new searchPage(driver);
        lamanPencarian.setSearchBar("revandra");
        lamanPencarian.formSubmit();
        resultPage result = new resultPage(driver);
        //assert
        Assertions.assertTrue(result.getTitle().contains("revandra"));
//        result.getTitle();
    }

    @Test
    public void testGoogleNoValue() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://bing.com/");
        searchPage lamanPencarian = new searchPage(driver);
        lamanPencarian.setSearchBar("");
        lamanPencarian.formSubmit();
    }
}


