package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class DriverSettings {
    String url = "https://www.list.am/en/";
    protected WebDriver webDriver;
    WebDriverWait wait;
    Actions builder;


    public ChromeDriver initChromeDriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get(url);
        wait = new WebDriverWait(chromeDriver, 150);
        builder = new Actions(chromeDriver);
        return chromeDriver;
    }


    @BeforeMethod
    public void setUpWebDriver() throws InterruptedException {
        System.out.println("chrome was init");
        webDriver = initChromeDriver();
    }

    @AfterMethod
    public void afterTest() {
        webDriver.quit();
    }

}
