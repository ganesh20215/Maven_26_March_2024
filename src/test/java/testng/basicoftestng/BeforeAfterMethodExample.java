package testng.basicoftestng;

import org.testng.annotations.*;

public class BeforeAfterMethodExample {

    @BeforeClass
    public void beforeClassDemo(){
        System.out.println("Before Class Demo");
    }

    @AfterClass
    public void afterClassDemo(){
        System.out.println("After Class Demo");
    }

    @BeforeMethod
    public void beforeMethodDemo(){
        System.out.println("Before Method");
    }

    @Test
    public void nameTest_1(){
        System.out.println("Name Test 1");
    }

    @Test
    public void nameTest_2(){
        System.out.println("Name Test 2");
    }

    @Test
    public void nameTest_3(){
        System.out.println("Name Test 3");
    }

    @AfterMethod
    public void afterMethodDemo(){
        System.out.println("After Method");
    }
}
