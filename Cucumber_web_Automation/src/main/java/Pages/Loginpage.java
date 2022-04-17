package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends pagebase{

    public Loginpage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="Email")
    WebElement emailTxtBox;

    @FindBy(id="Password")
    WebElement passwordTxtBox;

    @FindBy(css = "button.button-1.login-button")
    public WebElement loginBtn;

    @FindBy(linkText = "Log out")
    public WebElement logoutLink;


    public void userLogin(String email, String password){
        emailTxtBox.sendKeys(email);
        passwordTxtBox.sendKeys(password);
    }


}
