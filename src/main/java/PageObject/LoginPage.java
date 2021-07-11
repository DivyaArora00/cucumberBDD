package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    //locators
        @FindBy(className = "ico-login") public WebElement loginlink;
        @FindBy(id = "Email") public WebElement emailtextbox;
        @FindBy(id = "Password") public WebElement passwordtextbox;
        @FindBy(className = "login-button") public WebElement loginButton;
        @FindBy(linkText = "Forgot password?")public WebElement frgtpswdlink;
        @FindBy(css = "input#Email") public WebElement eMailforPasswordTextBox;
        @FindBy(className = "password-recovery-button") public WebElement RecoveryButton;
        @FindBy(css = "div.result") public WebElement confirmmsg;

//constructor
public LoginPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver,this);


    }
        //actions
        public void clickloginlink(){
        loginlink.click();
    }
        public void enteremail(String emailid){
        emailtextbox.sendKeys(emailid);
    }
        public void enterpassword(String password){
        passwordtextbox.sendKeys(password);
    }
        public void clickloginbutton(){
        loginButton.click();
    }
    public void clickforgortpasswordlink(){
    frgtpswdlink.click();
    }
    public void enteremailforrecovery(String emailid){
    eMailforPasswordTextBox.sendKeys(emailid);
    }
    public void clickrecoverybutton(){
    RecoveryButton.click();
    }

    public void printconfirmmsg(){
    confirmmsg.getText();
        System.out.println(confirmmsg);
    }
    }


