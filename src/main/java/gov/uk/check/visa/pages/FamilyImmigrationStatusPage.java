package gov.uk.check.visa.pages;
/* 
 Created by Kalpesh Patel
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @FindBy(xpath = "//div[@class='govuk-radios']//input[@id='response-0']")
    WebElement yesRadio;
    @FindBy(xpath = "//div[@class='govuk-radios']//input[@id='response-1']")
    WebElement noRadio;

    public void clickNextStepButton() {
        Reporter.log("Clicking on next " + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }

    public void selectImmigrationStatus(String status) {

        switch (status) {
            case "yes":
                Reporter.log("Clicking on Yes : " + status + " to " + yesRadio.toString());
                clickOnElement(yesRadio);
                break;
            case "no":
                Reporter.log("Clicking on No : " + status + " to " + noRadio.toString());
                clickOnElement(noRadio);
                break;
        }
    }


}
