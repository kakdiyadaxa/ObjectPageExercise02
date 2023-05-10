package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utils{
    public void printProductName(){
        //print products name
        List<WebElement> searchText = driver.findElements(By.className("product-title"));
        for (WebElement e:searchText){
            System.out.println(e.getText());
        }
    }
}
