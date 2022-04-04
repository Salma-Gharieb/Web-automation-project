package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends pagebase {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    public WebElement itemname;


    @FindBy(id="price-value-4")
    public WebElement productPrice;

    @FindBy(css = "div.bar-notification.success")
    public WebElement NotificationBar;

    @FindBy(id="add-to-cart-button-4")
    WebElement AddToCartBtn;

    @FindBy(linkText = "shopping cart")
    WebElement shoppingCartLink;


    public void AddToCart()
    {
        AddToCartBtn.click();
    }

    public void OpenShoppingCartPage()
    {
        shoppingCartLink.click();
    }
}

