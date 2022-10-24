package POMS;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Parent implements I_Parent {

    public void sendKeysFunction (WebElement element,String girdi){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(girdi);
    }

    public void clickFunction (WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsText(WebElement element, String girdi) {

        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(girdi.toLowerCase()));

    }


}
