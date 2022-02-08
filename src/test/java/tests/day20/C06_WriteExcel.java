package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {


    @Test
    public void test() throws IOException {
        String path="src/test/java/resources/ulkeler.xlsx";


        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis);

        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");
        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1000000");



        FileOutputStream fos= new FileOutputStream(path);
        workbook.write(fos);
    }

}
