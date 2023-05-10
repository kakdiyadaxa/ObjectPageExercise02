package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckoutStepsPage extends Utils{
    private By _firstname = By.cssSelector("input#BillingNewAddress_FirstName");
    private By _lastname = By.cssSelector("input#BillingNewAddress_LastName");
    private By _email = By.cssSelector("input#BillingNewAddress_Email");
    private By _country = By.cssSelector("select#BillingNewAddress_CountryId");
    private By _state = By.cssSelector("select#BillingNewAddress_StateProvinceId");

    private By _city = By.cssSelector("input#BillingNewAddress_City");
    private By _address1 = By.cssSelector("input#BillingNewAddress_Address1");
    private By _zip_postal_code = By.name("BillingNewAddress.ZipPostalCode");
    private By _phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    private By _billingAddress_Continue = By.xpath("(//button[text()=\"Continue\"])[1]");
    private By _nextDayAir = By.cssSelector("input#shippingoption_1");
    private By _shippingMethod_Continue = By.cssSelector("button.button-1.shipping-method-next-step-button");
    private By _selectCreditCard = By.cssSelector("input#paymentmethod_1");
    private By _paymentMethod_Continue = By.xpath("(//button[text()=\"Continue\"])[4]");
    private By _selectCard = By.cssSelector("select.dropdownlists");
    private By _cardHolderName = By.cssSelector("input#CardholderName");
    private By _cardNumber = By.cssSelector("input#CardNumber");
    private By _expirationDateMonth = By.cssSelector("select#ExpireMonth");
    private By _expirationDateYear = By.cssSelector("select#ExpireYear");
    private By _cardCode = By.cssSelector("input#CardCode");
    private By _paymentInformation_Continue = By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]");
    private By _confirmOrder = By.cssSelector("button.button-1.confirm-order-next-step-button");
    private By _billingAddress = By.xpath("//div[@class=\"billing-info\"]");
    private By _payment = By.xpath("//div[@class=\"payment-method-info\"]");
    private By _shipping = By.xpath("//div[@class=\"shipping-info-wrap\"]");
    public void billingAddressDetails(){
        //enter first name
        typeText(_firstname,"Mita");
        //enter last name
        typeText(_lastname,"Patel");
        //enter email
        typeText(_email,"mp"+timeStamp2+"@gmail.com");
        //select country
        selectOptionsByValue(_country,"1");
        //select state
        selectOptionsByValue(_state,"1");
        //select city
        typeText(_city,"California");
        //select address1
        typeText(_address1,"17960 Magnolia St");
        //enter postal code
        typeText(_zip_postal_code,"92708");
        //enter phone number
        typeText(_phoneNumber,"(714) 378-0264");
        //click on continue
        clickOnElement(_billingAddress_Continue);
    }
    public void shippingMethodDetails(){
        // click on next day air
        clickOnElement(_nextDayAir);
        // click on continue
        clickOnElement(_shippingMethod_Continue);
    }
    public void paymentMethodDetails(){
        //click on credit card
        clickOnElement(_selectCreditCard);
        //click on continue
        clickOnElement(_paymentMethod_Continue);
    }
    public void paymentInformationDetails(){
        //select card
        selectOptionsByIndex(_selectCard,1);
        //enter cardholder name
        typeText(_cardHolderName,"Mita");
        //enter card number
        typeText(_cardNumber,"5409214512027239");
        //select expiration date Month
        selectOptionsByIndex(_expirationDateMonth,06);
        //select expiration date Year
        selectOptionsByValue(_expirationDateYear,"2024");
        //enter card code
        typeText(_cardCode,"685");
        //click on continue
        clickOnElement(_paymentInformation_Continue);
    }
    public void confirmOrder(){
        //print out Billing Address
        List<WebElement> actualBillingAddress = driver.findElements(_billingAddress);
        for (WebElement e : actualBillingAddress) {
            System.out.println(e.getText());
        }
        //print out Payment
        List<WebElement> actualPayment = driver.findElements(_payment);
        for (WebElement e : actualPayment) {
            System.out.println(e.getText());
        }
        //print out Shipping Address
        List<WebElement> actualShipping = driver.findElements(_shipping);
        for (WebElement e : actualShipping) {
            System.out.println(e.getText());
        }
        //click on CONFIRM
        clickOnElement(_confirmOrder);
    }
}
