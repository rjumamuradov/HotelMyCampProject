package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_SatirSayisi {
@Test
        public void test() throws IOException {
    String path="src/test/java/resources/ulkeler.xlsx";
    FileInputStream fis = new FileInputStream(path);
    Workbook workbook = WorkbookFactory.create(fis);
    int sayfa1SatirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();
    System.out.println("sayfa1SatirSayisi = " + sayfa1SatirSayisi);
    int Sayfa1FizikiKullanilanSayisi=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
    System.out.println("Sayfa1FizikiKullanilanSayisi = " + Sayfa1FizikiKullanilanSayisi);



}
@Test
    public void sayfa2Testi() throws IOException {
    String path="src/test/java/resources/ulkeler.xlsx";
    FileInputStream fis = new FileInputStream(path);
    Workbook workbook = WorkbookFactory.create(fis);
    int sayfa2SatirSayisi=workbook.getSheet("Sayfa2").getLastRowNum();
    System.out.println("sayfa2SatirSayisi = " + sayfa2SatirSayisi);
    int Sayfa2FizikiKullanilanSayisi=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();
    System.out.println("Sayfa2FizikiKullanilanSayisi = " + Sayfa2FizikiKullanilanSayisi);


}


}
