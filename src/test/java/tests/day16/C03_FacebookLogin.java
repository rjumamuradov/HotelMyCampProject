package tests.day16;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.Facebookpage;
import utilities.Driver;

public class C03_FacebookLogin {
    Facebookpage facebookPage = new Facebookpage();

    @Test
    public void testFacebook() {
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://facebook.com");


        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker = new Faker();
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passKutusu.sendKeys(faker.internet().password());

        facebookPage.loginButonu.click();
        //4- Basarili giris yapilamadigini test edin
    }


}
