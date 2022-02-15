package tests.day21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;

public class C02_WindowHandleReusablemethods {

    @Test
    public void test(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();
        System.out.println("ilkSayfaWindowHandle = " + ilkSayfaWindowHandle);
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> handleSeti=Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandle="";
        for (String each : handleSeti) {
            if (!each.equals(ilkSayfaWindowHandle)){
                ikinciSayfaHandle=each;
            }
        }
        System.out.println("ikinciSayfaHandle = " + ikinciSayfaHandle);
        Driver.getDriver().switchTo().window(ikinciSayfaHandle);
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle,"yokk");


    }
    @Test
    public void windowhandleTesti() throws IOException {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusableMethods.switchToWindow("New Window");
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle,"yokk");

        ReusableMethods.getScreenshot("WindowSwitch");
        Driver.closeDriver();
    }
}
