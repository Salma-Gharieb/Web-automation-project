package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase{

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id ="gender-female")
	WebElement genderRdioBtn;
	
	@FindBy(id ="FirstName")
	WebElement fnTxtBox;
	
	@FindBy(id ="LastName")
	WebElement lnTxtBox;
	
	@FindBy(id="Email")
	WebElement emailTxtBox;
	
	@FindBy(id="Password")
	WebElement passwordTxtBox;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;

	@FindBy(id="register-button")
	WebElement registerBtn;
	
	@FindBy(css = "div.result")
	public WebElement result;
	
	@FindBy(linkText = "Log out")
	public WebElement logoutLink;
	
	@FindBy(linkText = "My account")
	WebElement myaccountLink;
	
	public void userRegistration(String firstname, String lastname,String email,String password) 
	{
		clickButton(genderRdioBtn);
		setText(fnTxtBox, firstname);
		setText(lnTxtBox, lastname);
		setText(emailTxtBox, email);
		setText(passwordTxtBox, password);
		setText(confirmPassword, password);
		clickButton(registerBtn);
	}
	
	
	public void userLogout()
	{
		clickButton(logoutLink);
	}
	
	
	public void openMyAccount()
	{
		clickButton(myaccountLink);
	}
	
}
