package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    private By _getProductInShoppingCart = By.xpath("(//a[text()=\"Leica T Mirrorless Digital Camera\"])[2]");
    String getExpectedProductInShoppingCartMsg = "Leica T Mirrorless Digital Camera";
    public void verifyUserAddedProductInShoppingCartSuccessfully(){
        //print out actual message
        String actualMessage = getTextFromElement(_getProductInShoppingCart);
        System.out.println("My Message:" +actualMessage);
        Assert.assertEquals(actualMessage,getExpectedProductInShoppingCartMsg);

    }
}
