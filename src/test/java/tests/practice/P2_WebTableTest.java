package tests.practice;

import org.testng.annotations.Test;
import utilities.Driver;

public class P2_WebTableTest {
    @Test
    public void test(){
        //go to url : https://en.wikipedia.org/wiki/Dell
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Dell");
        //   go to table which name is 'List of companies acquired by Dell Inc.'

        //   print row 4 of the table on console
        //   also print on console the 2nd and 3rd elements (middle 2 elements) in line 5
        //   ( 2nd and 3rd elements : November 2, Cloud integration leader)




    }
}
