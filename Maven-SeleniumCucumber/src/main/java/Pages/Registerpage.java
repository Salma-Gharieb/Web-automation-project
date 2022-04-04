package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends pagebase{

    public Registerpage(WebDriver driver) {
        super(driver);
    }

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
    public WebElement registerBtn;

    @FindBy(css = "div.result")
    public WebElement result;


    public void userRegistration(String firstname, String lastname,String email,String password)
    {
        fnTxtBox.sendKeys(firstname);
        lnTxtBox.sendKeys(lastname);
        emailTxtBox.sendKeys(email);
        passwordTxtBox.sendKeys(password);
        confirmPassword.sendKeys(password);
    }

}
