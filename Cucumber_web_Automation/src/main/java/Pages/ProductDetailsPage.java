package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends pagebase {

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

    @FindBy(id="add-to-wishlist-button-5")
    public WebElement AddToWishlistBtn;

    @FindBy(css = "div.bar-notification.success")
    public WebElement NotificationBar;

    @FindBy(linkText = "wishlist")
    WebElement WishlistLink;

    @FindBy(css = "button.button-1.add-to-cart-button")
    WebElement AddToCartBtn;

    @FindBy(linkText = "shopping cart")
    WebElement shoppingCartLink;



    public void openWishlistPage()
    {
        WishlistLink.click();
    }

    public void AddToCart()
    {

        AddToCartBtn.click();
    }

    public void OpenShoppingCartPage()
    {
        shoppingCartLink.click();
    }

}

