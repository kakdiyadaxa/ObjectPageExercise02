package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils{
    FacebookPage facebookPage = new FacebookPage();
    private By _registerButton = By.xpath("//a[@class=\"ico-register\"]");
    private By _goodRadioButton = By.xpath("//input[@id=\"pollanswers-2\"]");
    private By _voteButton = By.xpath("//button[text()='Vote']");
    private String getExpectedVotingErrorMsg = "Voting is working.";
    private By _voteErrorMessage = By.xpath("//div[@class=\"poll-vote-error\"]");
    private String getExpectedVotingMsg = "Voting is not working";
    private By _voteMessage = By.xpath("//span[@class=\"poll-total-votes\"]");
    private By _buildYourOwnComputer = By.xpath("//a[text()=\"Build your own computer\"]");
    private By _appleMacBook = By.xpath("//a[text()=\"Apple MacBook Pro 13-inch\"]");
    private By _htcMobile = By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _closeGreenLine = By.xpath("//span[@class= \"close\"]");
    private By _virtualGiftCard = By.xpath("//div[@class=\"item-grid\"]/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _closeGreenLine2 = By.xpath("//span[@class= \"close\"]");
    private By _clickGreenLine = By.xpath("//div[@class=\"bar-notification success\"]/p/a[@href=\"/compareproducts\"]");
    private By _clickElectronics = By.xpath("//a[text()=\" Electronics \"]");
    private By _productList = By.cssSelector("div.product-grid h2");
    private By _searchButton = By.xpath("//button[@type=\"submit\"]");
    private String expectedSearchAlertMessage = "Please enter some search keyword";
    private By _currencySelector = By.cssSelector("select#customerCurrency");
    private By _currencyConfirm = By.cssSelector("span.price");
    private String  expectedVoteAlertMessage = "Please select an answer";
    private By _searchInputBox = By.cssSelector("input#small-searchterms");
    private By _clickNopCommerceNewRelease = By.xpath("(//a[@class=\"news-title\"])[2]");
    private By _facebookPage = By.cssSelector("li.facebook");
    private String getExpectedHomePageMessage = "Welcome to our store";
    private By _welcomeToStoreMessage = By.xpath("//h2[text()=\"Welcome to our store\"]");

    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(_registerButton);
    }
    public void clickOnGoodRadioButton(){
        //click on good radio button
        clickOnElement(_goodRadioButton);
    }
    public void clickOnVote(){
        //click on VOTE button
        clickOnElement(_voteButton);
    }
    public void verifyNonRegisterUserShouldNotBeAbleToVote(){
        //for time wait load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_voteErrorMessage));
        //print message
        String actualMessage = getTextFromElement(_voteErrorMessage);
        System.out.println("My message " + actualMessage);
        Assert.assertEquals(actualMessage,getExpectedVotingErrorMsg);
    }
    public void userVoteMessage(){
        //print out message
        String actualMessage = getTextFromElement(_voteMessage);
        System.out.println("My message " + actualMessage);
        Assert.assertEquals(actualMessage,getExpectedVotingMsg);
    }
    public void clickOnAppleMacBook(){
        //click On Apple MacBook
        clickOnElement(_appleMacBook);
    }
    public void addProductsToCompareList() {
        //click on Add to compare list for HTC One M8 Android L 5.0 Lollipop
        clickOnElement(_htcMobile);
        //close green line bar
        clickOnElement(_closeGreenLine);

        //click on Add to compare list for $25 Virtual Gift Card
        clickOnElement(_virtualGiftCard);

        //close green line bar
        clickOnElement(_closeGreenLine2);

        //for time wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_clickGreenLine));

        //click green line
        clickOnElement(_clickGreenLine);
    }
    public void clickOnElectronics(){
        //click on Electronics
        clickOnElement(_clickElectronics);
    }
    public void printOutProductsName(){
        //print out products Name
        List <WebElement> productlist = driver.findElements(_productList);
        for (WebElement e:productlist){
            System.out.println(e.getText());
        }
    }
    public void clickOnSearch(){
        //click on search
        clickOnElement(_searchButton);
        // Switching to Alert
        Alert alert = driver.switchTo().alert();
        // Capturing alert message
        String alertMessage= driver.switchTo().alert().getText();
        // Displaying alert message (Please enter some search keyword)
        System.out.println("My Message: "+alertMessage);
        Assert.assertEquals(alertMessage,expectedSearchAlertMessage);
        // Accepting alert (OK)
        alert.accept();
    }
    public void selectAndVerifyCurrencyAccordingly() {
        //select drop down currency US Dollar
        selectOptionsByText(_currencySelector, "US Dollar");
        List<WebElement> actualCurrency = findElements(_currencyConfirm);
        for (WebElement e : actualCurrency) {
            System.out.println(e.getText());
        }
        //select drop down currency Euro
        selectOptionsByText(_currencySelector, "Euro");
        List<WebElement> actualCurrency1 = driver.findElements(_currencyConfirm);
        for (WebElement e : actualCurrency1) {
            System.out.println(e.getText());
        }
    }
    public void verifyVoteAlertMessage(){
        //click on vote button
        clickOnElement(_voteButton);
        // Switching to Alert
        Alert alert = driver.switchTo().alert();
        // Capturing alert message
        String alertMessage= alert.getText();
        // Displaying alert message
        System.out.println("My Message: "+alertMessage);
        Assert.assertEquals(alertMessage,expectedVoteAlertMessage);
        // Accepting alert
        alert.accept();
    }
    public void searchProductFunctionality() {
        //type nike in search box
        typeText(_searchInputBox, "Nike");
        //click on search button
        clickOnElement(_searchButton);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the name of the product you want to search for: ");
//        String searchKeyword = scanner.nextLine();
//
//        // Enter the user input into the search bar element and click the search button
//        typeText(_searchInputBox,searchKeyword);
//        WebElement searchButton = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
//        searchButton.click();
    }
    public void clickOnNopCommerceNewRelease(){
        //click on nopCommerce new release!
        clickOnElement(_clickNopCommerceNewRelease);
    }
    public void clickOnFacebookLogo() {
        String MainWindow = getCurrentWindowHandle();
        clickOnElement(_facebookPage);
        // Get the handles of all open windows
        Set<String> s1 = getAllWindowHandles();
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                facebookPage.verifyUserSwitchedToNewURL();
                facebookPage.verifyUserShouldFindLoginDetails();
                // Switching to Parent window i.e Main Window.
                driver.switchTo().window(MainWindow);
            }
        }
    }



    public void verifyUserGetsBackToHomePage(){
        //for time wait load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_welcomeToStoreMessage));
        //print actual message
        String actualMessage = getTextFromElement(_welcomeToStoreMessage);
        System.out.println("My message " + actualMessage);
        Assert.assertEquals(actualMessage,getExpectedHomePageMessage);
    }
    public void clickOnBuildOnYourOwnComputer(){
        //click On Build On Your Own Computer
        clickOnElement(_buildYourOwnComputer);
    }
}

