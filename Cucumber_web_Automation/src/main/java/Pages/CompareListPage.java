package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CompareListPage extends pagebase{
    public CompareListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    public WebElement CompareProductsHeader;

    @FindBy (css = "tr[class = \"product-name\"] td[style =\"width:45%\"] a")
    public List<WebElement> productList;
}
