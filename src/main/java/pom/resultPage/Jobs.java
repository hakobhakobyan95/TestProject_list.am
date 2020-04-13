package pom.resultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.AssertFor;
import pom.MainPage;
import pom.Screen;
import utils.SeleniumUtils;

public class Jobs extends Screen {
    private WebDriver driver;
    SeleniumUtils utils;

    public Jobs(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new SeleniumUtils(driver);
    }

    private By agencyButton = By.xpath("//label[contains(text(),'Agency')]");

    //    This is choosing only Agency type
    public MainPage clickToAgency() throws InterruptedException {
        utils.click(agencyButton);
        Thread.sleep(3000);
        return new MainPage(driver);

    }

}
