package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P3_TutorialPage {
    P3_TutorialPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//*[contains(text(),'Phones & PDAs')])[1]")
    public WebElement phonesPadsButonElement;
}
