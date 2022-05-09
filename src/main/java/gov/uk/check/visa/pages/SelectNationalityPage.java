package gov.uk.check.visa.pages;
/* 
 Created by Kalpesh Patel
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void selectNationality(String nationality){
        Reporter.log("Selecting on Yes " + nationalityDropDownList.toString());
        selectByValueFromDropDown(nationalityDropDownList,nationality);
    }

    public void clickNextStepButton(){
        Reporter.log("Continue on Yes " + continueButton.toString());
        clickOnElement(continueButton);
    }


}
