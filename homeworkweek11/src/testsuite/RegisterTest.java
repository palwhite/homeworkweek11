package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {

    String baseurl="https://demo.nopcommerce.com/";

    @Before
    public void setupb(){
        openbrowser(baseurl);
    }

    @Test
    public void register(){

        driver.findElement(By.className("ico-register")).click();

        String actualregistermessage=driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        String expectedregistermessage="Register";
        Assert.assertEquals("Register validation",expectedregistermessage,actualregistermessage);

        driver.findElement(By.id("gender-female")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Nirali");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.xpath("//option[text()='30']")).click();
        driver.findElement(By.xpath("//option[text()='June']")).click();
        driver.findElement(By.xpath("//option[text()='1995']")).click();
        driver.findElement(By.id("Email")).sendKeys("123@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("CodeBuster");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("123456");
        driver.findElement(By.id("register-button")).click();

        String actualresultmessgae=driver.findElement(By.className("result")).getText();
        String expectedresultmessgae="Your registration completed";
        Assert.assertEquals("Your registration completed validation",expectedresultmessgae,actualresultmessgae);

    }

    @After
    public void teardown(){
        //closebrowser();
    }
}
