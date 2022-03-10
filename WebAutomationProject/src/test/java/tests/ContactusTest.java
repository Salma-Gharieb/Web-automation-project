package tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.Homepage;

public class ContactusTest extends TestBase {

	Homepage homeobj;
	ContactUsPage contactobj;
	UserRegistrationTest dataobj;
	
	String name ="salma ahmed";
    String enquiry = "This is for testing";
   
    
	@Test
	public void UserCanUseContactUs()
	{
		homeobj = new Homepage(driver);
		homeobj.openContactusPage();
		contactobj = new ContactUsPage(driver);
		dataobj = new UserRegistrationTest();
		contactobj.ContactUsForm(name, dataobj.userEmail, enquiry);
		
		Assert.assertTrue(contactobj.resultMsg.getText().contains("successfully"));
	}
}
