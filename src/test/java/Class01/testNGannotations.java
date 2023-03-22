package Class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGannotations {
    @BeforeMethod
    public  void before(){
        System.out.println("i am before");
    }
    @Test
    public void afirstTestCase(){
        System.out.println("i am the first test case");
    }
    @Test
    public void secondTestCase(){
        System.out.println("Second test case");

    }
    @Test
    public void thirdTestCase(){
        System.out.println("third test case");
    }
    @AfterMethod
    public void After(){
        System.out.println("i am after the method");
    }



}
