package org.example;
import org.openqa.selenium.By;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Utils extends BasePage{
    public static void clickOnElement (By by){driver.findElement(by).click();}
    public static void typeText (By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement (By by){
        return driver.findElement(by).getText();
    }

    //by using this time will create different in same run
//    public static long timestamp() {
//       Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        return timestamp.getTime();
//    }
    String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    String timeStamp2 = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
}
