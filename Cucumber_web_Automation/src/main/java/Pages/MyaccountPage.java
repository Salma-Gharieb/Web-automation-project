package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends pagebase{

    public MyaccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Change password")
    public WebElement changePasswordlink;

    @FindBy(id ="OldPassword")
    WebElement oldPasswordTxtBox;

    @FindBy(id="NewPassword")
    WebElement newPasswordTxtBox;

    @FindBy(id="ConfirmNewPassword")
    WebElement confirmPasswordTxtBox;

    @FindBy(css = "button.button-1.change-password-button")
    public WebElement changePasswordBtn;

    @FindBy(css ="p.content")
    public WebElement result;

    @FindBy (linkText = "Customer info")
    public WebElement Customerinformation;


    public void ChangePassword(String oldpassword, String newpassword)
    {
        oldPasswordTxtBox.sendKeys(oldpassword);
        newPasswordTxtBox.sendKeys(newpassword);
        confirmPasswordTxtBox.sendKeys(newpassword);
    }

}
