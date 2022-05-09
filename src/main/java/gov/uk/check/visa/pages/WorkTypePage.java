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

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @FindBy(xpath = "//div[@class='govuk-radios']//div/input")
    List<WebElement> selectJobtypeList;

    public void selectJobType(String job) {
        Reporter.log("Selecting job type : "+ job+ " to " + selectJobtypeList.toString());
        int size = selectJobtypeList.size();
        for (int i = 0; i < size; i++) {
            String val = selectJobtypeList.get(i).getAttribute("value");
            if (val.equalsIgnoreCase(job))
                selectJobtypeList.get(i).click();
            break;
        }
    }

    public void clickNextStepButton() {
        Reporter.log("Clicking on Next : " + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}
