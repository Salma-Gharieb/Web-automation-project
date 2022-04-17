package StepDefinition;

import Pages.CategoriesPage;
import Pages.CompareListPage;
import Pages.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CompareListTest {
    Homepage homeobj;
    CategoriesPage categoryobj;
    CompareListPage compareobj;

    @When("user navigates to notebook page from computer category")
    public void userNavigatesToNotebookPageFromComputerCategory() {
        homeobj = new Homepage(Hook.driver);
        homeobj.openNotebooksPage();
        Assert.assertTrue(Hook.driver .getCurrentUrl().contains("notebooks"));
    }

    @And("user add First products to compare cart")
    public void userAddFristProductsToCompareCart() {
        categoryobj = new CategoriesPage(Hook.driver);
        categoryobj.Comparebutton.get(0).click();
        Assert.assertTrue(categoryobj.NotificationBar.isDisplayed());
        Hook.driver.navigate().to("https://demo.nopcommerce.com/notebooks");
    }

    @And("user add Second products to compare cart")
    public void userAddScondProductsToCompareCart() throws InterruptedException {

        categoryobj.Comparebutton.get(1).click();
        Assert.assertTrue(categoryobj.NotificationBar.isDisplayed());
        categoryobj.openCompareListPage();
        Thread.sleep(2000);
    }

    @Then("products is added to compare cart")
    public void productsIsAddedToCmpareCart() {
        compareobj = new CompareListPage(Hook.driver);
        Assert.assertTrue(compareobj.CompareProductsHeader.isDisplayed());
        int cnt = compareobj.productList.size();
        Assert.assertTrue(cnt ==2 );

    }
}
