package org.example;
import org.openqa.selenium.By;
import java.text.SimpleDateFormat;
import java.util.Date;
public class RegisterPage extends Utils{
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _clickOnRegisterButton = By.id("register-button");
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
