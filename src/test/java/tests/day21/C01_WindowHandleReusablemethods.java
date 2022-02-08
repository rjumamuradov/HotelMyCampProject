package tests.day21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.Set;

public class C01_WindowHandleReusablemethods {


    @Test
    public void test(){

        Driver.getDriver().get("https://demoqa.com/browser-windows");
        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();
        System.out.println("ilkSayfaWindowHandle = " + ilkSayfaWindowHandle);
        Driver.getDriver().findElement(By.xpath("//button[@id='tabButton']")).click();
        Set<String> handleSeti=Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandle="";
        for (String each : handleSeti) {
            if (!each.equals(ilkSayfaWindowHandle)){
                ikinciSayfaHandle=each;
            }
        }
        System.out.println("ikinciSayfaHandle = " + ikinciSayfaHandle);
        Driver.getDriver().switchTo().window(ikinciSayfaHandle);
        String expectedTitle="new Tab";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle,"yokk");


    }

}
