package org.example;

import io.cucumber.java.zh_cn.而且;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ProductPage extends Utils{
    private By _productTitle = By.className("product-title");
    LoadProp loadProp = new LoadProp();
    public void printProductsName(){
        //print products name
        List<WebElement> searchText = driver.findElements(_productTitle);
        //verify if search result is displayed corresponding to the string which was searched
        for (WebElement e:searchText){
            Assert.assertTrue(e.getText().contains(loadProp.getProperty("searchProduct")));
            System.out.println("My message: "+e.getText());
        }
    }
}
