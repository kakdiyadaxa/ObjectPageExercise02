package org.example;

import org.openqa.selenium.By;

public class CameraAndPhotoPage extends Utils{
    private By _clickLeicaAddToCart = By.xpath("(//BUTTON[@type='button'][text()='Add to cart'])[2]");
    private By _clickOnShoppingCart = By.xpath("//div[@class=\"bar-notification success\"]/p/a");
    public void clickOnLeicaCameraAddToCart(){
        //click on Add to cart of Leica Camera
        clickOnElement(_clickLeicaAddToCart);
        //click on green line (shopping cart)
        clickOnElement(_clickOnShoppingCart);
    }
}
