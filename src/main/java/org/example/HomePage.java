package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
public class HomePage extends Utils{
    private By _registerButton = By.xpath("//a[@class=\"ico-register\"]");

    private By _goodRadioButton = By.xpath("//input[@id=\"pollanswers-2\"]");
    private By _voteButton = By.xpath("//button[text()='Vote']");
    private String getExpectedVotingErrorMsg = "Voting is working.";
    private By _voteErrorMessage = By.xpath("//div[@class=\"poll-vote-error\"]");
    private String getExpectedVotingMsg = "Voting is not working";
    private By _voteMessage = By.xpath("//span[@class=\"poll-total-votes\"]");
    private By _appleMacBook = By.xpath("//a[text()=\"Apple MacBook Pro 13-inch\"]");
    private By _htcMobile = By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _closeGreenLine = By.xpath("//span[@class= \"close\"]");
    private By _virtualGiftCard = By.xpath("//div[@class=\"item-grid\"]/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _clickGreenLine = By.xpath("//div[@class=\"bar-notification success\"]/p/a[@href=\"/compareproducts\"]");
    private By _clickElectronics = By.xpath("//a[text()=\" Electronics \"]");

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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("poll-vote-error")));
        //print message
        String actualMessage = getTextFromElement(_voteErrorMessage);
        //print message
        System.out.println("My message " + actualMessage);
        Assert.assertEquals(actualMessage,getExpectedVotingErrorMsg);
    }
    public void userVoteMessage(){
        //print out message
        String actualMessage = getTextFromElement(_voteMessage);
        System.out.println("My message " + actualMessage);
        actualMessage = getTextFromElement(By.xpath("//span[@class=\"poll-total-votes\"]"));
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

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //click on Add to compare list for $25 Virtual Gift Card
        clickOnElement(_virtualGiftCard);
        //close green line bar
        clickOnElement(_closeGreenLine);

        //for time wait
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"bar-notification success\"]/p/a[@href=\"/compareproducts\"]")));

        //click green line
        clickOnElement(_clickGreenLine);
    }
    public void clickOnElectronics(){
        //click on Electronics
        clickOnElement(_clickElectronics);
    }


}
