package gov.uk.check.visa.pages;
/* 
 Created by Kalpesh Patel
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;

    public void selectLengthOfStay(String moreOrLess) {

        switch (moreOrLess) {
            case "6 months or less":
                clickOnElement(lessThanSixMonths);
                break;
            case "longer than 6 months":
                clickOnElement(moreThanSixMonths);
        }
    }

    public void clickNextStepButton() {
        Reporter.log("Clicking on next : " + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}



