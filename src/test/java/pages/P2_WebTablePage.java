package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P2_WebTablePage {
    P2_WebTablePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }


}
