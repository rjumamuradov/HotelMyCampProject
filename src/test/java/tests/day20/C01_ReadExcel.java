package tests.day20;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {


    @Test
    public void test() throws IOException {
        FileInputStream fis=new FileInputStream("src/test/java/resources/ulkeler.xlsx");
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet= workbook.getSheet("Sayfa1");
        Row row= sheet.getRow(4);
        Cell cell=row.getCell(0);
        System.out.println("cell = " + cell);

        String expectedData = "Andorra";
        Assert.assertEquals(cell.getStringCellValue(),expectedData);

    }
}
