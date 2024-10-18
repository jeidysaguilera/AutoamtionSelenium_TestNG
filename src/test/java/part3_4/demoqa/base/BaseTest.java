package part3_4.demoqa.base;

import PageObjectModel.BasePage;
import demoQA.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import static utilities.Utility.UtilityDriver;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homepage;
    protected BasePage basepage;

    private String url="https://demoqa.com/";


    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void OpenDemo(){
        driver.get(url);
        basepage=new BasePage();
        basepage.setDriver(driver);

        UtilityDriver();
        homepage=new HomePage();
    }


    // metodo para capturar Captura de pantalla cuando el metodo falla
    @AfterMethod
    public void takeFaildResultScreenShot(ITestResult testResult){

        if(ITestResult.FAILURE== testResult.getStatus()){
            TakesScreenshot screenshot=(TakesScreenshot) driver;
            File source=  screenshot.getScreenshotAs(OutputType.FILE);
            File destination=new File(System.getProperty("user.dir")+ "/resources/screenshots/ (" + java.time.LocalDate.now() + testResult.getName() + ".png");
            try {
                FileHandler.copy(source,destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located At" + destination);
        }

    }

    @AfterClass
    public void OffPage(){
    //    driver.quit();
    }
}
