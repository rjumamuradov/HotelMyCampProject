package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02PageIlkClass {
    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get("https://www.amazon.com");


        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        Driver.closerDriver();


    }

    @Test
    public void test1() throws InterruptedException {

        Driver.getDriver().get("http://www.batman.com");
        Driver.closerDriver();

    }
}
