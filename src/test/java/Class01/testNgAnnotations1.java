package Class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNgAnnotations1 {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("i am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("i am after method");
    }
    @Test
    public void aFirstTestCase(){
        System.out.println("i am the first test case");
    }
    @Test
    public void bsecondTestcase(){
        System.out.println("i am the second test case");
    }
    @Test
    public void cthirdtestcase(){
        System.out.println("i am the third test case");
    }
}
