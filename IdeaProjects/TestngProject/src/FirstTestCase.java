import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestCase {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahanp\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("this is to opening browsers");
    }

    @Test(priority = 1)
    void logo() {
        WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
        Assert.assertTrue(logo.isDisplayed(), "logo not present");
        System.out.println("this is the logo");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("this is to login");
    }

    @Test(priority = 3)
    void close() {
        System.out.println("this is to closing all browers");
    }
}
