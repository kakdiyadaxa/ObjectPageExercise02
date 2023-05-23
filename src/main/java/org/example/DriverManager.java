package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browser");

    public void  openBrowser(){
        if (browserName.equalsIgnoreCase("Chrome")){
            //open Chrome browser
            driver =  new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            //open firefox browser
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            //open edge browser
            driver = new EdgeDriver();
        }

        driver.get(loadProp.getProperty("url"));
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
