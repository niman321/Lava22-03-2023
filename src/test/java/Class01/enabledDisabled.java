package Class01;

import org.testng.annotations.Test;

public class enabledDisabled {
    @Test(enabled = false)
    public void Atest(){
        System.out.println("i am test A");
    }
    @Test
    public void Btest(){
        System.out.println("i am TestB");
    }


    @Test(enabled = false)
    public void Ctest(){
        System.out.println("i am TestC");
    }
}
