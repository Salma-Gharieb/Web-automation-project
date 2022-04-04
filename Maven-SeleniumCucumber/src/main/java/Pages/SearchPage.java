package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends pagebase{

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="small-searchterms")
    WebElement searchTxtBox;

    @FindBy(css = "button.button-1.search-box-button")
    WebElement searchbtn;

    @FindBy(id="ui-id-1")
    List<WebElement> productList;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")
    WebElement productTitle;



    public void searchForItem(String searcheditem)
    {
        searchTxtBox.sendKeys(searcheditem);
        searchbtn.click();
    }


    public void openProductDetailsPage()
    {
        productTitle.click();
    }

    public void SearchItemBySuggest(String searchtxt) throws InterruptedException
    {
        searchTxtBox.sendKeys(searchtxt);
        Thread.sleep(1000);
        productList.get(0).click();
    }
}
