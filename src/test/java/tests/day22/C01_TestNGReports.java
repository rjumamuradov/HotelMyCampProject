package tests.day22;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_TestNGReports extends TestBaseRapor {

    @Test
    public void windowhandleTesti() throws IOException {
        extentTest=extentReports.createTest("window Handle","title ile 2.sayfaya gectik");

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("herokuapp sayfasina gidildi");

        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        extentTest.info("yeni window linkine tiklandi");

        ReusableMethods.switchToWindow("New Window");
        extentTest.info("reusable method kullanarak 2. sayfaya gecildi");


        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle,"yokk");
        extentTest.pass("titlenin beklenen degerle ayni oldugu test edildi");

        ReusableMethods.getScreenshot("WindowSwitch");

        Driver.closeDriver();
    }
}
