package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

public class AddToCartTest extends TestBase {

	SearchPage searchobj;
	ProductDetailsPage productobj;
	ShoppingCartPage cartobj;
	
	String productname ="Apple MacBook Pro 13-inch";
	
	//search for product
	@Test(priority = 1)
	public void UserCanSearchWithSuggest() throws InterruptedException
	{
		searchobj = new SearchPage(driver);
		searchobj.SearchItemBySuggest("Mac");
		
		productobj = new ProductDetailsPage(driver);
		Assert.assertTrue(productobj.itemname.getText().contains("Mac"));
	}
	
	//add product to cart
	@Test(priority = 2)
	public void UserCanAddProductToCart() throws InterruptedException
	{
		productobj.AddToCart();
		productobj.OpenShoppingCartPage();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		
		cartobj = new ShoppingCartPage(driver);
		Assert.assertTrue(cartobj.ProductName.getText().equals(productname));
		
		cartobj.UpdateProductQuantity("3");
		Thread.sleep(1000);
		Assert.assertFalse(cartobj.totalprice.getText().equals("cartobj.unitprice"));
	}

	
	//remove from cart
	@Test(priority = 3)
	public void UserCanRemoveFromCart() throws InterruptedException 
	{
		cartobj.RemoveFromCart();
		Assert.assertEquals(cartobj.emptyCartMsg.getText(), "Your Shopping Cart is empty!");
		Thread.sleep(1000);
		
	}
	
}
