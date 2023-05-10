package org.example;
import org.testng.annotations.Test;
public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    AppleMacBookPage appleMacBookPage = new AppleMacBookPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    CompareListPage compareListPage = new CompareListPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ProductPage productPage = new ProductPage();
    NopCommerceNewReleaseCommentsPage commentsPage = new NopCommerceNewReleaseCommentsPage();
    FacebookPage facebookPage = new FacebookPage();
    BuildOnYourOwnComputer buildOnYourOwnComputer = new BuildOnYourOwnComputer();
    ComputerCartPage computerCartPage = new ComputerCartPage();
    CheckOutAsAGuest_CartPage checkOutAsAGuestCartPage = new CheckOutAsAGuest_CartPage();
    CheckoutStepsPage checkoutBillingPage = new CheckoutStepsPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //fill in registration details
        registerPage.enterRegistrationDetails();
        //verify register success or not
        registerResultPage.verifyUserRegisteredSuccessfully();
    }
    @Test
    public void verifyNonRegisteredUserShouldNotBeAbleToVoteSuccessfully(){
        //click on Good radio button
        homePage.clickOnGoodRadioButton();
        //click on vote button
        homePage.clickOnVote();
        //get error message
        homePage.verifyNonRegisterUserShouldNotBeAbleToVote();
    }
    @Test
    public void verifyRegisteredUserShouldBeAbleToVoteSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //fill registration details
        registerPage.enterRegistrationDetails2();
        //click on login button
        registerResultPage.clickOnLoginButton();
        //fill login details
        loginPage.enterLoginDetails();
        //click on Good radio button
        homePage.clickOnGoodRadioButton();
        //click on vote button
        homePage.clickOnVote();
        //get vote message
        homePage.userVoteMessage();
    }
    @Test
    public void verifyNonRegisteredUserShouldNotAbleToReferAProductToAFriendSuccessfully(){
        //click on Apple MacBook Pro 13-inch
        homePage.clickOnAppleMacBook();
        //click on Email a friend
        appleMacBookPage.clickOnEmailAFriend();
        //fill in friend's and your email
        emailAFriendPage.fillInFriendAndYourEmail();
    }
    @Test
    public void verifyRegisteredUserShouldBeAbleToReferAProductToAFriendSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //fill registration details
        registerPage.enterRegistrationDetails2();
        //click on login button
        registerResultPage.clickOnLoginButton();
        //fill login details
        loginPage.enterLoginDetails();
        //click on Apple MacBook Pro 13-inch
        homePage.clickOnAppleMacBook();
        //click on Email a friend
        appleMacBookPage.clickOnEmailAFriend();
        //fill in friend's email
        emailAFriendPage.fillInFriendEmail();
    }
    @Test
    public void verifyUserShouldBeAbleToCompareTheTwoProductsSuccessfully(){
        //add products to compare list
        homePage.addProductsToCompareList();
        //verify User Compared Products Successfully
        compareListPage.verifyUserComparedProductsSuccessfully();
    }
    @Test
    public void verifyUserShouldBeAbleToSeeProductInShoppingCartSuccessfully(){
        //click on Electronics
        homePage.clickOnElectronics();
        //click on camera & photo
        electronicsPage.clickOnCameraAndPhoto();
        //click On Leica Camera Add To Cart
        cameraAndPhotoPage.clickOnLeicaCameraAddToCart();
        //verify User Added Product In Shopping Cart Successfully
        shoppingCartPage.verifyUserAddedProductInShoppingCartSuccessfully();
    }
    @Test
    public void verifyUserShouldBeAbleToPrintOutProductsNameSuccessfully(){
        homePage.printOutProductsName();
    }
    @Test
    public void verifyUserShouldNotAbleToSearchWithOutKeyWord(){
        homePage.clickOnSearch();
    }
    @Test
    public void verifyUserShouldBeAbleToSelectAndVerifyCurrencyAccordingly(){
        homePage.selectAndVerifyCurrencyAccordingly();
    }
    @Test
    public void verifyUserShouldBeAbleToSearchGivenProductSuccessfully(){
        homePage.searchProductFunctionality();
        productPage.printProductName();
    }
    @Test
    public void verifyNopCommerceNewReleaseCommentShouldAppearLast(){
        homePage.clickOnNopCommerceNewRelease();
        commentsPage.verifyNopCommerceNewReleaseMessageAppear();
        commentsPage.leavingYourComment();
        commentsPage.verifyNewCommentMessageAppear();
    }
    @Test
    public void verifyGuestUserShouldBeAbleToCheckOutSuccessfully(){
        homePage.clickOnBuildOnYourOwnComputer();
        buildOnYourOwnComputer.selectingProductSpecification();
        computerCartPage.verifyAllSpecificationsSelected();
        checkOutAsAGuestCartPage.verifyGuestUserCheckoutSuccessfully();
        checkoutBillingPage.billingAddressDetails();
        checkoutBillingPage.shippingMethodDetails();
        checkoutBillingPage.paymentMethodDetails();
        checkoutBillingPage.paymentInformationDetails();
        checkoutBillingPage.confirmOrder();
        checkOutPage.verifyGuestUserShouldBeAbleToCheckOutProductSuccessfully();
    }
    @Test
    public void verifyUserShouldBeAbleToSwitchToFacebookWindowTab(){
        homePage.clickOnFacebookLogo();
        homePage.verifyUserGetsBackToHomePage();
    }
    @Test
    public void verifyAlertMessageAppearWhenUserClickOnVoteWithoutSelectingAnyOption(){
        homePage.verifyVoteAlertMessage();
    }
}
