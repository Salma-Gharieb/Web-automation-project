package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductUsingAutocomplete extends TestBase {
	
	SearchPage searchobj;
	ProductDetailsPage productobj;
	
	@Test
	public void UserCanSearchWithSuggest() throws InterruptedException
	{
		searchobj = new SearchPage(driver);
		searchobj.SearchItemBySuggest("Mac");
		
		productobj = new ProductDetailsPage(driver);
		Assert.assertTrue(productobj.itemname.getText().contains("Mac"));
	}

}
