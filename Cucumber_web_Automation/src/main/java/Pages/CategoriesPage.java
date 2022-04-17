package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoriesPage extends pagebase{
    public CategoriesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.button-2.add-to-compare-list-button")
    public List<WebElement> Comparebutton;

    @FindBy(linkText = "product comparison")
    WebElement ComparePageLink;

    @FindBy(css = "div.bar-notification.success")
    public WebElement NotificationBar;

    public void openCompareListPage(){
        ComparePageLink.click();
    }
}
