package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(id = "small-searchterms")
    public WebElement searchtextbox;
    @FindBy(className = "search-box-button")
    public WebElement searchboxbutton;
    @FindBy(className = "ico-logout")public WebElement logoutlink;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void entertext(String data) {
     searchtextbox.sendKeys(data);

    }
    public void clicksearchbutton(){
        searchboxbutton.click();
    }

public void openurl(String url){
        driver.navigate().to(url);
}
public String getpagetitile(){
        return driver.getTitle();
}
public void verifylogout(){
        logoutlink.isDisplayed();
    }
}