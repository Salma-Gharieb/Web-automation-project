package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WishlistPage extends PageBase{

	public WishlistPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "a.product-name")
	public WebElement Productname;
	
	@FindBy(tagName = "h1")
	public WebElement WishlistHeader;
	
	@FindBy(name = "updatecart")
	WebElement RemoveProduct;
	
	@FindBy(css = "div.no-data")
	public WebElement resultMsg;
	
	public void RemoveProductFromWishlist()
	{
		clickButton(RemoveProduct);
		
	}
}
