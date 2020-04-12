package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.resultPage.*;

import java.util.List;

public class MainPage extends Screen {
    WebDriver driver;

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

/*//This element choose button languages
    By allLanguages = By.xpath("//div[@id='lbar']");
//This is for choosing English language
    By englishLanguage = By.xpath("//a[contains(text(),'english')]");

    *//*This method change language to English*//*
    public MainPage selectEnglishLanguage(){
        utils.click(allLanguages);
        utils.click(englishLanguage);
        return this;
    }*/


    /*From this method we can choose any of content results*/
    By searchContent = By.id("contentr");

    public void contentGenerate() throws InterruptedException {
//        WebElement element = driver.findElement(By.xpath("//div[@id='tp']//div[@class='dl']"));
        WebElement element = driver.findElement(By.id("contentr"));
        List<WebElement> list = element.findElements(By.tagName("a"));
        Thread.sleep(5000);
        System.out.println(list.size());
        System.out.println(list.get(5));
        list.get(10).click();
    }

    //for case 28, finds the list of messages
    public void findMessageList() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//div[@class='dlmsg']"));
        List<WebElement> list = element.findElements(By.tagName("a"));
        Thread.sleep(2000);
        System.out.println(list.size());
        list.get(6).click();
        System.out.println("Click on message");
    }



    // This is for choosing "All Categories" section
    By allCategories = By.xpath("//span[contains(text(),'All Categories')]");
    //
    By clothAndFashion = By.xpath("//div[@class='w']//div//div//a[contains(text(),'Clothing and Fashion')]");
    //
    By menShoes = By.xpath("//div[@class='c']//span//div//a[contains(text(),\"Men's Shoes\")]");

    /*This method for going all categories to "Men's shoes" section*/
    public ClothingAndFashion goToMenShoesSection() {
        utils.moveToElement(allCategories);
        utils.moveToElement(clothAndFashion);
        utils.moveToElement(menShoes);
        utils.click(menShoes);
        return new ClothingAndFashion(driver);
    }

    //Navigates to Real Estate
    By realEstateSection = By.xpath("//div[@class='w']//div//div//a[contains(text(),'Real Estate')]");
    //Navigates to Apartment
    By apartment = By.xpath("//span[1]//div[1]//div[1]//div[1]//a[1]");

    /*This method goes to Real Estate - Apartment section */
    public RealEstate goToRealEstateSection() {
        utils.moveToElement(allCategories);
        utils.moveToElement(realEstateSection);
        utils.moveToElement(apartment);
        utils.click(apartment);
        return new RealEstate(driver);
    }


    //Navigate to Jobs
    By jobs = By.xpath("//div[@class='c']//a[contains(text(),'Jobs')]");
    //Navigate to Computers and internet
    By computers = By.xpath("//span[14]//div[1]//div[1]//a[4]");

    //This method goes to Jobs - Computers and internet section
    public ComputersInternet goToJobsSection() {
        utils.moveToElement(allCategories);
        utils.moveToElement(jobs);
        utils.moveToElement(computers);
        utils.click(computers);
        return new ComputersInternet(driver);
    }


    /*This method is responsible for acting with vehicles*/
    By vehicle = By.xpath("//*[@id=\"menu\"]/div/div[1]/div/div/span[2]/a");
    By passengersCars = By.xpath("//*[@id=\"menu\"]/div/div[1]/div/div/span[2]/div/div[1]/div[1]/a[1]");

    public ResultPage.Vehicles goToVehicleSection() {
        utils.moveToElement(allCategories);
        utils.moveToElement(vehicle);
        utils.moveToElement(passengersCars);
        utils.click(passengersCars);
        return new ResultPage.Vehicles(driver);
    }

    By searchBoxArea = By.id("idSearchBox");
    By clickButton = By.xpath("//form[@id='idSearchF']//button");

    public void crumbName() throws InterruptedException {
        utils.sendKeys(searchBoxArea, "Cars");
        utils.click(clickButton);
    }

    By help = By.xpath("//div[@class='r']//a[1]");
    By languageEnglish = By.className("en");
    By languageArmenian = By.className("am");

    public void translatedInfo() throws InterruptedException {
        utils.click(help);
        Thread.sleep(3000);
        utils.click(languageEnglish);
        Thread.sleep(2000);
        utils.click(languageArmenian);
        Thread.sleep(3000);
    }

    By services = By.xpath("//body/div[@id='menu']/div[@class='w']/div/div/div[@class='c']/span[13]/a[1]");
    By carRentals = By.xpath("//span[13]//div[1]//div[1]//div[2]//a[2]");

    public ResultPage.ListPage rental() {
        utils.moveToElement(allCategories);
        utils.moveToElement(services);
        utils.moveToElement(carRentals);
        utils.click(carRentals);
        ResultPage.ListPage listPage = new ResultPage.ListPage(driver);
        return listPage;
    }


    //log in
    By myAccount = By.id("ma");
    //
    By emailField = By.id("_idyour_email");
    //
    By passwordFiled = By.id("_idpassword");
    //
    By logInButton = By.id("loginaction__form_action0");
    //
    By mainPageButton = By.xpath("//a[@id='l']");

    /**/
