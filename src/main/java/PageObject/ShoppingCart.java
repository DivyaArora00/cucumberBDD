package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart {
    WebDriver driver;
    @FindBy(linkText = "Computers ") public WebElement SelectComputersCategory;
    @FindBy(linkText = "Software") public WebElement ClickSoftware;
    @FindBy(linkText = "Windows 8 Pro") public WebElement clickwindows8pro;

}
