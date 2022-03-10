package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase{

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
	
	
	public void RemoveFromCart()
	{
		clickButton(removeFromCartBtn);
	}
	
	public void UpdateProductQuantity(String quantity)
	{
		quantityTxtBox.clear();
		setText(quantityTxtBox, quantity);
		clickButton(updateCartBtn);
	}
	
	

}
