package pom.resultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.MainPage;
import pom.Screen;
import utils.SeleniumUtils;

import java.util.List;

public class ClothingAndFashion extends Screen {
    WebDriver driver;
    SeleniumUtils utils;

    public ClothingAndFashion(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new SeleniumUtils(driver);
    }


    //This "NEW" checkbox
    By newCondition = By.id("idcnd0");

    /*This method chose NEW condition*/
    public MainPage setNewCondition() throws InterruptedException {
        utils.click(newCondition);
        Thread.sleep(5000);
        MainPage mainPage = new MainPage(driver);
        return mainPage;
    }

    //This is selection for size of shoes
    By selectSizeSection = By.xpath("//select[@name='_a6']");

    /*This method select size of shoes 43*/
    public MainPage setSelectSize() {
        utils.select(selectSizeSection, "86");
        MainPage mainPage = new MainPage(driver);
        return mainPage;
    }


//
    By locationField = By.id("locList");

    /*This method choose Yerevan from location section*/
    public MainPage setLocation(){
        utils.select(locationField,"3");
        MainPage mainPage = new MainPage(driver);
        return mainPage;
    }


}
