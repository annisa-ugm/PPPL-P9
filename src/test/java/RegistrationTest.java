import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {
    @Test
    public void firstTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");

        String getCurrentUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.automationexercise.com/test_cases", getCurrentUrl);
    }

    @Test
    public void secondTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("https://automationexercise.com/");

        String getCurrentUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://automationexercise.com/", getCurrentUrl);
    }

    @Test
    public void thirdTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        String homeTitle = driver.getTitle();
        System.out.println(homeTitle);
        Assertions.assertEquals("Automation Exercise", homeTitle);

    }

    @Test
    public void fourthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        String homeTitle = driver.getTitle();
        System.out.println(homeTitle);

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();
    }

    @Test
    public void fifthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement nameText = driver.findElement(By.xpath("(//div[@class='signup-form'])//h2"));
        String displayedName = nameText.getText();
        System.out.println(displayedName);
        Assertions.assertEquals("New User Signup!", displayedName);
    }

    @Test
    public void sixthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

    }

    @Test
    public void seventhTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();
    }

    @Test
    public void eighthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();

        WebElement title = driver.findElement(By.cssSelector("div.login-form h2 b"));

        String titleText = title.getText();
        System.out.println(titleText);
        Assertions.assertEquals("ENTER ACCOUNT INFORMATION", titleText);
    }

    @Test
    public void ninthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();

        WebElement radioInputTitle = driver.findElement(By.id("id_gender2"));
        radioInputTitle.click();

        WebElement queryInputPassword = driver.findElement(By.id("password"));
        queryInputPassword.sendKeys("choco101");

        WebElement dropdownInputDay = driver.findElement(By.id("days"));
        Select selectDay = new Select(dropdownInputDay);
        selectDay.selectByValue("5");

        WebElement dropdownInputMonth = driver.findElement(By.id("months"));
        Select selectMonth = new Select(dropdownInputMonth);
        selectMonth.selectByValue("2");

        WebElement dropdownInputYear = driver.findElement(By.id("years"));
        Select selectYear = new Select(dropdownInputYear);
        selectYear.selectByValue("2010");

    }

    @Test
    public void tenthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();

        WebElement radioInputTitle = driver.findElement(By.id("id_gender2"));
        radioInputTitle.click();

        WebElement queryInputPassword = driver.findElement(By.id("password"));
        queryInputPassword.sendKeys("choco101");

        WebElement dropdownInputDay = driver.findElement(By.id("days"));
        Select selectDay = new Select(dropdownInputDay);
        selectDay.selectByValue("5");

        WebElement dropdownInputMonth = driver.findElement(By.id("months"));
        Select selectMonth = new Select(dropdownInputMonth);
        selectMonth.selectByValue("2");

        WebElement dropdownInputYear = driver.findElement(By.id("years"));
        Select selectYear = new Select(dropdownInputYear);
        selectYear.selectByValue("2010");

        WebElement checkboxNews = driver.findElement(By.id("newsletter"));
        WebElement company = driver.findElement(By.id("company"));
        Actions actions = new Actions(driver);
        actions.moveToElement(company).perform();

        checkboxNews.click();

    }

    @Test
    public void eleventhTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();

        WebElement radioInputTitle = driver.findElement(By.id("id_gender2"));
        radioInputTitle.click();

        WebElement queryInputPassword = driver.findElement(By.id("password"));
        queryInputPassword.sendKeys("choco101");

        WebElement dropdownInputDay = driver.findElement(By.id("days"));
        Select selectDay = new Select(dropdownInputDay);
        selectDay.selectByValue("5");

        WebElement dropdownInputMonth = driver.findElement(By.id("months"));
        Select selectMonth = new Select(dropdownInputMonth);
        selectMonth.selectByValue("2");

        WebElement dropdownInputYear = driver.findElement(By.id("years"));
        Select selectYear = new Select(dropdownInputYear);
        selectYear.selectByValue("2010");


        WebElement checkboxNews = driver.findElement(By.id("newsletter"));
        WebElement company = driver.findElement(By.id("company"));
        Actions actions = new Actions(driver);
        actions.moveToElement(company).perform();

        checkboxNews.click();

        WebElement checkboxOptin = driver.findElement(By.id("optin"));
        checkboxOptin.click();
    }

    @Test
    public void twelfthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();

        WebElement radioInputTitle = driver.findElement(By.id("id_gender2"));
        radioInputTitle.click();

        WebElement queryInputPassword = driver.findElement(By.id("password"));
        queryInputPassword.sendKeys("choco101");

        WebElement dropdownInputDay = driver.findElement(By.id("days"));
        Select selectDay = new Select(dropdownInputDay);
        selectDay.selectByValue("5");

        WebElement dropdownInputMonth = driver.findElement(By.id("months"));
        Select selectMonth = new Select(dropdownInputMonth);
        selectMonth.selectByValue("2");

        WebElement dropdownInputYear = driver.findElement(By.id("years"));
        Select selectYear = new Select(dropdownInputYear);
        selectYear.selectByValue("2010");


        WebElement checkboxNews = driver.findElement(By.id("newsletter"));
        WebElement company = driver.findElement(By.id("company"));
        Actions actions = new Actions(driver);
        actions.moveToElement(company).perform();

        checkboxNews.click();

        WebElement checkboxOptin = driver.findElement(By.id("optin"));
        checkboxOptin.click();

        WebElement queryInputFirstName = driver.findElement(By.id("first_name"));
        WebElement queryInputLastName = driver.findElement(By.id("last_name"));
        WebElement queryInputCompany = driver.findElement(By.id("company"));
        WebElement queryInputAddress1 = driver.findElement(By.id("address1"));
        WebElement queryInputAddress2 = driver.findElement(By.id("address2"));
        WebElement dropdownInputCountry = driver.findElement(By.id("country"));
        WebElement queryInputState = driver.findElement(By.id("state"));
        WebElement queryInputCity = driver.findElement(By.id("city"));
        WebElement queryInputZipCode = driver.findElement(By.id("zipcode"));
        WebElement queryInputMobileNumber = driver.findElement(By.id("mobile_number"));

        queryInputFirstName.sendKeys("Choco");
        queryInputLastName.sendKeys("Cheese");
        queryInputCompany.sendKeys("Aice");
        queryInputAddress1.sendKeys("Ontario Street");
        queryInputAddress2.sendKeys("Columbia Street");
        Select selectCountry = new Select(dropdownInputCountry);
        selectCountry.selectByValue("Canada");
        queryInputState.sendKeys("America");
        queryInputCity.sendKeys("Ontario");
        queryInputZipCode.sendKeys("91743");
        queryInputMobileNumber.sendKeys("+1 805 806 9243");

    }

    @Test
    public void thirteenthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();

        WebElement radioInputTitle = driver.findElement(By.id("id_gender2"));
        radioInputTitle.click();

        WebElement queryInputPassword = driver.findElement(By.id("password"));
        queryInputPassword.sendKeys("choco101");

        WebElement dropdownInputDay = driver.findElement(By.id("days"));
        Select selectDay = new Select(dropdownInputDay);
        selectDay.selectByValue("5");

        WebElement dropdownInputMonth = driver.findElement(By.id("months"));
        Select selectMonth = new Select(dropdownInputMonth);
        selectMonth.selectByValue("2");

        WebElement dropdownInputYear = driver.findElement(By.id("years"));
        Select selectYear = new Select(dropdownInputYear);
        selectYear.selectByValue("2010");


        WebElement checkboxNews = driver.findElement(By.id("newsletter"));
        WebElement company = driver.findElement(By.id("company"));
        Actions actions = new Actions(driver);
        actions.moveToElement(company).perform();

        checkboxNews.click();

        WebElement checkboxOptin = driver.findElement(By.id("optin"));
        checkboxOptin.click();

        WebElement queryInputFirstName = driver.findElement(By.id("first_name"));
        WebElement queryInputLastName = driver.findElement(By.id("last_name"));
        WebElement queryInputCompany = driver.findElement(By.id("company"));
        WebElement queryInputAddress1 = driver.findElement(By.id("address1"));
        WebElement queryInputAddress2 = driver.findElement(By.id("address2"));
        WebElement dropdownInputCountry = driver.findElement(By.id("country"));
        WebElement queryInputState = driver.findElement(By.id("state"));
        WebElement queryInputCity = driver.findElement(By.id("city"));
        WebElement queryInputZipCode = driver.findElement(By.id("zipcode"));
        WebElement queryInputMobileNumber = driver.findElement(By.id("mobile_number"));

        queryInputFirstName.sendKeys("Choco");
        queryInputLastName.sendKeys("Cheese");
        queryInputCompany.sendKeys("Aice");
        queryInputAddress1.sendKeys("Ontario Street");
        queryInputAddress2.sendKeys("Columbia Street");
        Select selectCountry = new Select(dropdownInputCountry);
        selectCountry.selectByValue("Canada");
        queryInputState.sendKeys("America");
        queryInputCity.sendKeys("Ontario");
        queryInputZipCode.sendKeys("91743");
        queryInputMobileNumber.sendKeys("+1 805 806 9243");

        WebElement buttonCreateAccount = driver.findElement(By.cssSelector("[data-qa='create-account']"));
        buttonCreateAccount.click();

    }

    @Test
    public void fourteenthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();

        WebElement radioInputTitle = driver.findElement(By.id("id_gender2"));
        radioInputTitle.click();

        WebElement queryInputPassword = driver.findElement(By.id("password"));
        queryInputPassword.sendKeys("choco101");

        WebElement dropdownInputDay = driver.findElement(By.id("days"));
        Select selectDay = new Select(dropdownInputDay);
        selectDay.selectByValue("5");

        WebElement dropdownInputMonth = driver.findElement(By.id("months"));
        Select selectMonth = new Select(dropdownInputMonth);
        selectMonth.selectByValue("2");

        WebElement dropdownInputYear = driver.findElement(By.id("years"));
        Select selectYear = new Select(dropdownInputYear);
        selectYear.selectByValue("2010");


        WebElement checkboxNews = driver.findElement(By.id("newsletter"));
        WebElement company = driver.findElement(By.id("company"));
        Actions actions = new Actions(driver);
        actions.moveToElement(company).perform();

        checkboxNews.click();

        WebElement checkboxOptin = driver.findElement(By.id("optin"));
        checkboxOptin.click();

        WebElement queryInputFirstName = driver.findElement(By.id("first_name"));
        WebElement queryInputLastName = driver.findElement(By.id("last_name"));
        WebElement queryInputCompany = driver.findElement(By.id("company"));
        WebElement queryInputAddress1 = driver.findElement(By.id("address1"));
        WebElement queryInputAddress2 = driver.findElement(By.id("address2"));
        WebElement dropdownInputCountry = driver.findElement(By.id("country"));
        WebElement queryInputState = driver.findElement(By.id("state"));
        WebElement queryInputCity = driver.findElement(By.id("city"));
        WebElement queryInputZipCode = driver.findElement(By.id("zipcode"));
        WebElement queryInputMobileNumber = driver.findElement(By.id("mobile_number"));

        queryInputFirstName.sendKeys("Choco");
        queryInputLastName.sendKeys("Cheese");
        queryInputCompany.sendKeys("Aice");
        queryInputAddress1.sendKeys("Ontario Street");
        queryInputAddress2.sendKeys("Columbia Street");
        Select selectCountry = new Select(dropdownInputCountry);
        selectCountry.selectByValue("Canada");
        queryInputState.sendKeys("America");
        queryInputCity.sendKeys("Ontario");
        queryInputZipCode.sendKeys("91743");
        queryInputMobileNumber.sendKeys("+1 805 806 9243");

        WebElement buttonCreateAccount = driver.findElement(By.cssSelector("[data-qa='create-account']"));
        buttonCreateAccount.click();

        WebElement accountCreatedText = driver.findElement(By.cssSelector("[data-qa='account-created'] b"));
        String getAccountCreatedText = accountCreatedText.getText();
        System.out.println(getAccountCreatedText);
        Assertions.assertEquals("ACCOUNT CREATED!", getAccountCreatedText);

    }

    @Test
    public void fifteenthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();

        WebElement radioInputTitle = driver.findElement(By.id("id_gender2"));
        radioInputTitle.click();

        WebElement queryInputPassword = driver.findElement(By.id("password"));
        queryInputPassword.sendKeys("choco101");

        WebElement dropdownInputDay = driver.findElement(By.id("days"));
        Select selectDay = new Select(dropdownInputDay);
        selectDay.selectByValue("5");

        WebElement dropdownInputMonth = driver.findElement(By.id("months"));
        Select selectMonth = new Select(dropdownInputMonth);
        selectMonth.selectByValue("2");

        WebElement dropdownInputYear = driver.findElement(By.id("years"));
        Select selectYear = new Select(dropdownInputYear);
        selectYear.selectByValue("2010");


        WebElement checkboxNews = driver.findElement(By.id("newsletter"));
        WebElement company = driver.findElement(By.id("company"));
        Actions actions = new Actions(driver);
        actions.moveToElement(company).perform();

        checkboxNews.click();

        WebElement checkboxOptin = driver.findElement(By.id("optin"));
        checkboxOptin.click();

        WebElement queryInputFirstName = driver.findElement(By.id("first_name"));
        WebElement queryInputLastName = driver.findElement(By.id("last_name"));
        WebElement queryInputCompany = driver.findElement(By.id("company"));
        WebElement queryInputAddress1 = driver.findElement(By.id("address1"));
        WebElement queryInputAddress2 = driver.findElement(By.id("address2"));
        WebElement dropdownInputCountry = driver.findElement(By.id("country"));
        WebElement queryInputState = driver.findElement(By.id("state"));
        WebElement queryInputCity = driver.findElement(By.id("city"));
        WebElement queryInputZipCode = driver.findElement(By.id("zipcode"));
        WebElement queryInputMobileNumber = driver.findElement(By.id("mobile_number"));

        queryInputFirstName.sendKeys("Choco");
        queryInputLastName.sendKeys("Cheese");
        queryInputCompany.sendKeys("Aice");
        queryInputAddress1.sendKeys("Ontario Street");
        queryInputAddress2.sendKeys("Columbia Street");
        Select selectCountry = new Select(dropdownInputCountry);
        selectCountry.selectByValue("Canada");
        queryInputState.sendKeys("America");
        queryInputCity.sendKeys("Ontario");
        queryInputZipCode.sendKeys("91743");
        queryInputMobileNumber.sendKeys("+1 805 806 9243");

        WebElement buttonCreateAccount = driver.findElement(By.cssSelector("[data-qa='create-account']"));
        buttonCreateAccount.click();

        WebElement accountCreatedText = driver.findElement(By.cssSelector("[data-qa='account-created'] b"));
        String getAccountCreatedText = accountCreatedText.getText();
        System.out.println(getAccountCreatedText);
        Assertions.assertEquals("ACCOUNT CREATED!", getAccountCreatedText);

        WebElement buttonContinueAfterRegister = driver.findElement(By.cssSelector("[data-qa='continue-button']"));
        buttonContinueAfterRegister.click();

    }

    @Test
    public void sixteenthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();

        WebElement radioInputTitle = driver.findElement(By.id("id_gender2"));
        radioInputTitle.click();

        WebElement queryInputPassword = driver.findElement(By.id("password"));
        queryInputPassword.sendKeys("choco101");

        WebElement dropdownInputDay = driver.findElement(By.id("days"));
        Select selectDay = new Select(dropdownInputDay);
        selectDay.selectByValue("5");

        WebElement dropdownInputMonth = driver.findElement(By.id("months"));
        Select selectMonth = new Select(dropdownInputMonth);
        selectMonth.selectByValue("2");

        WebElement dropdownInputYear = driver.findElement(By.id("years"));
        Select selectYear = new Select(dropdownInputYear);
        selectYear.selectByValue("2010");


        WebElement checkboxNews = driver.findElement(By.id("newsletter"));
        WebElement company = driver.findElement(By.id("company"));
        Actions actions = new Actions(driver);
        actions.moveToElement(company).perform();

        checkboxNews.click();

        WebElement checkboxOptin = driver.findElement(By.id("optin"));
        checkboxOptin.click();

        WebElement queryInputFirstName = driver.findElement(By.id("first_name"));
        WebElement queryInputLastName = driver.findElement(By.id("last_name"));
        WebElement queryInputCompany = driver.findElement(By.id("company"));
        WebElement queryInputAddress1 = driver.findElement(By.id("address1"));
        WebElement queryInputAddress2 = driver.findElement(By.id("address2"));
        WebElement dropdownInputCountry = driver.findElement(By.id("country"));
        WebElement queryInputState = driver.findElement(By.id("state"));
        WebElement queryInputCity = driver.findElement(By.id("city"));
        WebElement queryInputZipCode = driver.findElement(By.id("zipcode"));
        WebElement queryInputMobileNumber = driver.findElement(By.id("mobile_number"));

        queryInputFirstName.sendKeys("Choco");
        queryInputLastName.sendKeys("Cheese");
        queryInputCompany.sendKeys("Aice");
        queryInputAddress1.sendKeys("Ontario Street");
        queryInputAddress2.sendKeys("Columbia Street");
        Select selectCountry = new Select(dropdownInputCountry);
        selectCountry.selectByValue("Canada");
        queryInputState.sendKeys("America");
        queryInputCity.sendKeys("Ontario");
        queryInputZipCode.sendKeys("91743");
        queryInputMobileNumber.sendKeys("+1 805 806 9243");

        WebElement buttonCreateAccount = driver.findElement(By.cssSelector("[data-qa='create-account']"));
        buttonCreateAccount.click();

        WebElement accountCreatedText = driver.findElement(By.cssSelector("[data-qa='account-created'] b"));
        String getAccountCreatedText = accountCreatedText.getText();
        System.out.println(getAccountCreatedText);
        Assertions.assertEquals("ACCOUNT CREATED!", getAccountCreatedText);

        WebElement buttonContinueAfterRegister = driver.findElement(By.cssSelector("[data-qa='continue-button']"));
        buttonContinueAfterRegister.click();

        WebElement loggedInAsText = driver.findElement(By.xpath("//a[i[contains(@class, 'fa-user')]]"));
        String getLoggedInAsText = loggedInAsText.getText();
        System.out.println(getLoggedInAsText);
        Assertions.assertEquals("Logged in as Choco", getLoggedInAsText);

    }

    @Test
    public void seventeenthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();

        WebElement radioInputTitle = driver.findElement(By.id("id_gender2"));
        radioInputTitle.click();

        WebElement queryInputPassword = driver.findElement(By.id("password"));
        queryInputPassword.sendKeys("choco101");

        WebElement dropdownInputDay = driver.findElement(By.id("days"));
        Select selectDay = new Select(dropdownInputDay);
        selectDay.selectByValue("5");

        WebElement dropdownInputMonth = driver.findElement(By.id("months"));
        Select selectMonth = new Select(dropdownInputMonth);
        selectMonth.selectByValue("2");

        WebElement dropdownInputYear = driver.findElement(By.id("years"));
        Select selectYear = new Select(dropdownInputYear);
        selectYear.selectByValue("2010");


        WebElement checkboxNews = driver.findElement(By.id("newsletter"));
        WebElement company = driver.findElement(By.id("company"));
        Actions actions = new Actions(driver);
        actions.moveToElement(company).perform();

        checkboxNews.click();

        WebElement checkboxOptin = driver.findElement(By.id("optin"));
        checkboxOptin.click();

        WebElement queryInputFirstName = driver.findElement(By.id("first_name"));
        WebElement queryInputLastName = driver.findElement(By.id("last_name"));
        WebElement queryInputCompany = driver.findElement(By.id("company"));
        WebElement queryInputAddress1 = driver.findElement(By.id("address1"));
        WebElement queryInputAddress2 = driver.findElement(By.id("address2"));
        WebElement dropdownInputCountry = driver.findElement(By.id("country"));
        WebElement queryInputState = driver.findElement(By.id("state"));
        WebElement queryInputCity = driver.findElement(By.id("city"));
        WebElement queryInputZipCode = driver.findElement(By.id("zipcode"));
        WebElement queryInputMobileNumber = driver.findElement(By.id("mobile_number"));

        queryInputFirstName.sendKeys("Choco");
        queryInputLastName.sendKeys("Cheese");
        queryInputCompany.sendKeys("Aice");
        queryInputAddress1.sendKeys("Ontario Street");
        queryInputAddress2.sendKeys("Columbia Street");
        Select selectCountry = new Select(dropdownInputCountry);
        selectCountry.selectByValue("Canada");
        queryInputState.sendKeys("America");
        queryInputCity.sendKeys("Ontario");
        queryInputZipCode.sendKeys("91743");
        queryInputMobileNumber.sendKeys("+1 805 806 9243");

        WebElement buttonCreateAccount = driver.findElement(By.cssSelector("[data-qa='create-account']"));
        buttonCreateAccount.click();

        WebElement accountCreatedText = driver.findElement(By.cssSelector("[data-qa='account-created'] b"));
        String getAccountCreatedText = accountCreatedText.getText();
        System.out.println(getAccountCreatedText);
        Assertions.assertEquals("ACCOUNT CREATED!", getAccountCreatedText);

        WebElement buttonContinueAfterRegister = driver.findElement(By.cssSelector("[data-qa='continue-button']"));
        buttonContinueAfterRegister.click();

        WebElement loggedInAsText = driver.findElement(By.xpath("//a[i[contains(@class, 'fa-user')]]"));
        String getLoggedInAsText = loggedInAsText.getText();
        System.out.println(getLoggedInAsText);
        Assertions.assertEquals("Logged in as Choco", getLoggedInAsText);

        WebElement buttonDeleteAccount = driver.findElement(By.cssSelector("a[href='/delete_account']"));
        buttonDeleteAccount.click();

    }

    @Test
    public void eighteenthTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.get("http://automationexercise.com");

        WebElement hoverLink = driver.findElement(By.cssSelector("a[href='/login']"));
        hoverLink.click();

        WebElement queryInputName = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement queryInputEmail = driver.findElement(By.cssSelector("[data-qa='signup-email']"));

        queryInputName.sendKeys("Choco");
        queryInputEmail.sendKeys("choco@email.com");

        WebElement clickSignUp = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        clickSignUp.click();

        WebElement radioInputTitle = driver.findElement(By.id("id_gender2"));
        radioInputTitle.click();

        WebElement queryInputPassword = driver.findElement(By.id("password"));
        queryInputPassword.sendKeys("choco101");

        WebElement dropdownInputDay = driver.findElement(By.id("days"));
        Select selectDay = new Select(dropdownInputDay);
        selectDay.selectByValue("5");

        WebElement dropdownInputMonth = driver.findElement(By.id("months"));
        Select selectMonth = new Select(dropdownInputMonth);
        selectMonth.selectByValue("2");

        WebElement dropdownInputYear = driver.findElement(By.id("years"));
        Select selectYear = new Select(dropdownInputYear);
        selectYear.selectByValue("2010");


        WebElement checkboxNews = driver.findElement(By.id("newsletter"));
        WebElement company = driver.findElement(By.id("company"));
        Actions actions = new Actions(driver);
        actions.moveToElement(company).perform();

        checkboxNews.click();

        WebElement checkboxOptin = driver.findElement(By.id("optin"));
        checkboxOptin.click();

        WebElement queryInputFirstName = driver.findElement(By.id("first_name"));
        WebElement queryInputLastName = driver.findElement(By.id("last_name"));
        WebElement queryInputCompany = driver.findElement(By.id("company"));
        WebElement queryInputAddress1 = driver.findElement(By.id("address1"));
        WebElement queryInputAddress2 = driver.findElement(By.id("address2"));
        WebElement dropdownInputCountry = driver.findElement(By.id("country"));
        WebElement queryInputState = driver.findElement(By.id("state"));
        WebElement queryInputCity = driver.findElement(By.id("city"));
        WebElement queryInputZipCode = driver.findElement(By.id("zipcode"));
        WebElement queryInputMobileNumber = driver.findElement(By.id("mobile_number"));

        queryInputFirstName.sendKeys("Choco");
        queryInputLastName.sendKeys("Cheese");
        queryInputCompany.sendKeys("Aice");
        queryInputAddress1.sendKeys("Ontario Street");
        queryInputAddress2.sendKeys("Columbia Street");
        Select selectCountry = new Select(dropdownInputCountry);
        selectCountry.selectByValue("Canada");
        queryInputState.sendKeys("America");
        queryInputCity.sendKeys("Ontario");
        queryInputZipCode.sendKeys("91743");
        queryInputMobileNumber.sendKeys("+1 805 806 9243");

        WebElement buttonCreateAccount = driver.findElement(By.cssSelector("[data-qa='create-account']"));
        buttonCreateAccount.click();

        WebElement accountCreatedText = driver.findElement(By.cssSelector("[data-qa='account-created'] b"));
        String getAccountCreatedText = accountCreatedText.getText();
        System.out.println(getAccountCreatedText);
        Assertions.assertEquals("ACCOUNT CREATED!", getAccountCreatedText);

        WebElement buttonContinueAfterRegister = driver.findElement(By.cssSelector("[data-qa='continue-button']"));
        buttonContinueAfterRegister.click();

        WebElement loggedInAsText = driver.findElement(By.xpath("//a[i[contains(@class, 'fa-user')]]"));
        String getLoggedInAsText = loggedInAsText.getText();
        System.out.println(getLoggedInAsText);
        Assertions.assertEquals("Logged in as Choco", getLoggedInAsText);

        WebElement buttonDeleteAccount = driver.findElement(By.cssSelector("a[href='/delete_account']"));
        buttonDeleteAccount.click();

        WebElement accountDeletedText = driver.findElement(By.cssSelector("[data-qa='account-deleted']"));
        String getAccountDeletedText = accountDeletedText.getText();
        System.out.println(getAccountDeletedText);
        Assertions.assertEquals("ACCOUNT DELETED!", getAccountDeletedText);

        WebElement buttonContinueAfterDeleteAccount = driver.findElement(By.cssSelector("[data-qa='continue-button']"));
        buttonContinueAfterDeleteAccount.click();

    }
}
