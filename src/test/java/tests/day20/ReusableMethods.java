package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReusableMethods {
    public static Map<String, String> mapOlustur(String path, String sayfaAdi) {
        Map<String ,String> excelMap = new HashMap();
        Workbook workbook=null;

        try {
            FileInputStream fis = new FileInputStream(path);
          workbook = WorkbookFactory.create(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int satirSayisi=workbook.getSheet(sayfaAdi).getLastRowNum();
        for (int i=0; i<=satirSayisi;i++){

        }


        return excelMap;

    }

    public Cell hucreGetir(String path, String sayfaIsmi, int satirIndex, int hucreIndex){
        Cell cell;
        try {
            FileInputStream fileInputStream= new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            cell=workbook.getSheet(sayfaIsmi).getRow(satirIndex).getCell(hucreIndex);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }




}
