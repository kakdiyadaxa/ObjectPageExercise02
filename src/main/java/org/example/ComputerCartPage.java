package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ComputerCartPage extends Utils{
    private By _productName = By.xpath("//a[@class=\"product-name\"]");
    private String getExpectedspecificationDetails = "Build your own computer";
    private By _specificationDetails = By.xpath("//TD[@class='product']//DIV[@class='attributes']");
    private By _clickTermOfService = By.cssSelector("input#termsofservice");
    private By _checkOut = By.xpath("//button[@id=\"checkout\"]");

    public void verifyAllSpecificationsSelected(){

        String actualMessage = getTextFromElement(_productName);
        System.out.println("My message : " + actualMessage);
        Assert.assertEquals(actualMessage,getExpectedspecificationDetails);

        List<WebElement> searchText = driver.findElements(_specificationDetails);
        for (WebElement e:searchText){
            System.out.println(e.getText());
        }
        clickOnElement(_clickTermOfService);
        clickOnElement(_checkOut);
    }

}
