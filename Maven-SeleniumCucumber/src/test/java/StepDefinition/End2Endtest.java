package StepDefinition;

import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class End2Endtest {
    Homepage homeobj;
    SearchPage searchobj;
    ProductDetailsPage productobj;
    ShoppingCartPage cartobj;
    CheckoutPage checkoutobj;
    OrderdetailsPage orderobj;

    @Given("user is on homepage")
    public void user_is_on_homepage() {

        homeobj = new Homepage(Hook.driver);
        Assert.assertTrue(Hook.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"));
    }

    @When("he search for {string}")
    public void he_search_for(String productName) {

        searchobj = new SearchPage(Hook.driver);
        searchobj.searchForItem(productName);
        searchobj.openProductDetailsPage();

        productobj = new ProductDetailsPage(Hook.driver);
        Assert.assertEquals(productobj.itemname.getText(), productName);

    }

    @When ("choose to add two items and move to shoppingcart")
    public void choose_to_add_two_items_and_move_to_shoppingcart() {

        productobj.AddToCart();
        productobj.OpenShoppingCartPage();

        Assert.assertTrue(Hook.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/cart"));
    }

    @When ("move to checkout page and enter personal deatails {string},{string},{string},{string},{string},{string},{string},{string}")
    public void move_to_checkout_page_and_enter_personal_deatails(String fname,String lname,String email,String country,
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
    public void he_can_view_the_order_and_download_the_invoice() throws InterruptedException {

        checkoutobj.openOrderdetailsPage();
        orderobj = new OrderdetailsPage(Hook.driver);
        Assert.assertTrue(Hook.driver.getCurrentUrl().contains("orderdetails"));

        orderobj.DownloadpdfInvoice();
        orderobj.printInvoice();

    }

}

