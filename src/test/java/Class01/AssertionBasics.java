package Class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertionBasics {
    public  static WebDriver driver;
    @BeforeMethod
    public  void SetupBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
       // driver.quit();
    }
    @Test
    public void InvalidCredentials(){
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement pasword = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        pasword.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        loginBtn.click();
//verify the error message
        WebElement error = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String errorMsg = error.getText();
//        check if the error message is correct
        String expectedError = "Invalid credentials";
        Assert.assertEquals(expectedError,errorMsg);


       // password text box is displayed
        WebElement pasword1 = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        boolean paswrdDisplayed = pasword1.isDisplayed();
//        verify that the text box is displayed
        Assert.assertTrue(paswrdDisplayed);





    }
}
