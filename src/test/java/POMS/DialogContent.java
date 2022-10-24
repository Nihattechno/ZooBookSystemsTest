package POMS;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "a[data-uia='header-login-link']")
            private WebElement SignIn;

    @FindBy(id = "id_userLoginId")
            private WebElement Username;

    @FindBy(id = "id_password")
            private WebElement Password;

    @FindBy(css = "button[data-uia='login-submit-button']")
            private WebElement SignInButton;

    @FindBy(css = "[data-uia='our-story-welcome-back']")
            private WebElement ValidResult;

    @FindBy(css = "div[data-uia='text']")
            private WebElement InvalidResult;

    WebElement myElement;

    public void findAndSend (String element,String input)
    {
        switch (element){
            case "Username":
                myElement=Username;
                break;
            case "Password":
                myElement=Password;
                break;


        }
        sendKeysFunction(myElement,input);
    }

    public void findAndClick (String elemnet){
        switch (elemnet){
            case "SignIn":
                myElement=SignIn;
                break;
            case "SignInButton":
                myElement=SignInButton;
                break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText (String element,String input){
        switch (element){
            case "ValidResult":
                myElement=ValidResult;
                break;
            case "InvalidResult":
                myElement=InvalidResult;
                break;

        }
        verifyContainsText(myElement,input);
    }
}
