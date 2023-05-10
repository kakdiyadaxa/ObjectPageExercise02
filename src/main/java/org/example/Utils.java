package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Utils extends BasePage{
    public static void clickOnElement (By by){
    driver.findElement(by).click();
    }
    public static void typeText (By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement (By by){
        return driver.findElement(by).getText();
    }
    public static void selectOptionsByText(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectOptionsByValue(By by,String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public static void selectOptionsByIndex(By by,int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    //Assertions are used to compare the expected and actual results.
    public static void assertEquals(String actual, String expected){
        Assert.assertEquals(actual, expected);
    }
    //This method is used to retrieve the handle of the current window.
    public String getCurrentWindowHandle(){
        return driver.getWindowHandle();
    }
    //This method is used to retrieve the handles of all open windows.
    public Set<String> getAllWindowHandles(){
        return driver.getWindowHandles();
    }
    public List<WebElement> findElements(By by){
        List<WebElement> elements = driver.findElements(by);
        return elements;
    }
    public static void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public static void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    public static void sendTextToAlert(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
    }
    public static String getAlertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
    //method for wait until visibility Of Element is Located
    public static void visibilityOfElementLocated(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    //method for wait until element is To Be Clickable
    public static void elementToBeClickable(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    //method for wait until invisibility Of Element is Located
    public static void invisibilityOfElementLocated(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    //method for wait until text To Be Present In Element is Located
    public static void textToBePresentInElementLocated(By by,String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by,text));
    }
    //This method is used to retrieve the title of the current page.
    public String getTitle() {
        return driver.getTitle();
    }
    //This method is used to determine if a checkbox or radio button is currently selected or not.
    public boolean isElementSelected(By by) {
        WebElement element = driver.findElement(by);
        return element.isSelected();
    }
    //This method is used to determine if an element is currently visible or not.
    public boolean isElementDisplayed(By by) {
        WebElement element = driver.findElement(by);
        return element.isDisplayed();
    }
    //This method will fetch message on Pop-up
    public static void SimpleDateFormat(){
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String formattedDate = formatter.format(now);
    }
    String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    String timeStamp2 = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    //by using this time will create different in same run
//    public static long timestamp() {
//       Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        return timestamp.getTime();
//    }
}
