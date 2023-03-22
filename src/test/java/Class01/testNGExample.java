package Class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNGExample {
    public static WebDriver driver;
    @BeforeMethod
    public void SetupBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

     @AfterMethod
    public void CloseBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

     }

     //test case 1
     @Test
     public void loginFunctionality () {
         WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
         username.sendKeys("Admin");
         WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
         password.sendKeys("Hum@nhrm123");
         WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
         loginBtn.click();
     }

     @Test
    public void passwordVerification(){
        WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
         System.out.println(password.isDisplayed());
     }


}
