package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseurl="https://demo.nopcommerce.com/";

    @Before
    public void setupb(){
        openbrowser(baseurl);
    }

    @Test
    public void topmenutest(){

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
        String actualcomputeritle = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        String expectedcomputertitle= "Computers";
        Assert.assertEquals("Computers validation",expectedcomputertitle,actualcomputeritle);

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        String actualelectronicsitle = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        String expectedelectronicstitle= "Electronics";
        Assert.assertEquals("Electronics validation",expectedelectronicstitle,actualelectronicsitle);

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        String actualapparelitle = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        String expectedappareltitle= "Apparel";
        Assert.assertEquals("Apparel  validation",expectedappareltitle,actualapparelitle);

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        String actualdigitaldownloadslitle = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        String expecteddigitaldownlodsltitle= "Digital downloads";
        Assert.assertEquals("Digital downloads validation",expecteddigitaldownlodsltitle,actualdigitaldownloadslitle);

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        String actualbookstitle = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        String expectedbookstitle= "Books";
        Assert.assertEquals("Books  validation",expectedbookstitle,actualbookstitle);

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        String actualjewelrytitle = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        String expectedjewelrytitle= "Jewelry";
        Assert.assertEquals("Jewelry validation",expectedjewelrytitle,actualjewelrytitle);

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        String actualgiftcardstitle = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        String expectedgiftcardstitle= "Gift Cards";
        Assert.assertEquals("Gift Cards  validation",expectedgiftcardstitle,actualgiftcardstitle);

        System.out.println("Mission Successful..!!!");

    }

    @After
    public void teardown(){
        //closebrowser();
    }
}
