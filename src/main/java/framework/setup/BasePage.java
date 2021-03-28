package framework.setup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import drivers.DriverFactory;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage() {
        driver = DriverFactory.getDriver();
    }

    protected void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    protected void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    protected boolean isAlertPresent() {
        return false;
    }

    protected String getTextOfAlert() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    protected void dragAndDrop(By drag, By drop) {
        Actions action = new Actions(driver);
        WebElement a = driver.findElement(drag);
        WebElement b = driver.findElement(drop);
        action.dragAndDrop(a, b).build().perform();

    }

    protected void isTextPresent(String text) {
        driver.findElement(By.xpath("//*[text()='" + text + "']"));

    }

    protected String getTitle() {
        return driver.getTitle();
    }

    protected void navigateBack() {
        driver.navigate().back();
    }

    protected void navigateForward() {
        driver.navigate().forward();
    }

    protected void refresh() {
        driver.navigate().refresh();
    }

    protected void doubleClick(By by) {
        Actions action = new Actions(driver);
        action.doubleClick(driver.findElement(by)).build().perform();
    }

    protected void rightClick(By by) {
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(by)).build().perform();
    }

    protected void mouseHover(By by) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(by)).build().perform();
    }

    protected static String screenShotasString() {

        String screenShot;
        screenShot = ((TakesScreenshot) DriverFactory.getDriver())
                .getScreenshotAs(OutputType.BASE64);
        return screenShot;

    }

}
