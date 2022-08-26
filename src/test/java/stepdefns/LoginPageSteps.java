package stepdefns;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.util.TestContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {

	private static String title;
	Scenario scn;
//	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	TestContext testContext;
	public LoginPageSteps(TestContext context){
		this.testContext=context;
		testContext.setDriver(testContext.driver);
		testContext.intilizePageObject(context.driver, scn);
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {

		System.out.println("Login page");

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {

		title = testContext.getLoginPage().getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(testContext.getLoginPage().isForgotPwdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		testContext.getLoginPage().enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		testContext.getLoginPage().enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		testContext.getLoginPage().clickOnLogin();
	}


}
