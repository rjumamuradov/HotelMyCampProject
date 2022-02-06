package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemogaPage {
  public   DemogaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
