package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class ChangeCurrencyTest extends TestBase{

	Homepage homeobj;
	SearchPage searchobj;
	ProductDetailsPage productobj;
	
	
	@Test(priority = 1)
	public void UserCanChangeCurrency()
	{
		homeobj = new Homepage(driver);
		homeobj.changeCurrency();
	}
	
	
	@Test(priority = 2)
	public void UserCanSearchWithSuggest() throws InterruptedException
	{
		searchobj = new SearchPage(driver);
		searchobj.SearchItemBySuggest("Mac");
		productobj = new ProductDetailsPage(driver);
		
		Assert.assertTrue(productobj.itemname.getText().contains("Mac"));
		Assert.assertTrue(productobj.productPrice.getText().contains("€"));
	}

	
}
