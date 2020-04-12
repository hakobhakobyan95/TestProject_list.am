package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumUtils;

public class Screen {
    SeleniumUtils utils;
    WebDriverWait wait;

    public Screen(WebDriver driver) {
        utils = new SeleniumUtils(driver);
        wait = new WebDriverWait(driver, 150);
    }
}

