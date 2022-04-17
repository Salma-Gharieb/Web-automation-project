package StepDefinition;

import Pages.ProductDetailsPage;
import Pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AddToCartTest {

    ProductDetailsPage productobj;
    ShoppingCartPage cartobj;

    @And("clicks on add to cart button")
    public void clicksOnAddToCartButton() {
        productobj = new ProductDetailsPage(Hook.driver);
        productobj.AddToCart();
        Assert.assertTrue(productobj.NotificationBar.isDisplayed());
        productobj.OpenShoppingCartPage();
    }

    @Then("product is added to shopping cart")
    public void productIsAddedToShoppingCart() {
        cartobj = new ShoppingCartPage(Hook.driver);
        Assert.assertTrue(cartobj.ProductName.getText().equals("Asus N551JK-XO076H Laptop"));
    }
}
