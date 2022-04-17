package StepDefinition;

import Pages.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ChangeCategoriesTest {

    Homepage homeobj;

    @When("User Hover to computers category and select notebooks from subcategory")
    public void userHoverToComputersCategoryAndSelectNotebooksFromSubcategory() {
        homeobj = new Homepage(Hook.driver);
        homeobj.openNotebooksPage();
    }

    @Then("he should be redirected to notebooks page")
    public void heShouldBeRedirectedToNotebooksPage() {
        Assert.assertTrue(Hook.driver .getCurrentUrl().contains("notebooks"));
    }

}
