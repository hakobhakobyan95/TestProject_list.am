package pom.resultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.AssertFor;
import pom.Screen;
import utils.SeleniumUtils;

public class PetsAndPlants extends Screen {
    private WebDriver driver;
    SeleniumUtils utils;

    public PetsAndPlants(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new SeleniumUtils(driver);
    }

    //    This is job button
    private By jobsButton = By.xpath("//a[contains(text(),'Jobs')]");
    //    This is job > other section
    private By otherJobs = By.xpath("//div[@id='menu']//div[2]//a[7]");

    /*This method for go to job > other page*/
    public AssertFor goToJobsOther() {
        utils.moveToElement(jobsButton);
        utils.click(otherJobs);
        AssertFor assertFor = new AssertFor(driver);
        return assertFor;
    }
}
