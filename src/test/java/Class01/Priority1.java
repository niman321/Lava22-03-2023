package Class01;

import org.testng.annotations.Test;

public class Priority1 {
    @Test(priority = 1)
    public void aFirstTestCase(){
        System.out.println("i am the first test case A");
    }
    @Test(priority = 3)
    public void bsecondTestcase(){
        System.out.println("i am the second test case B");
    }
    @Test(priority = 2)
    public void cthirdtestcase(){
        System.out.println("i am the third test case C");
    }
}
