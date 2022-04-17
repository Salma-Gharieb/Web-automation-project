package StepDefinition;

import Pages.Homepage;
import Pages.Loginpage;
import Pages.Registerpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterTest {

    Homepage homeobj;
    Registerpage registerobj;
    Loginpage loginobj;

    @Given("user is on Homepage")
    public void userIsOnHomepage() {
        homeobj = new Homepage(Hook.driver);
        Assert.assertTrue(Hook.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"));
    }

    @When("user clicks on register link")
    public void userClicksOnRegisterLink() {
        homeobj.openRegistrationPage();
    }

    @And("user Enters valid data")
    public void userEntersValidData() {
        registerobj = new Registerpage(Hook.driver);
        registerobj.userRegistration(Hook.firstname ,Hook.lastname , Hook.Email ,Hook.password);
    }

    @And("clicks on register button")
    public void clicksOnRegisterButton() {
        registerobj.registerBtn.click();
    }

    @Then("user is registered successfully")
    public void userIsRegisteredSuccessfully() {
        Assert.assertEquals(registerobj.result.getText(), "Your registration completed");
    }


    @And("user can logout")
    public void userCanLogout() {
        loginobj = new Loginpage(Hook.driver);
        loginobj.logoutLink.click();
    }
}
