package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {


    @Test
    public void test() {

        Driver.getDriver().get("https://www.amazon.com");

        //boolean titleTest=Driver.getDriver().getTitle().contains("Amazon.com");
        //        Assert.assertTrue(titleTest);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
        //Driver.getDriver().get("https://www.bestbuy.com");
        Driver.closerDriver();
    }

    @Test
    public void testDc() {
        Driver.getDriver().get("https://www.bestbuy.com");


    }
}
