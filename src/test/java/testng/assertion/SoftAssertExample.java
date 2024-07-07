package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testng.failtestcases.FailTestScriptsRuns;

public class SoftAssertExample {

    @Test
    public void verifySoftAssertStatement(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        String textTitle = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
        softAssert.assertEquals(textTitle, "create a Rediffmail account", "Text should be Create a Rediffmail account");
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
        softAssert.assertTrue(userNameTextBox.isDisplayed(), "user name text box should be displayed..");
        softAssert.assertAll();
    }

    @Test
    public void verifySoftAssertStatement_2(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void verifySoftAssertStatement_3(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.close();
    }

}
