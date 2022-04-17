package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends pagebase{

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "a.product-name")
    public WebElement ProductName;

    @FindBy(className = "qty-input")
    WebElement quantityTxtBox;

    @FindBy(id="updatecart")
    WebElement updateCartBtn;

    @FindBy(css = "span.product-unit-price")
    public WebElement unitprice;

    @FindBy(css ="span.product-subtotal")
    public WebElement totalprice;

    @FindBy(name = "updatecart")
    public WebElement removeFromCartBtn;

    @FindBy(css = "div.no-data")
    public WebElement emptyCartMsg;

    @FindBy(id="termsofservice")
    WebElement termsofserviceCheckbx;

    @FindBy(id="checkout")
    WebElement checkoutBtn;

    public void RemoveFromCart()
    {
        removeFromCartBtn.click();
    }

    public void UpdateProductQuantity(String quantity)
    {
        quantityTxtBox.clear();
        quantityTxtBox.sendKeys(quantity);
        updateCartBtn.click();
    }

    public void Checkout() {

        termsofserviceCheckbx.click();
        checkoutBtn.click();
    }


}

