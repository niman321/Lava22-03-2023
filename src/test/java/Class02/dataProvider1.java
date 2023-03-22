package Class02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dataProvider1 {
    public  static WebDriver driver;
    //    dataprovider
    @DataProvider(name="credentials")
    public Object[][] data(){
        Object[][] loginData={
                {"Admin", "12345", "Invalid credential"},
                {"ABCD", "Hum@nhrm123", "Invalid credentials"},
                {"Admin", "", "Password cannot be empt"},
                {"", "Hum@nhrm123", "Username cannot be empt"}
        };
        return  loginData;
    }

    @Test(dataProvider = "credentials")//connect you test case with a data provider
    public void invalidCredentials(String username,String password,String errorMsg){
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id = 'txtPassword']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

//       get the error message
        WebElement error = driver.findElement(By.xpath("//span[text()='Username cannot be empty']"));
        String actualError = error.getText();

        Assert.assertEquals(actualError,errorMsg);


    }

    @BeforeMethod
    public void SetupBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
                driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void closeBrowser(){

        driver.quit();
    }
}

