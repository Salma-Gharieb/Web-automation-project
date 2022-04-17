package StepDefinition;

import Pages.Homepage;
import Pages.MyaccountPage;
import Pages.Registerpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class changepasswordTest {

    Registerpage registerobj;
    MyaccountPage myaccountobj;

    @When("user clicks on myaccount link")
    public void userClicksOnMyaccountLink() {
        registerobj = new Registerpage(Hook.driver);
        registerobj.myaccountLink.click();
    }

    @And("Click on change password link")
    public void clickOnChangePasswordLink() {
        myaccountobj = new MyaccountPage(Hook.driver);
        myaccountobj.changePasswordlink.click();
    }

    @And("Enters {string} and {string}")
    public void UserEntersNewPassword(String oldPassword, String newPassword) {
        myaccountobj.ChangePassword(oldPassword , newPassword);
    }

    @And("clicks on change password button")
    public void clicksOnChangePasswordButton() {
        myaccountobj.changePasswordBtn.click();
    }

    @Then("password is changed successfully")
    public void passwordIsChangedSuccessfully() {
        Assert.assertEquals(myaccountobj.result.getText(),"Password was changed" );
    }
}
