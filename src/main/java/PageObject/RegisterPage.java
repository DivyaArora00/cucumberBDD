package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterPage {
        WebDriver driver;
        @FindBy(className = "ico-register") public WebElement registerlink;
        @FindBy(id = "gender-female") public WebElement gender;
        @FindBy(id="FirstName") public WebElement frstname;
        @FindBy(id="LastName") public WebElement lastname;
        @FindBy(name = "DateOfBirthDay") public WebElement dateofbirth;
        @FindBy(name ="DateOfBirthMonth") public WebElement monthofbirth;
        @FindBy(name = "DateOfBirthYear") public WebElement yearofbirth;
        @FindBy(id= "Email") public WebElement Email;
        @FindBy(id = "Password") public WebElement passwrd;
        @FindBy(id ="ConfirmPassword") public WebElement confpswd;
        @FindBy(id = "register-button") public WebElement register;
        @FindBy(className = "result") public WebElement success;

        public RegisterPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);

        }
        public void clickregisterlink()
        {
            registerlink.click();
        }
        public void selectgender(){
            gender.isSelected();
    }
    public void enterfrstname(String firstName){
            frstname.sendKeys(firstName);
        }
        public void enterlastname(String lastName){
            lastname.sendKeys(lastName);
        }
        public void selectdate(String d){
            Select day = new Select(dateofbirth);
            day.selectByVisibleText(d);  // shall we fix it here or is there any way it can be changed?
        }
        public void selectmonth(){
            Select month = new Select(monthofbirth);
            month.selectByValue("7");
        }
        public void selectyear(){
            Select year = new Select(yearofbirth);
                    year.selectByIndex(3);
        }
        public void enteremail(String email){
            Email.sendKeys(email);
        }
        public void enterpass (String password){
            passwrd.sendKeys(password);
        }
        public void enterconfpass (String password){
            confpswd.sendKeys(password);
        }
        public void clickregisterbutton (){
            register.click();
        }
        public String registrationmsg(){
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOf(success));

          return  success.getText();

        }


}
