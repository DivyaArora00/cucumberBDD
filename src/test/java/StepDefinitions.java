import Base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class StepDefinitions

{
 WebDriver driver;
    String expectedHomepageTitle= "nopCommerce demo store";
    String actualHomepageTitle;
    String expectedLoginpageTitle = "nopCommerce demo store. Login";
    String actualLoginpageTitle;
    String expectedRegisterPageTitle = "nopCommerce demo store. Register";
    String actualRegisterPageTitle;
    String expectedPasswordRecoveryPageTitle ="nopCommerce demo store. Password Recovery";
    String actualPasswordRecoveryPageTitle;
    String expectedSearchPageTitle ="nopCommerce demo store. Search";
    String actualSearchPageTitle;

    @Given(": i navigate to url {string}")
    public void i_navigate_to_url(String url)
    {
        BasePage.homepage.openurl(url);
    }

    @Then(":  i should be navigated to homepage.")
    public void i_should_be_navigated_to_homepage() {
        actualHomepageTitle = BasePage.homepage.getpagetitile();
        Assertions.assertEquals(actualHomepageTitle,expectedHomepageTitle);
        System.out.println(actualHomepageTitle);
    }

    @When("I click on Login link")
    public void i_click_on_login_link() {
        BasePage.loginPage.clickloginlink();

    }
    @Then("Login page shall open")
    public void login_page_shall_open() {
        actualLoginpageTitle = BasePage.homepage.getpagetitile();
        Assertions.assertEquals(actualLoginpageTitle,expectedLoginpageTitle);
        System.out.println(actualLoginpageTitle);



    }
    @When("i click on Forgot password? link")
    public void i_click_on_forgot_password_link() {
        BasePage.loginPage.clickforgortpasswordlink();

    }
    @Then("I am navigated to password recovery page")
    public void i_am_navigated_to_password_recovery_page() {
        actualPasswordRecoveryPageTitle = BasePage.homepage.getpagetitile();
        Assertions.assertEquals(actualPasswordRecoveryPageTitle,expectedPasswordRecoveryPageTitle);
    }
    @When("I enter email as {string}")
    public void i_enter_email_as(String eMail) {
        BasePage.loginPage.enteremailforrecovery(eMail);
    }
    @When("i click on Recover Button")
    public void i_click_on_recover_button() {
     BasePage.loginPage.clickrecoverybutton();

    }
    @Then("{string} message shall be displayed")
    public void message_shall_be_displayed(String message) {
     BasePage.loginPage.printconfirmmsg();
    }



   /* @Then(":  i should be navigated to homepage.")
    public void i_should_be_navigated_to_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/

    @When(": I enter text in search box as {string}")
    public void i_enter_text_in_search_box_as(String data) {
        BasePage.homepage.entertext(data);

    }
    @When(": i click on search button")
    public void i_click_on_search_button() {
        BasePage.homepage.clicksearchbutton();

    }
    @Then("Related products shall be seen")
    public void related_products_shall_be_seen() {
        actualSearchPageTitle = BasePage.homepage.getpagetitile();
        Assertions.assertEquals(actualSearchPageTitle,expectedSearchPageTitle);
        System.out.println(actualSearchPageTitle);

    }

    @When(": i click on register link from navbar")
    public void i_click_on_register_link_from_navbar() {
        BasePage.registerPage.clickregisterlink();
    }
    @Then(":  i should be navigated to registration page.")
    public void i_should_be_navigated_to_registration_page() {
        actualRegisterPageTitle = BasePage.homepage.getpagetitile();
        Assertions.assertEquals(expectedRegisterPageTitle,actualRegisterPageTitle);
        System.out.println(actualRegisterPageTitle);

    }
    @When(": i select gender as female")
    public void i_select_gender_as_female() {
        BasePage.registerPage.selectgender();
    }
    @When(": i enter First Name, Last Name, email, Password, Confirm Password")
    public void i_enter_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable) {
        BasePage.registerPage.enterfrstname(dataTable.cell(1,0));
        BasePage.registerPage.enterlastname(dataTable.cell(1,1));
        BasePage.registerPage.enteremail(dataTable.cell(1,2));
        BasePage.registerPage.enterpass(dataTable.cell(1,3));
        BasePage.registerPage.enterconfpass(dataTable.cell(1,4));
    }
    @When(": i click on register button")
    public void i_click_on_register_button() {
        BasePage.registerPage.clickregisterbutton();
    }
    @Then(": i should be registered successfully.")
    public void i_should_be_registered_successfully() {
        BasePage.registerPage.registrationmsg();
        System.out.println(BasePage.registerPage.registrationmsg());

    }


    @And(": i select month as {string}")
    public void iSelectMonthAs(String date) {
        BasePage.registerPage.selectdate(date);
    }

    @And(": i select day as {string}.")
    public void iSelectDayAs(String month) {
     BasePage.registerPage.selectmonth();
    }

    @And(": i select year as {int}.")
    public void iSelectYearAs(int year) {
        BasePage.registerPage.selectyear();
    }
}
