package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderdetailsPage extends pagebase{

    public OrderdetailsPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(tagName = "h1")
    public WebElement orderinfoheader;

    @FindBy (linkText = "PDF Invoice")
    WebElement pdfInvoice;

    @FindBy (linkText = "Print")
    WebElement printBtn;

    public void DownloadpdfInvoice() throws InterruptedException {
        pdfInvoice.click();
        Thread.sleep(2000);
    }

    public void printInvoice() throws InterruptedException {
        printBtn.click();
        Thread.sleep(2000);
    }




}

