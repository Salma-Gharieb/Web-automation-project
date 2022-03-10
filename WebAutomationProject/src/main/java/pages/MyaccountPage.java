package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends PageBase {

	public MyaccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Change password")
	WebElement changePasswordlink;
	
	@FindBy(id ="OldPassword")
	WebElement oldPasswordTxtBox;
	
	@FindBy(id="NewPassword")
	WebElement newPasswordTxtBox;
	
	@FindBy(id="ConfirmNewPassword")
	WebElement confirmPasswordTxtBox;
	
	@FindBy(css = "button.button-1.change-password-button")
	WebElement changePasswordBtn;
	
	@FindBy(css ="p.content")
	public WebElement result;
	
	@FindBy (linkText = "Customer info") 
	public WebElement Customerinformation;
	
	public void OpenChangePasswordPge()
	{
		clickButton(changePasswordlink);
	}
	
	public void ChangePassword(String oldpassword, String newpassword)
	{
		setText(oldPasswordTxtBox, oldpassword);
		setText(newPasswordTxtBox, newpassword);
		setText(confirmPasswordTxtBox, newpassword);
		clickButton(changePasswordBtn);
	}
	
	

}
