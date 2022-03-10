package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase{

	Homepage homeobj;
	UserRegistrationPage registerobj;
	LoginPage loginobj;

	
	public String userEmail = "testUser123@gmail.com";
	public String password = "12345678";
	
	@Test (priority = 1, alwaysRun = true)
	public void UserRegisterSuccessfully() {
		
		homeobj = new Homepage(driver);
		homeobj.openRegistrationPage();
		registerobj = new UserRegistrationPage(driver);	
		registerobj.userRegistration("test", "user", userEmail, password);
		Assert.assertEquals(registerobj.result.getText(), "Your registration completed");
	
	}
	
	
	@Test (priority = 2)
	public void RegisteredUserCanLogout()
	{
		registerobj.userLogout();
		
	}
	
	
	@Test (priority = 3)
	public void RegisteredUserLoginSuccessfully()
	{
		homeobj = new Homepage(driver);
		homeobj.openLoginPage();
		loginobj = new LoginPage(driver);
		loginobj.userLogin(userEmail, password);
		registerobj = new UserRegistrationPage(driver);
		Assert.assertTrue(registerobj.logoutLink.getText().equals("Log out"));
	}
	
	@Test (priority = 4)
	public void RegisteredUserLogout()
	{
		registerobj.userLogout();
		
	}
	
}