//    public void logIn() throws InterruptedException {
//        utils.click(myAccount);
//        utils.sendKeys(emailField, "testforlist@mailinator.com");
//        utils.sendKeys(passwordFiled, "AutomationCourse");
//        utils.click(logInButton);
//
//    }

    By settingPage = By.xpath("//div[contains(text(),'Settings')]");

    public MyAccount settingsPage() {
//        utils.click(mainPageButton);
        System.out.println("jbkvsdhjjvfdbcxmbvxcm");
        utils.moveToElement(myAccount);
        utils.click(settingPage);
        MyAccount myAccount = new MyAccount(driver);
        return myAccount;
    }


    //This button for choose Pets and Plants
    By petsAndPlants = By.xpath("//body//span[10]");
    //This button for chose House Plants in Pets and Plants section
    By housePlants = By.xpath("//a[contains(text(),'House Plants')]");

    //    For case 12 redirected functionality
    public PetsAndPlants redirectToHousePlants() {
        utils.moveToElement(allCategories);
        utils.moveToElement(petsAndPlants);
        utils.click(housePlants);
        PetsAndPlants petsAndPlants = new PetsAndPlants(driver);
        return petsAndPlants;
    }

    By jobsSection = By.xpath("//div[@class='c']//a[contains(text(),'Jobs')]");
    By officeAndSecretary = By.xpath("//a[contains(text(),'Office and Secretary')]");

    //    For test case 13
    public Jobs jobsSection() {
        utils.moveToElement(allCategories);
        utils.moveToElement(jobsSection);
        utils.click(officeAndSecretary);
        Jobs jobs = new Jobs(driver);
        return jobs;
    }

//
    By searchField = By.id("idSearchBox");
//
    By searchButton = By.xpath("//form[@id='idSearchF']//button");
    public void typeInSearchField() throws InterruptedException {
        utils.sendKeys(searchField,"Cars");
        utils.click(searchButton);
        utils.clearField(searchField);
        utils.click(searchButton);
    }

    public MyAccount logIn() throws InterruptedException {
        utils.click(myAccount);
        utils.sendKeys(emailField, "haykharutyunyan68@gmail.com");
        utils.sendKeys(passwordFiled, "hamars-666061");
        utils.click(logInButton);
        utils.click(mainPageButton);
        MyAccount myAccount = new MyAccount(driver);
        return myAccount;
    }

    //for case 30
    By page5 = By.xpath("//a[contains(text(),'5')]");
    By gridView = By.xpath("//a[@class='grid s']");
    public MainPage moveToOtherPage(){
        utils.moveToElement(allCategories);
        utils.moveToElement(realEstateSection);
        utils.moveToElement(apartment);
        utils.click(apartment);
        utils.moveToElement(page5);
        utils.click(page5);
        utils.moveToElement(gridView);
        utils.click(gridView);
        MainPage mainPage = new MainPage(driver);
        return mainPage;
    }
}
