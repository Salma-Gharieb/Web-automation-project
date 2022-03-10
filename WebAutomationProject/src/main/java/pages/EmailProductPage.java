package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailProductPage extends PageBase {

	public EmailProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="FriendEmail")
	WebElement FriendEmailTxtBox;
	
	@FindBy(id="PersonalMessage")
	WebElement Msg;
	
	@FindBy(css = "button.button-1.send-email-a-friend-button")
	WebElement sendEmailBtn;
	
	@FindBy(css = "div.result")
	public WebElement resultMsg;
	
	
	public void SendProductByEmail(String friendemail, String msg)
	{
		setText(FriendEmailTxtBox, friendemail);
		setText(Msg, msg);
		clickButton(sendEmailBtn);
		
	}

}
