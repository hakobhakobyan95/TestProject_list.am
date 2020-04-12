package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
    WebDriverWait wait;
    WebDriver driver;
    Actions builder;
    Select selectLevel;

    public SeleniumUtils(WebDriver driver) {
        this.driver = driver;
        builder = new Actions(driver);
        wait = new WebDriverWait(driver, 150);

    }

    public void sendKeys(By by, String text) throws InterruptedException {
        WebElement element = driver.findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(text);
        System.out.println("in this element " + element + "was sent text " + text);
    }

    public void click(By by) {
        WebElement element = driver.findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        System.out.println("Click " + element);
    }

    public void select(By by, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        selectLevel = new Select(driver.findElement(by));
        selectLevel.selectByValue(text);
        System.out.println("Select " + selectLevel + " and selected by value" + text);
    }

    public void moveToElement(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        WebElement element = driver.findElement(by);
        builder.moveToElement(element).perform();
        System.out.println("Move to " + element);
    }

    public String getText(By by) {
        WebElement element = driver.findElement(by);
        System.out.println("get text from this" + element + "element");
        return element.getText();
    }

    public void clearField(By by) {
        WebElement element = driver.findElement(by);
        System.out.println("From" + element + "this clear all field");
        element.clear();
    }
}
