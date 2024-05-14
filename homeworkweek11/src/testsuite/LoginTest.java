package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseurl="https://demo.nopcommerce.com/";

    @Before
    public void setuplink() {
        openbrowser(baseurl);
    }

    @Test
    public void Login(){

         driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();

         String expectedmessage= driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
         String actualmessage="Welcome, Please Sign In!";
         Assert.assertEquals("validation",expectedmessage,actualmessage);
         System.out.println(expectedmessage);

         driver.findElement(By.xpath("//input[@class='email']")).sendKeys("123@gmail.com");
         driver.findElement(By.id("Password")).sendKeys("123456");
         driver.findElement(By.xpath("//button[text()='Log in']")).click();
//         String errormessage=driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']")).getText();
//         System.out.println(errormessage);

        driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
    }

    @After
    public void teatdown(){
       // closebrowser();
    }
}
