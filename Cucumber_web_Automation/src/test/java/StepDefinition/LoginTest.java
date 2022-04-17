package StepDefinition;

import Pages.Homepage;
import Pages.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginTest {
    Homepage homeobj;
    Loginpage loginobj;

    @When("user clicks on login link")
    public void userClicksOnLoginLink() {
        homeobj = new Homepage(Hook.driver);
        homeobj.openLoginPage();
    }

    @And("user Enters valid email and password")
    public void userEntersValidEmailAndPassword() {
        loginobj = new Loginpage(Hook.driver);
        loginobj.userLogin(Hook.Email , Hook.password);
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        loginobj.loginBtn.click();
    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {
        Assert.assertTrue(loginobj.logoutLink.getText().equals("Log out"));
    }


}
