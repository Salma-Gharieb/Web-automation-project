package StepDefinition;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.WishlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Locale;

public class AddToWishlistTest {

    SearchPage searchobj;
    ProductDetailsPage productobj;
    WishlistPage wishlistobj;

    @When("user clicks on product")
    public void userClicksOnProduct() {
        searchobj= new SearchPage(Hook.driver);
        searchobj.openProductDetailsPage();
    }

    @And("clicks on add to wishlist button")
    public void clicksOnAddtowishlistButton() {

        productobj = new ProductDetailsPage(Hook.driver);
        productobj.AddToWishlistBtn.click();
        Assert.assertTrue(productobj.NotificationBar.isDisplayed());
        productobj.openWishlistPage();
    }

    @Then("product is added to wishlist")
    public void productIsAddedToWishlist() {
        wishlistobj = new WishlistPage(Hook.driver);
        Assert.assertTrue(wishlistobj.WishlistHeader.isDisplayed());
        Assert.assertTrue(wishlistobj.Productname.getText().equals("Asus N551JK-XO076H Laptop"));
    }
}
