package Class01;

import org.testng.annotations.Test;

public class priority {
    @Test(priority = 2)
    public void Atest(){
        System.out.println("i am test A ");
    }
    @Test(priority = 1)
    public void Btest(){
        System.out.println("i am TestB");
    }


    @Test(priority = 3)
    public void Ctest(){
        System.out.println("i am TestC");
    }

}
