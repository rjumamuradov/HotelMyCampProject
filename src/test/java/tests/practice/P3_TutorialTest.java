package tests.practice;

import org.testng.annotations.Test;
import utilities.Driver;

public class P3_TutorialTest {

    @Test
    public void test() {
        //~ url'ye gidin: "http://tutorialsninja.com/demo/index.php?route=common/home"
        Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");

//~ Phones & PDAs e tıklayın
//~ telefonların marka adını al
//~ tüm elemanlar için ekle düğmesine tıklayın
//~ siyah toplam eklenen sepet düğmesine tıklayın
//~ listenin isimlerini sepetten al
//~ görüntülenen listeden ve sepet listesinden isimleri karşılaştırın
//~ goruntulenen listede toplam fiyatin $583.19 oldugunu test edin
    }
}
