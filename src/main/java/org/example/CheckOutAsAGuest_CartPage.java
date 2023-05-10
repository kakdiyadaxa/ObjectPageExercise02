package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CheckOutAsAGuest_CartPage extends Utils{
    private By _checkoutMessage = By.xpath("//strong[text()=\"Checkout as a guest or register\"]");
    private String getExpectedCheckoutMessage = "Checkout as a guest or register";
    private By _checkoutAsGuest = By.xpath("//button[text()='Checkout as Guest']");
    private By _productDetails = By.xpath("(//tr)/td[3]");
    private By _clickBox = By.cssSelector("input#termsofservice");

    public void verifyGuestUserCheckoutSuccessfully(){
        //print out actual message for check out
        String actualMessage = getTextFromElement(_checkoutMessage);
        System.out.println("My message : " + actualMessage);
        Assert.assertEquals(actualMessage,getExpectedCheckoutMessage);

        List<WebElement> actualProduct = driver.findElements(_productDetails);
        for (WebElement e : actualProduct) {
            System.out.println(e.getText());
        }
        //clickOnElement(_clickBox);
        clickOnElement(_checkoutAsGuest);
    }
}
