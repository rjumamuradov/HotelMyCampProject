package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

public class C01_WebTableDinamicLocate {

HMCWebTablePage hmcWebTablePage;
HotelMyCampPage hotelMyCampPage;


    @Test
    public void satirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        hmcWebTablePage=new HMCWebTablePage();
        WebElement ucuncusatir=hmcWebTablePage.satirGetir(7);

    }

    @Test
    public void Testi1(){


    }

    @Test
    public void Testi(){


    }
}
