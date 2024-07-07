package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();            //Upcasting
    }

    @Test
    public void testCase1() {
        driver.navigate().to("https://www.apache.org/");
        driver.manage().window().maximize();
    }

    @Test
    public void testCase2() {
        driver.navigate().to("https://testng.org/");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }
}
