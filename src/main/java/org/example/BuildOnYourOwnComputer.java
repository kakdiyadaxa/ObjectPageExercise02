package org.example;

import org.openqa.selenium.By;

public class BuildOnYourOwnComputer extends Utils{
    private By _processor = By.cssSelector("select#product_attribute_1");
    private By _ram = By.cssSelector("select#product_attribute_2");
    private By _hdd = By.cssSelector("input#product_attribute_3_6");
    private By _os = By.cssSelector("input#product_attribute_4_9");
    private By _acrobatReader = By.cssSelector("input#product_attribute_5_11");
    private By _totalCommander = By.cssSelector("input#product_attribute_5_12");
    private By _addToCart = By.cssSelector("button#add-to-cart-button-1");
    private By _clickOnShoppingCart = By.xpath("//div[@class=\"bar-notification success\"]/p/a");
    public void selectingProductSpecification(){
        //select on Processor
        selectOptionsByValue(_processor,"2");
        //select on RAM
        selectOptionsByValue(_ram,"4");
        //click on HDD
        clickOnElement(_hdd);
        //click on OS
        clickOnElement(_os);
        //click on Acrobat Reader
        clickOnElement(_acrobatReader);
        //click on Total Commander
        clickOnElement(_totalCommander);
        //click on ADD TO CART
        clickOnElement(_addToCart);
        //click on green line (shopping cart)
        clickOnElement(_clickOnShoppingCart);
    }
}
