package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumUtils;

import java.util.List;

public class AssertFor extends Screen {
    WebDriver driver;
    SeleniumUtils utils;

    public AssertFor(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new SeleniumUtils(driver);
    }

    //for case 1
    //Find element that show condition new
    By newCondition = By.xpath("//div[contains(text(),'New')]");

    /*This is for finding assertion for Test Case ID.1*/
    public String getCondition() throws InterruptedException {
//        Thread.sleep(4000);
        System.out.println(utils.getText(newCondition));
        return utils.getText(newCondition);
    }

    //for case 2
    //    Find element that show number 43
    By shoesNumber = By.xpath("//div[@class='i'][contains(text(),'43')]");

    /*This is for finding assertion for Test Case ID.2*/
    public String getNumberOfShoes() {
        System.out.println(utils.getText(shoesNumber));
        return utils.getText(shoesNumber);
    }

    //for case 3
    //This elemnt for select location after searching

    /*From this method we give a location???????????????????????????*/
    public String getLocation() {
        System.out.println(utils.getText(locationYerevan));
        return utils.getText(locationYerevan);
    }

    //for Case 4
//Assert for Apartment construction type
    By type = By.xpath("//div[contains(text(),'Stone')]");

    public String getConstructionType() throws InterruptedException {
        Thread.sleep(4000);
        return utils.getText(type);
    }

    //for case 5
//Assert for Apartment room
    By room = By.xpath("//body/div/div[@class='pmain']/div/div[@class='vi']/div[2]/div[2]/div[2]");

    public String getApartmentRoom() throws InterruptedException {
        Thread.sleep(4000);
        return utils.getText(room);
    }

    //for Case 6
//Assert for Apartment floor
    By floor = By.xpath("//div[@class='vi']//div[4]//div[2]");

    public String getApartmentFloor() throws InterruptedException {
        Thread.sleep(4000);
        return utils.getText(floor);
    }

    //for Case 7
//Assert for Apartment living space
    By space = By.xpath("//div[contains(text(),'60 m')]");

    public String getApartmentSpace() throws InterruptedException {
        Thread.sleep(4000);
        return utils.getText(space);
    }

    //for case 8
    By element1 = By.id("bList");

    public String getMarkName() throws InterruptedException {
        WebElement element = driver.findElement(By.id("bList"));
        Thread.sleep(4000);
        System.out.println(element.getText());
        return utils.getText(element1);
    }

    //for case 9
    By bodyTYpe = By.name("_a27");

    public String getBodyType() throws InterruptedException {
        WebElement element = driver.findElement(By.name("_a27"));
        Thread.sleep(4000);
        System.out.println(element.getText());
        return utils.getText(bodyTYpe);
    }


    //for case 10
    By year = By.name("_a2_1");

    public String getYear() throws InterruptedException {
        WebElement element = driver.findElement(By.className("_a2_1"));
        Thread.sleep(4000);
        System.out.println(element.getText());
        return utils.getText(year);
    }


    //for case 11
    By engineType = By.name("_a15");

    public String getEngineType() throws InterruptedException {
        WebElement element = driver.findElement(By.name("_a15"));
        Thread.sleep(4000);
        System.out.println(element.getText());
        return utils.getText(engineType);
    }
  //for case 12
    By pathPage = By.id("crumb");
    public String getPagePath(){
        System.out.println(utils.getText(pathPage));
        return  utils.getText(pathPage);
    }

//for case 13
    By agencyXpath = By.xpath("//span[@class='clabel']");
    public String getAgencyType(){
        System.out.println(utils.getText(agencyXpath));
        return utils.getText(agencyXpath);
    }


    //for case 14
    By locationYerevan = By.xpath("//div[@class='loc']//a");

    public String locationVerify() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//div[@class='loc']//a"));
        Thread.sleep(4000);
        System.out.println(element.getText());
        return utils.getText(locationYerevan);
    }


    //for case 15
//Assert for no result
    By wrongFloor = By.xpath("//div[@class='notfound']");

    public String getApartmentWrongFloor() throws InterruptedException {
        Thread.sleep(4000);
        return utils.getText(wrongFloor);
    }

    //for case 16
//Assert for employment type
    By permanent = By.xpath("//div[contains(text(),'Permanent')]");

    public String getemploymentType() throws InterruptedException {
        Thread.sleep(4000);
        return utils.getText(permanent);
    }

    //for case 17
//Assert for job schedule
    By schedule = By.xpath("//div[contains(text(),'Full time')]");

    public String getJobSchedule() throws InterruptedException {
        Thread.sleep(4000);
        return utils.getText(schedule);
    }


    //for case 18
    By generalInfo = By.className("grp");

    public String translatedInfo() throws InterruptedException {
        WebElement element = driver.findElement(By.className("grp"));
        Thread.sleep(4000);
        System.out.println(element.getText());
        return utils.getText(generalInfo);
    }


    //    for case 19
    By crumbName = By.className("crumbnb");

    public String getCrumbName() throws InterruptedException {
        WebElement element = driver.findElement(By.className("crumbnb"));
        Thread.sleep(4000);
        System.out.println(element.getText());
        return utils.getText(crumbName);
    }


    //for case 20
//This is message "Information updated."
    By info = By.xpath("//div[@class='info']");

    /*After save info*/
    public String getInfoAfterSave() {
        System.out.println(utils.getText(info));
        return utils.getText(info);
    }



    //for case 22
//Assert for error text for shor title
    By errorMessage = By.xpath("//div[contains(text(),'This field is too short')]");
    public String getErrorMessage() throws InterruptedException {
        Thread.sleep(5000);
        return utils.getText(errorMessage);
    }

//    for case 23
    /*Test case ID23 This assert is for checking text changes in ads*/
    By changedText = By.xpath("//div[@class='body']");
    public String changeVerification() throws InterruptedException{
        Thread.sleep(4000);
        return utils.getText(changedText);
    }


    //for case 24
//Assert that there is 1 Fav ad
    By adCount = By.xpath("//span[contains(text(),'2')]");
    public String getFavAdCount() throws InterruptedException {
        Thread.sleep(5000);
        return  utils.getText(adCount);
    }

    // for case 25
    By count = By.xpath("//span[contains(text(),'1')]");
    public String getFavRemovedCount() throws InterruptedException {
        Thread.sleep(4000);
        return utils.getText(count);
    }
//    dor case 26
    /*Test case ID26 This assert is for checking ads deleting*/
    By inactiveNumber = By.xpath("//span[@class='i']");
    public String inactiveAds() throws InterruptedException{
        Thread.sleep(3000);
        return utils.getText(inactiveNumber);
    }

    /*Test ID27 This assert is checking whether Viber number is being added*/
    By viberNumberCheck = By.xpath("//div[@class='i viber']//div[1]");
    public String viberNumberVerification() throws InterruptedException{
        Thread.sleep(3000);
        return utils.getText(viberNumberCheck);
    }


    // for case 30
    By page = By.xpath("//span[@class='c']");
    public String getCurrentPage() throws InterruptedException {
        Thread.sleep(5000);
        return utils.getText(page);
    }
}
