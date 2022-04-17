package StepDefinition;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CreateOrderTest {
    SearchPage searchobj;
    ProductDetailsPage productobj;
    ShoppingCartPage cartobj;
    CheckoutPage checkoutobj;
    OrderdetailsPage orderobj;

    @When("he search for {string}")
    public void heSearchFor(String productName){
        searchobj = new SearchPage(Hook.driver);
        searchobj.searchForItem(productName);
        searchobj.searchbtn.click();

        searchobj.openProductDetailsPage();

        productobj = new ProductDetailsPage(Hook.driver);
        Assert.assertTrue(productobj.itemname.getText().equals(productName));
    }

    @And("choose to add two items and move to shoppingcart")
    public void chooseToAddTwoItemsAndMoveToShoppingcart() {
        productobj = new ProductDetailsPage(Hook.driver);
        productobj.AddToCart();
        productobj.OpenShoppingCartPage();

        Assert.assertTrue(Hook.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/cart"));
    }

    @And("move to checkout page and enter personal deatails {string},{string},{string},{string},{string},{string},{string},{string}")
    public void moveToCheckoutPageAndEnterPersonalDeatails
            (String fname,String lname,String email,String country,
             String city,String address, String zipcode, String phone) throws InterruptedException {

        cartobj = new ShoppingCartPage(Hook.driver);
        cartobj.Checkout();

        checkoutobj = new CheckoutPage(Hook.driver);
        checkoutobj.openCheckoutPageasGuest();
        checkoutobj.checkoutProduct(fname, lname, email, country, city, address, zipcode, phone);
        checkoutobj.confirmOrder();

        Assert.assertTrue(checkoutobj.Thankyoulabel.getText().equals("Thank you"));
    }

    @Then("he can view the order and download the invoice")
    public void heCanViewTheOrderAndDownloadTheInvoice() throws InterruptedException {
        checkoutobj.openOrderdetailsPage();
        orderobj = new OrderdetailsPage(Hook.driver);
        Assert.assertTrue(Hook.driver.getCurrentUrl().contains("orderdetails"));

        orderobj.DownloadpdfInvoice();
        orderobj.printInvoice();

    }
}
