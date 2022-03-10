package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.WishlistPage;

public class AddToWishlistTest extends TestBase{

	SearchPage searchobj;
	ProductDetailsPage productobj;
	WishlistPage wishlistobj;
	
	//search for product
	@Test(priority = 1)
	public void UserCanSearchWithSuggest() throws InterruptedException
	{
		searchobj = new SearchPage(driver);
		searchobj.SearchItemBySuggest("Mac");
		
		productobj = new ProductDetailsPage(driver);
		Assert.assertTrue(productobj.itemname.getText().contains("Mac"));
	}
	
	//add product to wishlist
	@Test(priority = 2)
	public void UserCanAddProductToWishlist()
	{
		productobj.AddToWishlist();
		Assert.assertTrue(productobj.NotificationBar.isDisplayed());
		productobj.openWishlistPage();
		wishlistobj = new WishlistPage(driver);
		Assert.assertTrue(wishlistobj.WishlistHeader.isDisplayed());
		Assert.assertTrue(wishlistobj.Productname.getText().equals("Apple MacBook Pro 13-inch"));
	}
	
	//remove product from wishlist
	@Test(priority = 3)
	public void UserCanRemoveProductFromWishlist()
	{
		wishlistobj.RemoveProductFromWishlist();
		Assert.assertEquals(wishlistobj.resultMsg.getText(),"The wishlist is empty!");
	}
}
