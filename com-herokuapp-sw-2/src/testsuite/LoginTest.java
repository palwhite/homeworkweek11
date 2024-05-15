package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseurl="http://the-internet.herokuapp.com/login";

    @Before
    public void setuptest(){
        openbrowser(baseurl);
    }

    @Test
    public void test(){
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();

        driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();

        driver.findElement(By.id("username")).sendKeys("tomsmith1");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();
        String actualflasherror=driver.findElement(By.id("flash")).getText();
        System.out.println(actualflasherror);
        String expectedflasherror="Your username is invalid!\n" +
                "×";
        Assert.assertEquals("email error validation",expectedflasherror,actualflasherror);

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.tagName("button")).click();
        String actualerror=driver.findElement(By.id("flash")).getText();
        System.out.println(actualerror);
        String expectederror="Your password is invalid!\n" +
                "×";
        Assert.assertEquals("password error validation",expectederror,actualerror);
    }

    @After
    public void teardown(){
       // closebrowser();
    }

}
