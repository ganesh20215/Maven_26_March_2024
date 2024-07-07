package testng.basicoftestng;

import org.testng.annotations.Test;

public class InvocationCountExample {


    @Test(invocationCount = 100000, invocationTimeOut = 1)
    public void invocationCountExample(){
        System.out.println("Demo For Invocation");
    }
}
