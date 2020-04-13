package pom.resultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.MainPage;
import pom.Screen;
import utils.SeleniumUtils;

import java.util.List;

public class ClothingAndFashion extends Screen {
    private WebDriver driver;
    SeleniumUtils utils;

    public ClothingAndFashion(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new SeleniumUtils(driver);
    }


    //This "NEW" checkbox
    private By newCondition = By.id("idcnd0");

    /*This method chose NEW condition*/
    public MainPage setNewCondition() throws InterruptedException {
        utils.click(newCondition);
        Thread.sleep(5000);
        MainPage mainPage = new MainPage(driver);
        return mainPage;
    }

    //This is selection for size of shoes
    private By selectSizeSection = By.xpath("//select[@name='_a6']");

    /*This method select size of shoes 43*/
    public MainPage setSelectSize() {
        utils.select(selectSizeSection, "86");
        return new MainPage(driver);
    }


    //
    private By locationField = By.id("locList");

    /*This method choose Yerevan from location section*/
    public MainPage setLocation() {
        utils.select(locationField, "3");
        return new MainPage(driver);
    }


}
