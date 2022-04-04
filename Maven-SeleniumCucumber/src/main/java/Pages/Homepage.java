package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends pagebase{
    public Homepage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Register")
    WebElement Registrationlink;

    @FindBy(linkText = "Log in")
    WebElement LoginLink;

    public void openRegistrationPage()
    {
        Registrationlink.click();
    }

    public void openLoginPage()
    {
        LoginLink.click();
    }
}
