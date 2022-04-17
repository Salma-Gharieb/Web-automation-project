package StepDefinition;

import Pages.Homepage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ChangeCurrencyTest {
    Homepage homeobj;
    SearchPage searchobj;
    ProductDetailsPage productobj;

    @When("user change currency to Euro")
    public void userChangeCurrencyToEuro() {
        homeobj = new Homepage(Hook.driver);
        homeobj.changeCurrency();
    }


    @And("user searches for an item")
    public void userSearchesForAnItem() throws InterruptedException {

        searchobj = new SearchPage(Hook.driver);
        searchobj.SearchItemBySuggest("Mac");

    }

    @Then("price is displayed in Euro")
    public void priceIsDisplayedInEuro() {
        productobj = new ProductDetailsPage(Hook.driver);
        Assert.assertTrue(productobj.itemname.getText().contains("Mac"));
        Assert.assertTrue(productobj.productPrice.getText().contains("€"));
    }

}
