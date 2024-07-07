package testng.basicoftestng;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1, groups = {"smoke"})
    public void newTestCase_Z(){
        System.out.println("New Test Case Z");
    }

    @Test(priority = -1)
    public void newTestCase_M(){
        System.out.println("New Test Case M");
    }

    @Test(priority = 'c')
    public void newTestCase_F(){
        System.out.println("New Test Case F");
    }

    @Test(priority = 4)
    public void newTestCase_I(){
        System.out.println("New Test Case I");
    }

    @Test(priority = 5, enabled = true)
    public void newTestCase_Y(){
        System.out.println("New Test Case Y");
    }
}
