package P12;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RegistrationTest {
    WebDriver driver;

    @BeforeAll
    public void setupDriver() {
        System.out.println("Setting up WebDriver...");
        driver = new EdgeDriver();
    }
    @BeforeEach
    public void openHomePage() {
        driver.get("http://automationexercise.com");
    }

    @Test
    public void registerTest() {
        //page 1 (DashboardPage)
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickLoginButton();
        //page 2 (LoginPage)
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setInputNameField("Choco");
        loginPage.setInputEmailField("choco@email.com");
        loginPage.clickSignUpButton();
        //page 3 (SignUpPage)
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.clickRadioGender();
        signUpPage.setInputPasswordField("choco101");
        signUpPage.setInputDropdownDay("5");
        signUpPage.setInputDropdownMonth("2");
        signUpPage.setInputDropdownYear("2010");
        signUpPage.scrollToCompanyField();
        signUpPage.setInputCheckboxNews();
        signUpPage.setInputCheckboxOptin();
        signUpPage.setInputFirstNameField("Choco");
        signUpPage.setInputLastNameField("Cheese");
        signUpPage.setInputCompanyField("Aice");
        signUpPage.setInputAddress1Field("Ontario Street");
        signUpPage.setInputAddress2Field("Columbia Street");
        signUpPage.setInputDropdownCountry("Canada");
        signUpPage.setInputStateField("America");
        signUpPage.setInputCityField("Ontario");
        signUpPage.setInputZipCodeField("91743");
        signUpPage.setInputMobileNumberField("+1 805 806 9243");
        signUpPage.clickCreateAccountButton();
        //page 4 (AccountCreatedPage)
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver);
        Assertions.assertEquals("ACCOUNT CREATED!", accountCreatedPage
                .getAccountCreatedText());
        accountCreatedPage.clickContinueButton();
        //page 5 (MyDashboardPage)
        MyDashboardPage myDashboardPage = new MyDashboardPage(driver);
        Assertions.assertEquals("Logged in as Choco", myDashboardPage
                .getLoggedInAsText());
        myDashboardPage.clickDeleteAccountButton();
        //page 6 (DeleteAccountPage)
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage(driver);
        Assertions.assertEquals("ACCOUNT DELETED!", deleteAccountPage
                .getAccountDeletedText());
        deleteAccountPage.clickContinueButton();

    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("Finished a test case.");
    }
    @AfterAll
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Closed WebDriver.");
        }
    }
}
