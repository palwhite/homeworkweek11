package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    public static String baseurl="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setuptest(){
        openwindow(baseurl);
    }

    @Test
    public void test(){

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();

        String actualdashboard=driver.findElement(By.tagName("h6")).getText();
        String expecteddashboard="Dashboard";
        Assert.assertEquals("validation",expecteddashboard,actualdashboard);
        System.out.println(actualdashboard);

    }

    @After
    public void teardown(){
        //closewindow();
    }
}
