package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;

public class HoverMenuTest extends TestBase{

	Homepage homeobj;
	
	@Test
	public void UserCanSelectFromHoverMenu()
	{
		homeobj = new Homepage(driver);
		homeobj.openNotebooksPage();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
	}
}
