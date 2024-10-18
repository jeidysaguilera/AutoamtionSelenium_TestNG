package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {

    WebDriver driver;


    @BeforeClass
    public void SetUp(){

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void UpDown(){
        //driver.quit();
    }

    @Test
    public void LoginOrange() throws InterruptedException {

        Thread.sleep(2000);
        WebElement user=driver.findElement(By.name("username"));
        user.sendKeys("Admin");

        WebElement pass=driver.findElement(By.name("password"));
        pass.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(4000);
        String tag=driver.findElement(By.tagName("h6")).getText();

        Assert.assertEquals(tag,"Dashboard");
    }
}
