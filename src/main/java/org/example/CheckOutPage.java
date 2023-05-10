package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckOutPage extends Utils{
    private By _getExpectedMessage = By.xpath("//h1[text()=\"Thank you\"]");
    private String getExpectedMessage = "Thank you";
    private By _getExpectedMessage1 = By.xpath("//strong[text()=\"Your order has been successfully processed!\"]");
    private String getExpectedMessage1 = "Your order has been successfully processed!";
    public void verifyGuestUserShouldBeAbleToCheckOutProductSuccessfully(){
        //print out actual Message (Thank you)
        String actualMessage = getTextFromElement(_getExpectedMessage);
        System.out.println("My message : " + actualMessage);
        Assert.assertEquals(actualMessage,getExpectedMessage);

        //print out actual Message (Your order has been successfully processed!)
        String actualMessage1 = getTextFromElement(_getExpectedMessage1);
        System.out.println("My message : " + actualMessage1);
        Assert.assertEquals(actualMessage1,getExpectedMessage1);
    }
}
