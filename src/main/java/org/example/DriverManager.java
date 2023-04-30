package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class DriverManager extends Utils {
    public void  openBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximizing the window
        driver.manage().window().maximize();
        //Typing url
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser(){
        //to close the browser
        driver.close();
    }

}
