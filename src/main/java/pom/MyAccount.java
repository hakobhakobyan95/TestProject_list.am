package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumUtils;

public class MyAccount extends Screen {
    private WebDriver driver;
    SeleniumUtils utils;

    public MyAccount(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new SeleniumUtils(driver);
    }

    //This is id of settings button
    private By settingButton = By.id("idTabProfile");

    /*This is for clicking settings button*/
    public MyAccount clickSettingsButton() {
        utils.click(userName);
        utils.click(settingButton);
        return this;
    }

    //
    private By locationSection = By.id("_idlocation");

    /**/
    public MyAccount selectLocation() {
        utils.select(locationSection, "7");
        return this;
    }

    //
    private By saveButton = By.id("edit_profileaction__form_action0");

    /**/
    public void clickSaveButton() {
        utils.click(saveButton);
    }

    //test case 21
    //name field
    private By myName = By.id("_idyour_name");

    public MyAccount changeName() throws InterruptedException {
        utils.clearField(myName);
        utils.sendKeys(myName, "Hayk");
        return this;
    }


    // for Case 22**************************************************************************************************
    //move to username
    private By userName = By.id("ma");
    //move to Ads
    private By ads = By.xpath("//a[contains(text(),'Post to Classifieds')]");
    //Post to classifieds button
    private By post = By.xpath("//a[@class='bblink']");
    //marketplace
    private By marketplace = By.xpath("//a[contains(text(),'Marketplace')]");
    //Everything else
    private By everything = By.xpath("//body//a[12]");
    //Title field
    private By title = By.id("_idtitle");
    //Description field
    private By description = By.id("_iddescription");
    //Preview button
    private By preview = By.id("postaction__form_action0");

    private void adPosting() throws InterruptedException {
        utils.click(ads);
        utils.click(marketplace);
        utils.click(everything);
    }

    public MainPage invalidTitle() throws InterruptedException {
        adPosting();
        utils.sendKeys(title, "Book");
        utils.sendKeys(description, "A Farewell to Arms is a novel by Ernest Hemingway set during " +
                "the Italian campaign of World War I.");
        utils.click(preview);
        MainPage myAccount = new MainPage(driver);
        return myAccount;
    }

    //test case 23 *****************************************************************************************************
    private By editButton = By.xpath("//div[3]//div[1]//div[2]//div[2]//a[1]");

    public MyAccount clickEditButton() {
        utils.moveToElement(userName);
        utils.click(userName);
        utils.click(editButton);
        return this;
    }

    //
    private By descriptionField = By.id("_iddescription");

    public MyAccount summeryEditing() throws InterruptedException {
        utils.sendKeys(descriptionField, "This message is for verification");
        return this;
    }

    //
    private By previewButton = By.id("postaction__form_action0");

    public MyAccount clickPreviewButton() throws InterruptedException {
        utils.click(previewButton);
        Thread.sleep(3000);
        return this;
    }


    // for Case 24 *****************************************************************************************************
    private By favAds = By.xpath("//div[contains(text(),'Favorite Ads')]");
    private By heartButton = By.xpath(("//div[@class='off']"));

    public MainPage FavouriteAdsPage() {
        utils.click(heartButton);
        utils.moveToElement(userName);
        utils.moveToElement(favAds);
        utils.click(favAds);
        MainPage myAccount = new MainPage(driver);
        return myAccount;
    }

    //for case 25
    private By unlike = By.xpath("//div[@class='star']");

    public MainPage removeFav() throws InterruptedException {
        utils.moveToElement(userName);
        utils.moveToElement(favAds);
        utils.click(favAds);
        Thread.sleep(2000);
//        utils.moveToElement(unlike);
        utils.click(unlike);
        MainPage myAccount = new MainPage(driver);
        return myAccount;
    }


    //for case 26
    private By deactivate = By.xpath("//*[@id=\"main\"]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/a[2]/img");

    public MyAccount clickDeactivateButton() throws InterruptedException {
        utils.click(userName);
        utils.click(deactivate);
        Thread.sleep(3000);
        return this;
    }

    //
    private By deactivatePopUp = By.id("submit_dlg_button");

    public MyAccount clickDeactivatePopUp() throws InterruptedException {
        utils.click(deactivatePopUp);
        Thread.sleep(3000);
        return this;
    }


    //for case 27

    private By settingButtonClick = By.id("idTabProfile");

    public MyAccount settingButtonClick() {
        utils.click(settingButtonClick);
        return this;
    }

    //
    private By contactInfoButton = By.xpath("//div[@id='tabmenu']//div[2]//a[1]");

    public MyAccount clickContactInfo() throws InterruptedException {
        utils.click(contactInfoButton);
        return this;
    }

    //
    private By addButton = By.xpath("//div[@id='tabcontent']//div[2]//div[2]//div[1]//div[1]//a[1]");

    public MyAccount clickAddButton() throws InterruptedException {
        utils.click(addButton);
        return this;
    }

    //
    private By viberPopUp = By.id("_idviber");
    private By clickSaveButton = By.id("submit_dlg_button");

    public MyAccount inputPopUp() throws InterruptedException {
        utils.sendKeys(viberPopUp, "091666061");
        utils.click(clickSaveButton);
        return this;
    }

    //for case 28
    private By messages = By.xpath("//body//a[4]");

    public MainPage goToMessages() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        utils.moveToElement(userName);
        utils.moveToElement(messages);
        utils.click(messages);
        return new MainPage(driver);
    }
}
