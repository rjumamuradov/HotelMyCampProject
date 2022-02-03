package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_NegativeTest {




    @Test
    public void test(){

        //1 ) Bir Class olustur : NegativeTest
        //2) Bir test method olustur NegativeLoginTest()
        //         https://www.hotelmycamp.com/ adresine git

        Driver.getDriver().get("https://www.hotelmycamp.com");

        //        login butonuna bas

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.firstLoginButton.click();

        //    test data username: manager1 ,
        hotelMyCampPage.userName.sendKeys("manager1");
        //    test data password : manager1!
        hotelMyCampPage.passwordEmty.sendKeys("manager1");
        hotelMyCampPage.loginButonu.click();

        //    Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());


    }
}
