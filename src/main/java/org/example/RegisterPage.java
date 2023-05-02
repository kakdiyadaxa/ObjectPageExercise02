package org.example;
import org.openqa.selenium.By;
import java.text.SimpleDateFormat;
import java.util.Date;
public class RegisterPage extends Utils{
    private By _firstName = By.xpath("//input[@id=\"FirstName\"]");
    private By _lastName = By.xpath("//input[@id=\"LastName\"]");
    private By _email = By.xpath("//input[@id=\"Email\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confirmPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _clickOnRegisterButton = By.xpath("//button[@name=\"register-button\"]");
    public void enterRegistrationDetails(){
        //type firstname
        typeText(_firstName, "FirstnameTest");
        //type lastname
        typeText(_lastName, "LastNameTest");
        //type email address
        typeText(_email, "vb5"+timeStamp+"@gmail.com");
        //type password
        typeText(_password, "test1234");
        //type confirm password
        typeText(_confirmPassword, "test1234");
        //click on register button
        clickOnElement(_clickOnRegisterButton);
    }
    public void enterRegistrationDetails2(){
        //type firstname
        typeText(_firstName, "FirstnameTest");
        //type lastname
        typeText(_lastName, "LastNameTest");
        //type email address
        typeText(_email, "vb6"+timeStamp2+"@gmail.com");
        //type password
        typeText(_password, "test1234");
        //type confirm password
        typeText(_confirmPassword, "test1234");
        //click on register button
        clickOnElement(_clickOnRegisterButton);
    }

}
