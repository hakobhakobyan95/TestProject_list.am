package pom.resultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import pom.MainPage;
import pom.Screen;
import utils.SeleniumUtils;

import java.util.List;

public class ComputersInternet extends Screen {

    private WebDriver driver;
    SeleniumUtils utils;

    public ComputersInternet(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new SeleniumUtils(driver);
    }

    //for test CASE 16
    // Get Employment type type drop down

    private By employment = By.xpath("//select[@name='_a8']");


    /*This method chooses Permanent time as Employment type*/
    public MainPage setEmploymentType() throws InterruptedException {
        utils.select(employment, "1");
        MainPage constType = new MainPage(driver);
        Thread.sleep(5000);
        return constType;
    }


    //For test CASE 17
    //Get Job Schedule
    private By schedule = By.xpath("//select[@name='_a9']");

    //This method chooses job schedule
    public MainPage setJobSchedule() {
        utils.select(schedule, "1");
        MainPage scheduleType = new MainPage(driver);
        return scheduleType;
    }


}
