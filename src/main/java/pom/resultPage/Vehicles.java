package ResultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.MainPage;
import pom.Screen;
import utils.SeleniumUtils;

public class Vehicles extends Screen {

    private WebDriver driver;
    SeleniumUtils utils;

    public Vehicles(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new SeleniumUtils(driver);
    }

    private By model = By.id("bList");

    public MainPage chooseCarType() throws InterruptedException {
        utils.select(model, "74");
        return new MainPage(driver);
    }

    private By bodyType = By.name("_a27");

    public MainPage chooseBodyType() throws InterruptedException {
        utils.select(bodyType, "4");
        MainPage bodyType = new MainPage(driver);
        return chooseBodyType();
    }

    private By yearFrom = By.name("_a2_1");
    private By yearTo = By.name("_a2_2");

    public MainPage chooseYear() throws InterruptedException {
        utils.select(yearFrom, "2016");
        utils.select(yearTo, "2016");
        return new MainPage(driver);
    }

    private By engine = By.name("_a15");

    public MainPage engineType() throws InterruptedException {
        utils.select(engine, "4");
        return new MainPage(driver);

    }

}
