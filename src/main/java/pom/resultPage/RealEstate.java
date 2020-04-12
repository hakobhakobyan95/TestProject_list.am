package pom.resultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import pom.MainPage;
import pom.Screen;
import utils.SeleniumUtils;

import java.util.List;

public class RealEstate extends Screen {

    WebDriver driver;
    SeleniumUtils utils;

    public RealEstate(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new SeleniumUtils(driver);
    }

    //for test CASE 4
    // Get construction type drop down

        By constructionType = By.xpath("//select[@name='_a5']");


    /*This method chooses Stone as construction type*/
    public MainPage setStoneType() throws InterruptedException {
        utils.select(constructionType, "1");
        MainPage constType = new MainPage(driver);
        Thread.sleep(5000);
        return constType;
    }


    // for test CASE 5
    //Get Room drop down
    By roomCount = By.xpath("//select[@name='_a4']");

    //This method chooses room count as 5
    public MainPage setRoomCount(){
        utils.select(roomCount, "5");
        MainPage room = new MainPage(driver);
        return room;
    }


    //For test CASE 6
    //Get Floor drop down 1
    By floor1 = By.xpath("//select[@name='_a11_1']");

    //Get Floor drop down 2
    By floor2 = By.xpath("//select[@name='_a11_2']");

    //This method chooses floor
    public MainPage setFloor (){
        utils.select(floor1, "4");
        utils.select(floor2, "4");
        MainPage floor = new MainPage(driver);
        return floor;
    }

    //For test CASE 7
    //Get living space input field 1
    By space1 = By.xpath("//input[@id='id_a3_1']");

    //Get living space input field 2
    By space2 = By.xpath("//input[@id='id_a3_2']");

    //Get element to assert filter
    By submit = By.xpath("//div[@class='r']//img");

    //This method sets living space
    public MainPage setLivingSpace() throws InterruptedException {
        utils.sendKeys(space1, "60");
        utils.sendKeys(space2, "60");
        utils.click(submit);
        MainPage livingSpace = new MainPage(driver);
        return livingSpace;
    }



    //Test case 15
    //This method chooses wrong range of floor
    public MainPage setWrongFloor (){
        utils.select(floor1, "4");
        utils.select(floor2, "2");
        MainPage floor = new MainPage(driver);
        return floor;
    }

}
