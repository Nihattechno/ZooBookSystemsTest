package StepDefinitions;

import POMS.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;

public class LoginFeatureSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Netflix website")
    public void navigateToNetflixWebsite() {
        GWD.getDriver().get("https://www.netflix.com/tr-en/");
    }


    @And("User click element on the DialogContent")
    public void userClickOnTheDialogContent(DataTable elements) {
        List<String> list = elements.asList(String.class);
        for (int i = 0; i < list.size(); i++) {
            dc.findAndClick(list.get(i));
        }
    }

    @And("User sending keys on the DialogContent")
    public void userSendingKeysOnTheDialogContent(DataTable elements) {
        List<List<String>> lists=elements.asLists(String.class);
        for (int i = 0; i < lists.size(); i++) {
            dc.findAndSend(lists.get(i).get(0),lists.get(i).get(1));
        }
    }


    @And("The result message must have been displayed")
    public void theResultMessageMustHaveBeenDisplayed(DataTable elements) {
        List<List<String>> list = elements.asLists(String.class);
        for (int i = 0; i < list.size(); i++) {
            dc.findAndContainsText(list.get(i).get(0),list.get(i).get(1));
        }

    }
}
