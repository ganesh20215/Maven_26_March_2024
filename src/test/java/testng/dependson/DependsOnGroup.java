package testng.dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = {"smoke"})
    public void verifyFundTransfer(){
        Assert.assertTrue(false);
        System.out.println("Verify Fund Transfer");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyFundsTransferWithSaving(){
        System.out.println("verify Funds Transfer With Saving");
    }

    @Test
    public void verifyCashBackOffer(){
        System.out.println("verify CashBack Offer");
    }
}
