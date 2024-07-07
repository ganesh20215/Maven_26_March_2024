package testng.dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {


    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test
    public void createANewUser(){
        System.out.println("Create a new user");
    }

    @Test(dependsOnMethods = "verifyLogin", alwaysRun = true)
    public void fundTransfer(){
        System.out.println("Fund Transfer");
    }
}
