package stepdefns;

import com.pages.AccountsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.RegistraionPage;
import com.qa.factory.DriverFactory;
import com.qa.util.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class RegistrationPageSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    private RegistraionPage registraionPage = new RegistraionPage(DriverFactory.getDriver());

    AccountsPage accountsPage = new AccountsPage(DriverFactory.getDriver());
    private HomePage homePage = new HomePage(DriverFactory.getDriver());

    TestContext testContext;
    Scenario scn;
    public RegistrationPageSteps(TestContext context){
        this.testContext=context;
        testContext.intilizePageObject(context.driver, scn);
    }


    @When("user clicks on Signin Button")
    public void user_clicks_on_signin_button() {
        homePage.clickSignIn();
    }

//    @Then("user should get the Login page")
//    public void user_should_get_the_login_page() {
//
//    }

    @Then("user enters {string} to authenticate")
    public void user_enters_to_authenticate(String emailID) {


        loginPage.enterAuthEmailIDandEnterSubmit(emailID);
    }

//    @Then("user should be taken to Registration page")
//    public void user_should_be_taken_to_registraion_page() {
//
//    }

    @Then("user enter {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}, and {string}")
    public void user_enter_and(String FN, String LN, String email, String pwd, String addFN, String addLN, String address, String city, String state, String zip, String country, String mobileNo) {
//        testContext.getRegistraionPage().doRegister();
        registraionPage.doRegister(FN,LN,email,pwd,addFN,addLN,address,city,state,zip,country,mobileNo);
    }

    @And("user validates registarion is successfull")
    public void userValidatesRegistarionIsSuccessfull() {
        String title=accountsPage.getAccountsPageTitle();
        Assert.assertEquals(title,"My account - My Store");
    }

    @Then("user enter {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}, and {string} and validates")
    public void userEnterAndAndValidates(DataTable table) {

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {

            registraionPage.doRegister(columns.get("FirstName"),columns.get("LastName"),columns.get("Email"),columns.get("Password"),columns.get("AddFirstName"),columns.get("AddLastName"),columns.get("Address"),columns.get("City"),columns.get("State"),columns.get("Zip"),columns.get("Country"),columns.get("MobileNo"));
        }
    }

    @Then("user enters {string} to autneticate with {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}, and {string} and validates")
    public void userEntersToAutneticateWithAndAndValidates(DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            loginPage.enterAuthEmailIDandEnterSubmit(columns.get("EmailAddress"));
            registraionPage.doRegister(columns.get("FirstName"),columns.get("LastName"),columns.get("Email"),columns.get("Password"),columns.get("AddFirstName"),columns.get("AddLastName"),columns.get("Address"),columns.get("City"),columns.get("State"),columns.get("Zip"),columns.get("Country"),columns.get("MobileNo"));
            accountsPage.clickLogout();
        }
    }
}
