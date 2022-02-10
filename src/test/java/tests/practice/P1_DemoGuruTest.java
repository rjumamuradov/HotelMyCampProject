package tests.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P1_DemoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P1_DemoGuruTest {


    @Test
    public void test() {

        //http://demo.guru99.com/test/drag_drop.html url e git
        Driver.getDriver().get(ConfigReader.getProperty("demoGuruUrl"));
        P1_DemoGuruPage p1_demoGuruPage = new P1_DemoGuruPage();
        Actions actions = new Actions(Driver.getDriver());

        //DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
        actions.dragAndDrop(p1_demoGuruPage.bankButton, p1_demoGuruPage.debitsideAccount)

                //CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
                .dragAndDrop(p1_demoGuruPage.salesButton, p1_demoGuruPage.creditSideAccount)
                //DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
                .dragAndDrop(p1_demoGuruPage.first5000Button, p1_demoGuruPage.debitsideAmount)
                //CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
                .dragAndDrop(p1_demoGuruPage.second5000Button, p1_demoGuruPage.creditSideAmount).sendKeys(Keys.PAGE_DOWN).perform();
        //Perfect butonun goruntulendigini dogrulayin
        Assert.assertTrue(p1_demoGuruPage.perfectText.isDisplayed());

    }

}
