package Class01;

import org.testng.annotations.Test;

public class dependOn {

    @Test
    public void Login(){
        System.out.println("i");

    }
    @Test(dependsOnMethods = {"Login"})
    public void DashBoarVerification(){
        System.out.println("after");

    }

}
