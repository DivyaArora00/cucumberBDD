package Base;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver;
    public static LoginPage loginPage;
    public static RegisterPage registerPage;
    public static HomePage homepage;

    @Before
        public static void setDriver()
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            loginPage = new LoginPage(driver);
            registerPage = new RegisterPage(driver);
            homepage =new HomePage(driver);
            //driver.navigate().to(driver.getCurrentUrl());
        }


        @After
        public void teardown(){
           // driver.quit();

        }
    }

