package ResultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.MainPage;
import pom.Screen;
import utils.SeleniumUtils;

public class ListPage extends Screen {

    WebDriver driver;
    SeleniumUtils utils;

    public ListPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new SeleniumUtils(driver);

    }

    By locElement = By.id("locList");
    public MainPage locationYerevan() {
        utils.select(locElement, "8");
        MainPage mainPage = new MainPage(driver);
        return mainPage;
    }

    By chosenItem = By.xpath("//div[@id='tp']//a[1]//img[1]");
    /*This method is for item choosing*/
    public MainPage chooseItem() {
        utils.click(chosenItem);
        MainPage mainPage = new MainPage(driver);
        return mainPage;
    }


}
