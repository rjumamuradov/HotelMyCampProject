package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;


public class Driver {

 private   Driver(){  //obje olusturmayi engellemek icin

    }
    public static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {



            switch(ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver=new OperaDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();


                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;

               //case "explorer":
               //    WebDriverManager.explorerdriver().setup();
               //    driver = new ExplorerDriver();
               //    break;


            }

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }

    public static void closerDriver() {
  if (driver!=null){
        driver.quit();
      driver = null;
     }


    }
}
