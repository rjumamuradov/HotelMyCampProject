package tests.day18.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;

public class C01_WebTableDinamicLocate {

HMCWebTablePage hmcWebTablePage;


    @Test
    public void satirTesti(){

hmcWebTablePage=new HMCWebTablePage();
        WebElement ucuncusatir=hmcWebTablePage.satirYazdir(7);

    }

    @Test
    public void Testi1(){


    }

    @Test
    public void Testi(){


    }
}
