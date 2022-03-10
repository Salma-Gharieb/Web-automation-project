package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(tagName = "h1")
	public WebElement itemname;

	@FindBy(css = "button.button-2.email-a-friend-button")
	WebElement EmailFriendBtn;
	
	@FindBy(id="price-value-4")
	public WebElement productPrice;
	
	@FindBy(linkText = "Add your review")
	WebElement AddReviewLink;
	
	@FindBy(id="add-to-wishlist-button-4")
	WebElement AddToWishlistBtn;
	
	@FindBy(css = "div.bar-notification.success")
	public WebElement NotificationBar;
	
	@FindBy(linkText = "wishlist")
	WebElement WishlistLink;
	
	@FindBy(id="add-to-cart-button-4")
	WebElement AddToCartBtn;
	
	@FindBy(linkText = "shopping cart")
	WebElement shoppingCartLink;
	
	
	public void OpenEmailPage()
	{
		clickButton(EmailFriendBtn);
	}
	
	public void OpenReviewPage()
	{
		clickButton(AddReviewLink);
	}
	
	public void AddToWishlist()
	{
		clickButton(AddToWishlistBtn);
	}
	
	public void openWishlistPage()
	{
		clickButton(WishlistLink);
	}
	
	public void AddToCart()
	{
		clickButton(AddToCartBtn);
	}
	
	public void OpenShoppingCartPage()
	{
		clickButton(shoppingCartLink);
	}
}
