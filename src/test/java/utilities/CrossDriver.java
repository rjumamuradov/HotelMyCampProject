package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class CrossDriver {


    private   CrossDriver(){  //obje olusturmayi engellemek icin

    }
   private static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        browser = browser == null ? ConfigReader.getProperty("browser") : browser;
        if (driver == null) {
            // bu if sayesinde kod calisirken bir kere new keyword ile driver olusturulaca
            // diger kullanimlarda new devreye girmeyecek


            switch(browser){
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
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();


            }

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }

    public static void closeDriver() {
        if (driver!=null){
            driver.quit();
            driver = null;
        }


    }
}
