package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

public class Hook  {

    public static WebDriver driver;
    public static String firstname = "test";
    public static String lastname = "user";
    public static String Email = "testuser@gmail.com";
    public static String password = "12345678";

    @Before
    public static void startDriver()
    {

        String chromepath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromepath);
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @After
    public static void stopDriver()
    {
        driver.quit();
    }
}
