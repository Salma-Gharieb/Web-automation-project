package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductTest extends TestBase{

	String searcheditem = "Apple MacBook Pro 13-inch";
	SearchPage searchobj;
	ProductDetailsPage productobj;
	
	@Test
	public void UserCanSearchForItems()
	{
		searchobj = new SearchPage(driver);
		searchobj.searchForItem(searcheditem);
		searchobj.openProductDetailsPage();
		
		productobj = new ProductDetailsPage(driver);
		
		Assert.assertTrue(productobj.itemname.getText().equalsIgnoreCase(searcheditem));
	}
}
