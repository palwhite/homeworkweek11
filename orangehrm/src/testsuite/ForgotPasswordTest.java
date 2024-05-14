package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    public static String baseurl="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setuptest(){
        openwindow(baseurl);
    }

    @Test
    public void test(){

        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
        String actualpasswordmessage=driver.findElement(By.tagName("h6")).getText();
        String expectedpasswordmessage="Reset Password";
        Assert.assertEquals(expectedpasswordmessage,actualpasswordmessage);
        System.out.println(actualpasswordmessage);

    }

    @After
    public void teardown(){
        //closewindow();
    }
}
