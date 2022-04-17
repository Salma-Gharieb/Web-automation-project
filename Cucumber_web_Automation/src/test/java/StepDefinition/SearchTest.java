package StepDefinition;

import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Locale;

public class SearchTest {
    SearchPage searchobj;

    @When("User enters {string} in search text box")
    public void userEnterInSearchTextBox(String productname) {

        searchobj = new SearchPage(Hook.driver);
        searchobj.searchForItem(productname);
    }

    @And("clicks on search button")
    public void clicksOnSearchButton() {
        searchobj.searchbtn.click();
    }

    @Then("User should find related results with {string}")
    public void UserShouldFindRelatedResults(String productname) {

        int cnt = searchobj.productsresult.size();
        Assert.assertTrue(cnt>0);
        for(int i=0; i<cnt; i++){
            System.out.println(searchobj.productsresult.get(i).getText());
            Assert.assertTrue(searchobj.productsresult.get(i).getText().toLowerCase().contains(productname));
        }

    }
}
