package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
   public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
   }
   @FindBy(xpath="//a[text()='Log in']")
           public WebElement firstLoginButton;


   @FindBy(xpath="//input[@id='UserName']")

    public WebElement userName;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordEmty;

    @FindBy(xpath = "//input[@id='btnSubmit']")
  public WebElement loginButonu;



}
