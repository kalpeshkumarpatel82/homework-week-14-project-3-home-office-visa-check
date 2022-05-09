package gov.uk.check.visa.pages;
/* 
 Created by Kalpesh Patel
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {
    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//section[@class='govuk-!-margin-bottom-6']/a[1]")
    WebElement startNow;

    public void clickStartNow(){
        Reporter.log("Clicking on Start : " + startNow.toString());
        clickOnElement(startNow);
    }
}
