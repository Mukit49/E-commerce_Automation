package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;



public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = DriverUtils.getDriver();
        //this.wait = new WebDriverWait(driver, );
        PageFactory.initElements(driver, this);
    }
}
