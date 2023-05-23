package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NopCommerceNewReleaseCommentsPage extends Utils{
    private By _newReleaseMessage = By.xpath("//h1[text()=\"nopCommerce new release!\"]");
    private String getExpectedNewReleaseMessage = "nopCommerce new release!";
    private By _title = By.cssSelector("input.enter-comment-title");
    private By _comment = By.cssSelector("textarea#AddNewComment_CommentText");
    private By _newComment = By.cssSelector("button.news-item-add-comment-button");
    private By _newCommentMessage = By.cssSelector("div.result");
    private String getExpectedNewCommentMessage = "News comment is successfully added.";
    public void verifyNopCommerceNewReleaseMessageAppear(){
        //print out actual message (nopCommerce new release!)
        String actualMessage = getTextFromElement(_newReleaseMessage);
        System.out.println("My message : " + actualMessage);
        Assert.assertEquals(actualMessage,getExpectedNewReleaseMessage);
    }
    public void leavingYourComment(){
        //enter title for Leave your comment
        typeText(_title,"Benefits");
        //enter comment
        typeText(_comment,"NopCommerce has good Customer service.");
        clickOnElement(_newComment);
    }
    public void verifyNewCommentMessageAppear(){
        //print out actual message (News comment is successfully added.)
        String actualMessage = getTextFromElement(_newCommentMessage);
        System.out.println("My message : " + actualMessage);
        Assert.assertEquals(actualMessage,getExpectedNewCommentMessage);
    }
}
