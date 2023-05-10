package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FacebookPage extends Utils {
    private By _close = By.xpath("//DIV[@class='x1egiwwb x4l50q0']/..//I[@data-visualcompletion='css-img']");
    private By _allowCookies = By.xpath("(//div[contains(@aria-label,'Allow all cookies')])[2]");
    private By _email = By.xpath("(//input[@dir='ltr'])[1]");
    private By _password = By.xpath("(//input[@dir='ltr'])[2]");
    private By _login = By.xpath("//div[@aria-label='Accessible login button']");

    public void verifyUserSwitchedToNewURL() {

        String currentUrl = driver.getCurrentUrl();
        System.out.println("My Message: " + currentUrl);
        Assert.assertEquals(currentUrl, "https://www.facebook.com/nopCommerce");}
    public void verifyUserShouldFindLoginDetails(){
        //click on allow cookies
        clickOnElement(_allowCookies);
        //for time wait load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_close));
        //click on close button
        clickOnElement(_close);

        //to verify email box is there
        if(driver.findElements(_email).size() != 0){
            System.out.println("Element Email is Present");
        }else{
            System.out.println("Element Email is Absent");
        }

        //to verify password box is there
        if(driver.findElements(_password).size() != 0){
            System.out.println("Element Password is Present");
        }else{
            System.out.println("Element Password is Absent");
        }

        //to verify log in box is there
        if(driver.findElements(_login).size() != 0){
            System.out.println("Element Login Button is Present");
        }else{
            System.out.println("Element Login Button is Absent");
        }
        // Closing the Child Window.
        driver.close();
    }

}
