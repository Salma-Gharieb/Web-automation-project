package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class pagebase {
    protected WebDriver driver;
    public Actions action;

    public pagebase(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
