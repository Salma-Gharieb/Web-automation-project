package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends PageBase{

	public Homepage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver); 
	}
	
	@FindBy(linkText = "Register")
	WebElement Registrationlink;
	
	
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(linkText = "Contact us")
	WebElement ContactUsLink;

	@FindBy(id="customerCurrency")
	WebElement CurrencyList;
	
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
	WebElement ComputersList;
	
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a")
	WebElement Notebookslink;
	
	
	
	public void openRegistrationPage() 
	{
		clickButton(Registrationlink);
	}
	
	public void openLoginPage() 
	{
		clickButton(LoginLink);
	}
	
	public void openContactusPage()
	{
		scrolling();
		clickButton(ContactUsLink);
	}
	
	public void changeCurrency()
	{
		select = new Select(CurrencyList);
		select.selectByVisibleText("Euro");
	}
	
	public void openNotebooksPage()
	{
		action.moveToElement(ComputersList).moveToElement(Notebookslink).click().build().perform();
	}
	
}
