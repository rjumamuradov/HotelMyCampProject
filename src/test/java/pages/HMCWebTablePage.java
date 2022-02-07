package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class  HMCWebTablePage {

    public HMCWebTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//thead//tr[1]//th")
    public List<WebElement> headerBirinciSatirDatalar;


    @FindBy(xpath="//tbody")
    public WebElement tumBodyWebElement;


    @FindBy(xpath = "//tbody//td")
    public List<WebElement> tumBodyDatalariList;

@FindBy(xpath = "((//tbody//tr)[2]//td)[1]")
    public List<WebElement> satirlarListesi;

    public WebElement satirYazdir(int satirNo) {

        String satirDinamicXpath = "//tbody//tr[" + satirNo + "]";

        WebElement satirElementi = Driver.getDriver().findElement(By.xpath(satirDinamicXpath));

        return satirElementi;
    }

}

