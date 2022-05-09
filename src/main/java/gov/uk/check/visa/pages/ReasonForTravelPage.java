package gov.uk.check.visa.pages;
/* 
 Created by Kalpesh Patel
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @FindBy(xpath = "//div[@class='govuk-radios']//div/input")
    List<WebElement> reasonForVisitList;

    public void selectReasonForVisit(String reason) {
        Reporter.log("Clicking on reason " + reasonForVisitList.toString());
        int size = reasonForVisitList.size();
        for (int i = 0; i < size; i++) {
            String val = reasonForVisitList.get(i).getAttribute("value");
            if (val.equalsIgnoreCase(reason)) {
                reasonForVisitList.get(i).click();
                break;
            }
        }

    }


    public void clickNextStepButton() {
        Reporter.log("Clicking on Next " + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }

}
