package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

public class C01_WebTableDinamicLocate {

HMCWebTablePage hmcWebTablePage;


    @Test
    public void satirTesti(){

hmcWebTablePage=new HMCWebTablePage();
        WebElement ucuncusatir=hmcWebTablePage.satirYazdur(7);

    }

    @Test
    public void Testi1(){


    }

    @Test
    public void Testi(){


    }
}
