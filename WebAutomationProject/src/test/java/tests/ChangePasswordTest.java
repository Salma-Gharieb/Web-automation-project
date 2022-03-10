package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.LoginPage;
import pages.MyaccountPage;
import pages.UserRegistrationPage;

public class ChangePasswordTest extends TestBase{

	Homepage homeobj;
	UserRegistrationPage registerobj;
	MyaccountPage myaccountobj;
	LoginPage loginobj;
	UserRegistrationTest dataobj;
	
	String newpassword = "test123456";

	
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

	@Test (priority = 2)
	public void RegisteredUserCanChangePassword()
	{
		registerobj.openMyAccount();
		myaccountobj = new MyaccountPage(driver);
		myaccountobj.OpenChangePasswordPge();
		myaccountobj.ChangePassword(dataobj.password, newpassword);

		Assert.assertEquals(myaccountobj.result.getText(),"Password was changed" );
		myaccountobj.Customerinformation.click();
		
	}
	
	@Test (priority = 3)
	public void RegisteredUserCanLogout()
	{
		registerobj.userLogout();
	}
	
	@Test(priority = 4)
	public void UserLoginWithNewPasswordSuccessfully()
	{
		homeobj = new Homepage(driver);
		homeobj.openLoginPage();
		loginobj = new LoginPage(driver);
		loginobj.userLogin(dataobj.userEmail, newpassword);
		registerobj = new UserRegistrationPage(driver);
		Assert.assertTrue(registerobj.logoutLink.getText().equals("Log out"));
	}
	
}
