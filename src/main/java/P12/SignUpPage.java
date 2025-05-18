package P12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    WebDriver driver;
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    By inputRadioGender = By.id("id_gender1");
    By inputPasswordField = By.id("password");
    By inputDropdownDay = By.id("days");
    By inputDropdownMonth = By.id("months");
    By inputDropdownYear = By.id("years");
    By inputCheckboxNews = By.id("newsletter");
    By inputCheckboxOptin = By.id("optin");
    By inputFirstNameField = By.id("first_name");
    By inputLastNameField = By.id("last_name");
    By inputCompanyField = By.id("company");
    By inputAddress1Field = By.id("address1");
    By inputAddress2Field = By.id("address2");
    By inputDropdownCountry = By.id("country");
    By inputStateField = By.id("state");
    By inputCityField = By.id("city");
    By inputZipCodeField = By.id("zipcode");
    By inputMobileNumberField = By.id("mobile_number");
    By createAccountButton = By.cssSelector("[data-qa='create-account']");

    public void clickRadioGender() {
        driver.findElement(inputRadioGender).click();
    }

    public void setInputPasswordField(String query) {
        driver.findElement(inputPasswordField).sendKeys(query);
    }

    private void selectDropdownByValue(By locator, String value) {
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }

    public void setInputDropdownDay(String value) {
        selectDropdownByValue(inputDropdownDay, value);
    }

    public void setInputDropdownMonth(String value) {
        selectDropdownByValue(inputDropdownMonth, value);
    }

    public void setInputDropdownYear(String value) {
        selectDropdownByValue(inputDropdownYear, value);
    }

    public void scrollToCompanyField() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(inputCompanyField)).perform();
    }

    public void setInputCheckboxNews() {
        driver.findElement(inputCheckboxNews).click();
    }

    public void setInputCheckboxOptin() {
        driver.findElement(inputCheckboxOptin).click();
    }

    public void setInputFirstNameField(String query) {
        driver.findElement(inputFirstNameField).sendKeys(query);
    }

    public void setInputLastNameField(String query) {
        driver.findElement(inputLastNameField).sendKeys(query);
    }

    public void setInputCompanyField(String query) {
        driver.findElement(inputCompanyField).sendKeys(query);
    }

    public void setInputAddress1Field(String query) {
        driver.findElement(inputAddress1Field).sendKeys(query);
    }

    public void setInputAddress2Field(String query) {
        driver.findElement(inputAddress2Field).sendKeys(query);
    }

    public void setInputDropdownCountry(String value) {
        selectDropdownByValue(inputDropdownCountry, value);
    }

    public void setInputStateField(String query) {
        driver.findElement(inputStateField).sendKeys(query);
    }

    public void setInputCityField(String query) {
        driver.findElement(inputCityField).sendKeys(query);
    }

    public void setInputZipCodeField(String query) {
        driver.findElement(inputZipCodeField).sendKeys(query);
    }

    public void setInputMobileNumberField(String query) {
        driver.findElement(inputMobileNumberField).sendKeys(query);
    }

    public void clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
    }


}
