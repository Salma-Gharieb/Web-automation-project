package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailProductPage;
import pages.Homepage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.UserRegistrationPage;

public class EmailFriendTest extends TestBase {

	Homepage homeobj;
	UserRegistrationPage registerobj;
	SearchPage searchobj;
	ProductDetailsPage productobj;
	EmailProductPage emailobj;
	LoginPage loginobj;
	UserRegistrationTest dataobj;

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
	
	//search for a specific product
	@Test(priority = 2)
	public void UserCanSearchWithSuggest() throws InterruptedException
	{
		searchobj = new SearchPage(driver);
		searchobj.SearchItemBySuggest("Mac");
		productobj = new ProductDetailsPage(driver);
		
		Assert.assertTrue(productobj.itemname.getText().contains("Mac"));
	}
	
	//send to a friend
	@Test(priority = 3)
	public void RegisteredUserCanEmailFriendaProduct()
	{

		productobj.OpenEmailPage();
		emailobj = new EmailProductPage(driver);
		emailobj.SendProductByEmail("Testfriend@gmail.com", "This is a good product,check it out!");
		
		Assert.assertTrue(emailobj.resultMsg.getText().equals("Your message has been sent."));		
	}
	
	//user logout
	@Test(priority = 4)
	public void RegisteredUserCanLogout()
	{
		registerobj.userLogout();
		
	}


}
