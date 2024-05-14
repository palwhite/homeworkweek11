package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public void openwindow(String url){

        driver=new ChromeDriver();
        driver.get(url);
        driver.getTitle();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    }

    public void closewindow(){
        driver.quit();
    }
}
