package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesFirstClass {
    @Test
    public void PozitiveLoginTesti() {

        //https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

        //        login butonuna bas
        hotelMyCampPage.firstLoginButton.click();
        //    test data username: manager ,

        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        //    test data password : Manager1!

        hotelMyCampPage.passwordEmty.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.bekle(3);
        hotelMyCampPage.loginButonu.click();
        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Assert.assertTrue(hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());


    }
}
