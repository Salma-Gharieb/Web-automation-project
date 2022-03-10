package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.ProductReviewPage;
import pages.SearchPage;
import pages.UserRegistrationPage;

public class AddReviewTest extends TestBase{

	Homepage homeobj;
	UserRegistrationPage registerobj;
	SearchPage searchobj;
	ProductDetailsPage productobj;
	ProductReviewPage reviewobj;
	UserRegistrationTest dataobj;
	LoginPage loginobj;
	
	
	//user login
	@Test (priority = 1, alwaysRun = true)
	public void RegisteredUserLoginSuccessfully()
	{
		homeobj = new Homepage(driver);
		homeobj.openLoginPage();
		loginobj = new LoginPage(driver);
		dataobj = new UserRegistrationTest();
		loginobj.userLogin(dataobj.userEmail, dataobj.password);
		registerobj = new UserRegistrationPage(driver);
		Assert.assertTrue(registerobj.logoutLink.getText().equals("Log out"));
	}
	
	
	//search for product
	@Test(priority = 2)
	public void UserCanSearchWithSuggest() throws InterruptedException
	{
		searchobj = new SearchPage(driver);
		searchobj.SearchItemBySuggest("Mac");
		
		productobj = new ProductDetailsPage(driver);
		Assert.assertTrue(productobj.itemname.getText().contains("Mac"));
	}
	
	//add review
	@Test(priority = 3)
	public void UserCanAddReview()
	{
		productobj.OpenReviewPage();
		reviewobj = new ProductReviewPage(driver);
		reviewobj.AddReview("macbook review", "The product is great, strongly recommended!");
		
		Assert.assertTrue(reviewobj.resultMsg.getText().equals("Product review is successfully added."));
		
	}
	
	@Test (priority = 4)
	public void RegisteredUserCanLogout()
	{
		registerobj.userLogout();
		
	}



}
