package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends pagebase{

    public CheckoutPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(css="button.button-1.checkout-as-guest-button")
    WebElement checkoutasguestBtn;

    @FindBy(id ="BillingNewAddress_FirstName")
    WebElement firstName;

    @FindBy (id="BillingNewAddress_LastName")
    WebElement lastName;

    @FindBy (id="BillingNewAddress_Email")
    WebElement Email;

    @FindBy (id ="BillingNewAddress_CountryId")
    WebElement countryMenu;

    @FindBy (id="BillingNewAddress_City")
    WebElement cityTxtbox;

    @FindBy(id="BillingNewAddress_Address1")
    WebElement Address1Txtbox;

    @FindBy (id="BillingNewAddress_ZipPostalCode")
    WebElement zipCode;

    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;

    @FindBy (css="button.button-1.new-address-next-step-button")
    WebElement continueBtn1;

    @FindBy (id="shippingoption_1")
    WebElement shippingOption;

    @FindBy (css="button.button-1.shipping-method-next-step-button")
    WebElement continueBtn2;

    @FindBy (css="button.button-1.payment-method-next-step-button")
    WebElement continueBtn3;

    @FindBy (css="button.button-1.payment-info-next-step-button")
    WebElement continueBtn4;

    @FindBy (css="button.button-1.confirm-order-next-step-button")
    WebElement confirmBtn;

    @FindBy(tagName = "h1")
    public WebElement Thankyoulabel;

    @FindBy (linkText = "Click here for order details.")
    WebElement orderdetails;


    public void openCheckoutPageasGuest() {

        checkoutasguestBtn.click();
    }

    public void checkoutProduct(String fname, String lname, String email ,String country, String city,String Address, String zipcode, String phone) {

        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        Email.sendKeys(email);
        countryMenu.sendKeys(country);
        cityTxtbox.sendKeys(city);
        Address1Txtbox.sendKeys(Address);
        zipCode.sendKeys(zipcode);
        phoneNumber.sendKeys(phone);

        continueBtn1.click();
        shippingOption.click();
        continueBtn2.click();
        continueBtn3.click();
        continueBtn4.click();

    }

    public void confirmOrder() throws InterruptedException {

        confirmBtn.click();
        Thread.sleep(2000);
    }

    public void openOrderdetailsPage() {

        orderdetails.click();
    }
}



