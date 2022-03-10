package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends PageBase{

	public ProductReviewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="AddProductReview_Title")
	WebElement ReviewtitleTxtBox;
	
	@FindBy(id="AddProductReview_ReviewText")
	WebElement ReviewTxtMsg;
	
	@FindBy(id="addproductrating_4")
	WebElement ReviewRate;
	
	@FindBy(name = "add-review")
	WebElement SubmitBtn;
	
	@FindBy(css = "div.result")
	public WebElement resultMsg;
	
	
	public void AddReview(String title,String msg)
	{
		setText(ReviewtitleTxtBox, title);
		setText(ReviewTxtMsg, msg);
		clickButton(ReviewRate);
		clickButton(SubmitBtn);
	}

}
