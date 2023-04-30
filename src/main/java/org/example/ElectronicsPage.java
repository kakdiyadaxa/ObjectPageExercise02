package org.example;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{
    private By _clickCameraAndPhoto = By.xpath("//a[text()=\" Camera & photo \"]");
    public void clickOnCameraAndPhoto(){
        //click on camera & photo
        clickOnElement(_clickCameraAndPhoto);
    }
}
