package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlisKeyKullanimi {

@Test
    public void test() {
    Driver.getDriver().get(ConfigReader.getProperty("HMCURl"));

    // eger key olarak girdigimiz String configuration.properties dosyasinda yoksa
    // Ornegin : HMCUrl yerine HMCurl yazarsak,
    // ConfigReader.getProperty() o key'i bulamaz
    // ve nullPointerException firlatir




}

}
