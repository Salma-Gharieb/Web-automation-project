package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "FullName")
	WebElement nameTxtBox;
	
	@FindBy(id="Email")
	WebElement emailTxtBox;
	
	@FindBy(id="Enquiry")
	WebElement EnuiryTxtBox;
	
	@FindBy(css = "button.button-1.contact-us-button")
	WebElement submitBtn;
	
	@FindBy(css = "div.result")
	public WebElement resultMsg;
	
	public void ContactUsForm(String name,String email,String enquiry)
	{
		setText(nameTxtBox, name);
		setText(emailTxtBox, email);
		setText(EnuiryTxtBox, enquiry);
		clickButton(submitBtn);
		
	}

}
